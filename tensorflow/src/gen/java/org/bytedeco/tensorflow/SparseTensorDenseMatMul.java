// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Multiply SparseTensor (of rank 2) "A" by dense matrix "B".
 * 
 *  No validity checking is performed on the indices of A.  However, the following
 *  input format is recommended for optimal behavior:
 * 
 *  if adjoint_a == false:
 *    A should be sorted in lexicographically increasing order.  Use SparseReorder
 *    if you're not sure.
 *  if adjoint_a == true:
 *    A should be sorted in order of increasing dimension 1 (i.e., "column major"
 *    order instead of "row major" order).
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * a_indices: 2-D.  The {@code indices} of the {@code SparseTensor}, size {@code [nnz, 2]} Matrix.
 *  * a_values: 1-D.  The {@code values} of the {@code SparseTensor}, size {@code [nnz]} Vector.
 *  * a_shape: 1-D.  The {@code shape} of the {@code SparseTensor}, size {@code [2]} Vector.
 *  * b: 2-D.  A dense Matrix.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * adjoint_a: Use the adjoint of A in the matrix multiply.  If A is complex, this
 *  is transpose(conj(A)).  Otherwise it's transpose(A).
 *  * adjoint_b: Use the adjoint of B in the matrix multiply.  If B is complex, this
 *  is transpose(conj(B)).  Otherwise it's transpose(B).
 * 
 *  Returns:
 *  * {@code Output}: The product tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseTensorDenseMatMul extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseTensorDenseMatMul(Pointer p) { super(p); }

  /** Optional attribute setters for SparseTensorDenseMatMul */
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
  
    /** Use the adjoint of A in the matrix multiply.  If A is complex, this
     *  is transpose(conj(A)).  Otherwise it's transpose(A).
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs AdjointA(@Cast("bool") boolean x);

    /** Use the adjoint of B in the matrix multiply.  If B is complex, this
     *  is transpose(conj(B)).  Otherwise it's transpose(B).
     * 
     *  Defaults to false */
    public native @ByVal Attrs AdjointB(@Cast("bool") boolean x);

    public native @Cast("bool") boolean adjoint_a_(); public native Attrs adjoint_a_(boolean setter);
    public native @Cast("bool") boolean adjoint_b_(); public native Attrs adjoint_b_(boolean setter);
  }
  public SparseTensorDenseMatMul(@Const @ByRef Scope scope, @ByVal Input a_indices, @ByVal Input a_values,
                          @ByVal Input a_shape, @ByVal Input b) { super((Pointer)null); allocate(scope, a_indices, a_values, a_shape, b); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a_indices, @ByVal Input a_values,
                          @ByVal Input a_shape, @ByVal Input b);
  public SparseTensorDenseMatMul(@Const @ByRef Scope scope, @ByVal Input a_indices, @ByVal Input a_values,
                          @ByVal Input a_shape, @ByVal Input b,
                          @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, a_indices, a_values, a_shape, b, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input a_indices, @ByVal Input a_values,
                          @ByVal Input a_shape, @ByVal Input b,
                          @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs AdjointA(@Cast("bool") boolean x);
  public static native @ByVal Attrs AdjointB(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native SparseTensorDenseMatMul operation(Operation setter);
  public native @ByRef Output product(); public native SparseTensorDenseMatMul product(Output setter);
}
