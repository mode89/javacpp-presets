// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaTextureDesc_v2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaTextureDesc_v2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaTextureDesc_v2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaTextureDesc_v2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaTextureDesc_v2 position(long position) {
        return (cudaTextureDesc_v2)super.position(position);
    }
    @Override public cudaTextureDesc_v2 getPointer(long i) {
        return new cudaTextureDesc_v2((Pointer)this).offsetAddress(i);
    }

    /**
     * Texture address mode for up to 3 dimensions
     */
    public native @Cast("cudaTextureAddressMode") int addressMode(int i); public native cudaTextureDesc_v2 addressMode(int i, int setter);
    @MemberGetter public native @Cast("cudaTextureAddressMode*") IntPointer addressMode();
    /**
     * Texture filter mode
     */
    public native @Cast("cudaTextureFilterMode") int filterMode(); public native cudaTextureDesc_v2 filterMode(int setter);
    /**
     * Texture read mode
     */
    public native @Cast("cudaTextureReadMode") int readMode(); public native cudaTextureDesc_v2 readMode(int setter);
    /**
     * Perform sRGB->linear conversion during texture read
     */
    public native int sRGB(); public native cudaTextureDesc_v2 sRGB(int setter);
    /**
     * Texture Border Color
     */
    public native float borderColor(int i); public native cudaTextureDesc_v2 borderColor(int i, float setter);
    @MemberGetter public native FloatPointer borderColor();
    /**
     * Indicates whether texture reads are normalized or not
     */
    public native int normalizedCoords(); public native cudaTextureDesc_v2 normalizedCoords(int setter);
    /**
     * Limit to the anisotropy ratio
     */
    public native @Cast("unsigned int") int maxAnisotropy(); public native cudaTextureDesc_v2 maxAnisotropy(int setter);
    /**
     * Mipmap filter mode
     */
    public native @Cast("cudaTextureFilterMode") int mipmapFilterMode(); public native cudaTextureDesc_v2 mipmapFilterMode(int setter);
    /**
     * Offset applied to the supplied mipmap level
     */
    public native float mipmapLevelBias(); public native cudaTextureDesc_v2 mipmapLevelBias(float setter);
    /**
     * Lower end of the mipmap level range to clamp access to
     */
    public native float minMipmapLevelClamp(); public native cudaTextureDesc_v2 minMipmapLevelClamp(float setter);
    /**
     * Upper end of the mipmap level range to clamp access to
     */
    public native float maxMipmapLevelClamp(); public native cudaTextureDesc_v2 maxMipmapLevelClamp(float setter);
    /**
     * Disable any trilinear filtering optimizations.
     */
    public native int disableTrilinearOptimization(); public native cudaTextureDesc_v2 disableTrilinearOptimization(int setter);
    /**
     * Enable seamless cube map filtering.
     */
    public native int seamlessCubemap(); public native cudaTextureDesc_v2 seamlessCubemap(int setter);
}
