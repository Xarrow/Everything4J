package org.helixcs.everything4j;

import com.sun.jna.Library;
import com.sun.jna.WString;

import java.nio.Buffer;

public interface EverythingNative extends Library {

    public static final int EVERYTHING_OK = 0;
    public static final int EVERYTHING_ERROR_MEMORY = 1;
    public static final int EVERYTHING_ERROR_IPC = 2;
    public static final int EVERYTHING_ERROR_REGISTERCLASSEX = 3;
    public static final int EVERYTHING_ERROR_CREATEWINDOW = 4;
    public static final int EVERYTHING_ERROR_CREATETHREAD = 5;
    public static final int EVERYTHING_ERROR_INVALIDINDEX = 6;
    public static final int EVERYTHING_ERROR_INVALIDCALL = 7;


    public int Everything_SetSearchW(WString lpSearchString);


    public void Everything_SetMatchPath(boolean bEnable);


    public void Everything_SetMatchCase(boolean bEnable);


    public void Everything_SetMatchWholeWord(boolean bEnable);


    public void Everything_SetRegex(boolean bEnable);


    public void Everything_SetMax(int dwMax);


    public void Everything_SetOffset(int dwOffset);


    public boolean Everything_GetMatchPath();


    public boolean Everything_GetMatchCase();


    public boolean Everything_GetMatchWholeWord();


    public boolean Everything_GetRegex();


    public int Everything_GetMax();


    public int Everything_GetOffset();


    public WString Everything_GetSearchW();


    public int Everything_GetLastError();


    public boolean Everything_QueryW(boolean bWait);

    public boolean Everything_Query(boolean bWait);

    public void Everything_SortResultsByPath();


    public int Everything_GetNumFileResults();


    public int Everything_GetNumFolderResults();


    public int Everything_GetNumResults();


    public int Everything_GetTotFileResults();


    public int Everything_GetTotFolderResults();


    public int Everything_GetTotResults();


    public boolean Everything_IsVolumeResult(int nIndex);


    public boolean Everything_IsFolderResult(int nIndex);


    public boolean Everything_IsFileResult(int nIndex);


    public void Everything_GetResultFullPathNameW(int nIndex, Buffer lpString, int nMaxCount);


    public void Everything_Reset();

}