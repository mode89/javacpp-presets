// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Formats a string template using a list of tensors.
 * 
 *  Formats a string template using a list of tensors, pretty-printing tensor summaries.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: The list of tensors to format into the placeholder string.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * template_: A string, the template to format tensor summaries into.
 *  * placeholder: A string, at each placeholder in the template a subsequent tensor summary will be inserted.
 *  * summarize: When formatting the tensor summaries print the first and last summarize entries of each tensor dimension.
 * 
 *  Returns:
 *  * {@code Output}: = The resulting string scalar. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringFormat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringFormat(Pointer p) { super(p); }

  /** Optional attribute setters for StringFormat */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** A string, the template to format tensor summaries into.
     * 
     *  Defaults to "%s" */
    
    ///
    public native @ByVal Attrs Template(@StringPiece BytePointer x);
    public native @ByVal Attrs Template(@StringPiece String x);

    /** A string, at each placeholder in the template a subsequent tensor summary will be inserted.
     * 
     *  Defaults to "%s" */
    
    ///
    public native @ByVal Attrs Placeholder(@StringPiece BytePointer x);
    public native @ByVal Attrs Placeholder(@StringPiece String x);

    /** When formatting the tensor summaries print the first and last summarize entries of each tensor dimension.
     * 
     *  Defaults to 3 */
    public native @ByVal Attrs Summarize(@Cast("tensorflow::int64") long x);

    public native @StringPiece BytePointer template_(); public native Attrs template_(BytePointer setter);
    public native @StringPiece BytePointer placeholder_(); public native Attrs placeholder_(BytePointer setter);
    public native @Cast("tensorflow::int64") long summarize_(); public native Attrs summarize_(long setter);
  }
  public StringFormat(@Const @ByRef Scope scope, @ByVal InputList inputs) { super((Pointer)null); allocate(scope, inputs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs);
  public StringFormat(@Const @ByRef Scope scope, @ByVal InputList inputs,
               @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, inputs, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs,
               @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Template(@StringPiece BytePointer x);
  public static native @ByVal Attrs Template(@StringPiece String x);
  public static native @ByVal Attrs Placeholder(@StringPiece BytePointer x);
  public static native @ByVal Attrs Placeholder(@StringPiece String x);
  public static native @ByVal Attrs Summarize(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native StringFormat operation(Operation setter);
  public native @ByRef Output output(); public native StringFormat output(Output setter);
}
