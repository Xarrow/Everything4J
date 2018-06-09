package org.helixcs.everything4j;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * Author : Helixcs
 * Email : <p>zhangjian12424#gmail.com</p>
 */
public class EverythingUtils {

    public static final Integer JDK64BIT = 64;

    public static final Integer JDK32BIT = 32;

    /**
     * Return current JDK Bit
     *
     * @return 32/64
     */
    public static int currentJDKBit() {
        return Integer.parseInt((String) System.getProperties().get("sun.arch.data.model"));
    }

    /**
     * Generator DLL instance
     *
     * @param dllPath the path of dll
     * @param tClass  target interface which extend "com.sun.jna.Library"
     * @param <T>     T
     * @return
     */
    public static <T extends Library> T makeDllInstance(String dllPath, Class<T> tClass) {
        return Native.loadLibrary(dllPath, tClass);
    }

}
