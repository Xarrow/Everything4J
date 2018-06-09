package org.helixcs.everything4j;

import com.sun.jna.WString;

import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Helixcs
 * Email : <p>zhangjian12424#gmail.com</p>
 */
public class Everything4J {
    private static  EverythingNative everythingInstance;
    static {
        if (EverythingUtils.JDK64BIT==EverythingUtils.currentJDKBit()){
            everythingInstance = EverythingUtils.makeDllInstance("Everything64.dll",EverythingNative.class);
        }else if(EverythingUtils.JDK32BIT==EverythingUtils.currentJDKBit()){
            everythingInstance = EverythingUtils.makeDllInstance("Everything32.dll",EverythingNative.class);
        }
    }

    public static  Map<String, Object> showSearchResult(String searchKey) {
        everythingInstance.Everything_SetSearchW(new WString(searchKey));
        everythingInstance.Everything_QueryW(true);
        Buffer p = CharBuffer.allocate(260);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < everythingInstance.Everything_GetNumResults(); i++) {

            everythingInstance.Everything_GetResultFullPathNameW(i, p, 260);

            char[] buf = (char[]) p.array();
            result.add(new String(buf).trim());
        }

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result", result);
        return resultMap;
    }

}
