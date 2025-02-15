// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;

// #endif  // B2_INTRUSIVE_LIST_VALIDATE

/** b2IntrusiveListNode is used to implement an intrusive doubly-linked
 *  list.
 * 
 *  For example:
 * 
 *  class MyClass {
 *  public:
 *  	MyClass(const char *msg) : m_msg(msg) {}
 *  	const char* GetMessage() const { return m_msg; }
 *  	B2_INTRUSIVE_LIST_GET_NODE(m_node);
 *  	B2_INTRUSIVE_LIST_NODE_GET_CLASS(MyClass, m_node);
 *  private:
 *  	b2IntrusiveListNode m_node;
 *  	const char *m_msg;
 *  };
 * 
 *  int main(int argc, char *argv[]) {
 *  	b2IntrusiveListNode list; // NOTE: type is NOT MyClass
 *  	MyClass a("this");
 *  	MyClass b("is");
 *  	MyClass c("a");
 *  	MyClass d("test");
 *  	list.InsertBefore(a.GetListNode());
 *  	list.InsertBefore(b.GetListNode());
 *  	list.InsertBefore(c.GetListNode());
 *  	list.InsertBefore(d.GetListNode());
 *  	for (b2IntrusiveListNode* node = list.GetNext();
 *  		 node != list.GetTerminator(); node = node->GetNext()) {
 *  		MyClass *cls = MyClass::GetInstanceFromListNode(node);
 *  		printf("%s\n", cls->GetMessage());
 *  	}
 *  	return 0;
 *  } */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2IntrusiveListNode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2IntrusiveListNode(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2IntrusiveListNode(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2IntrusiveListNode position(long position) {
        return (b2IntrusiveListNode)super.position(position);
    }
    @Override public b2IntrusiveListNode getPointer(long i) {
        return new b2IntrusiveListNode((Pointer)this).offsetAddress(i);
    }

	/** Initialize the node. */
	public b2IntrusiveListNode() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** If the node is in a list, remove it from the list. */

	/** Insert this node after the specified node. */
	public native void InsertAfter(b2IntrusiveListNode node);

	/** Insert this node before the specified node. */
	public native void InsertBefore(b2IntrusiveListNode node);

	/** Get the terminator of the list. */
	public native @Const b2IntrusiveListNode GetTerminator();

	/** Remove this node from the list it's currently in. */
	public native b2IntrusiveListNode Remove();

	/** Determine whether this list is empty or the node isn't in a list. */
	public native @Cast("bool") boolean IsEmpty();

	/** Determine whether this node is in a list or the list contains nodes. */
	public native @Cast("bool") boolean InList();

	/** Calculate the length of the list. */
	public native @Cast("uint32") long GetLength();

	/** Get the next node in the list. */
	public native b2IntrusiveListNode GetNext();

	/** Get the previous node in the list. */
	public native b2IntrusiveListNode GetPrevious();

	/** If B2_INTRUSIVE_LIST_VALIDATE is 1 perform a very rough validation
	 *  of all nodes in the list. */
	public native @Cast("bool") boolean ValidateList();

	/** Determine whether the specified node is present in this list. */
	public native @Cast("bool") boolean FindNodeInList(b2IntrusiveListNode nodeToFind);
}
