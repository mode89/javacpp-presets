// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_glyph_path_proc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    sk_glyph_path_proc(Pointer p) { super(p); }
    protected sk_glyph_path_proc() { allocate(); }
    private native void allocate();
    public native void call(@Const sk_path_t pathOrNull, @Const sk_matrix_t matrix, Pointer context);
}
