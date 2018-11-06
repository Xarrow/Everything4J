package org.helixcs.everything4j;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.WString;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Helixcs
 * Email : <p>zhangjian12424#gmail.com</p>
 */
public final class Everything4j {
    private static EverythingNative everythingInstance;

    static {
        if (EverythingUtils.JDK64BIT == EverythingUtils.currentJDKBit()) {
            everythingInstance = EverythingUtils.makeDllInstance("Everything64.dll", EverythingNative.class);
        } else if (EverythingUtils.JDK32BIT == EverythingUtils.currentJDKBit()) {
            everythingInstance = EverythingUtils.makeDllInstance("Everything32.dll", EverythingNative.class);
        }
    }


    public static List<String> searchPathList(String searchKey) {
        List<String> searchPathList = new ArrayList<>();
        everythingInstance.Everything_SetSearchW(new WString(searchKey));
        everythingInstance.Everything_QueryW(true);
        int resultNum = everythingInstance.Everything_GetNumResults();
        for (int i = 0; i < resultNum; i++) {
            searchPathList.add(everythingInstance.Everything_GetResultPathA(i).toString());
        }
        return searchPathList;
    }

    public static List<String> searchNameList(String searchKey) {
        List<String> searchNameList = new ArrayList<>();
        everythingInstance.Everything_SetSearchW(new WString(searchKey));
        everythingInstance.Everything_QueryW(true);
        int fileNum = everythingInstance.Everything_GetNumResults();
        for (int i = 0; i < fileNum; i++) {
            String fileName = everythingInstance.Everything_GetResultFileNameW(i).toString();
            System.out.println(fileName);
            searchNameList.add(fileName);
        }
        return searchNameList;
    }

    public static List<String> searchResult(String searchKey) {
        List<String> searchResult = new ArrayList<>();
        everythingInstance.Everything_SetSearchW(new WString(searchKey));
        everythingInstance.Everything_QueryW(true);
//        Buffer p = ByteBuffer.allocate(260);
        Pointer p = new Memory(260);

        int resultNum = everythingInstance.Everything_GetNumResults();
        for (int i = 0; i < resultNum; i++) {
            WString wString = everythingInstance.Everything_GetResultPathA(i);
            searchResult.add(String.valueOf(wString));
            everythingInstance.Everything_GetResultFullPathNameW(i, p, 260);
            System.out.println();
//            byte[] bufferBuf = ((ByteBuffer) p).array();

//            String tmp = new String (bufferBuf);
//            System.out.println("==> "+tmp);
//            if(tmp.contains("_abc")){
//                System.out.println("");
//            }
//            if (bufferBuf.length > 0) {
//                searchResult.add(new String(bufferBuf));
//            }
        }
        return searchResult;
    }

}
