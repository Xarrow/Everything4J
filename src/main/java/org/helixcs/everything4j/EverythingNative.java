package org.helixcs.everything4j;

import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.WString;
import com.sun.jna.win32.StdCallLibrary;

import java.nio.Buffer;

/**
 * code generator by JNAerator in part
 */

public interface EverythingNative extends StdCallLibrary {

    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_OK = 0;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_MEMORY = 1;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_IPC = 2;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_REGISTERCLASSEX = 3;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_CREATEWINDOW = 4;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_CREATETHREAD = 5;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_INVALIDINDEX = 6;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_INVALIDCALL = 7;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_INVALIDREQUEST = 8;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_ERROR_INVALIDPARAMETER = 9;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_NAME_ASCENDING = 1;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_NAME_DESCENDING = 2;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_PATH_ASCENDING = 3;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_PATH_DESCENDING = 4;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_SIZE_ASCENDING = 5;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_SIZE_DESCENDING = 6;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_EXTENSION_ASCENDING = 7;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_EXTENSION_DESCENDING = 8;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_TYPE_NAME_ASCENDING = 9;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_TYPE_NAME_DESCENDING = 10;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_CREATED_ASCENDING = 11;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_CREATED_DESCENDING = 12;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_MODIFIED_ASCENDING = 13;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_MODIFIED_DESCENDING = 14;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_ATTRIBUTES_ASCENDING = 15;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_ATTRIBUTES_DESCENDING = 16;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_FILE_LIST_FILENAME_ASCENDING = 17;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_FILE_LIST_FILENAME_DESCENDING = 18;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_RUN_COUNT_ASCENDING = 19;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_RUN_COUNT_DESCENDING = 20;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_RECENTLY_CHANGED_ASCENDING = 21;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_RECENTLY_CHANGED_DESCENDING = 22;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_ACCESSED_ASCENDING = 23;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_ACCESSED_DESCENDING = 24;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_RUN_ASCENDING = 25;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_SORT_DATE_RUN_DESCENDING = 26;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_FILE_NAME = 0x00000001;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_PATH = 0x00000002;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_FULL_PATH_AND_FILE_NAME = 0x00000004;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_EXTENSION = 0x00000008;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_SIZE = 0x00000010;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_DATE_CREATED = 0x00000020;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_DATE_MODIFIED = 0x00000040;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_DATE_ACCESSED = 0x00000080;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_ATTRIBUTES = 0x00000100;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_FILE_LIST_FILE_NAME = 0x00000200;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_RUN_COUNT = 0x00000400;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_DATE_RUN = 0x00000800;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_DATE_RECENTLY_CHANGED = 0x00001000;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_HIGHLIGHTED_FILE_NAME = 0x00002000;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_HIGHLIGHTED_PATH = 0x00004000;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_REQUEST_HIGHLIGHTED_FULL_PATH_AND_FILE_NAME = 0x00008000;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_TARGET_MACHINE_X86 = 1;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_TARGET_MACHINE_X64 = 2;
    /**
     * <i>native declaration : include\Everything.h</i>
     */
    public static final int EVERYTHING_TARGET_MACHINE_ARM = 3;


    /**
     * write search state<br>
     * Original signature : <code>void Everything_SetSearchW(LPCWSTR)</code><br>
     * <i>native declaration : include\Everything.h:75</i>
     */
    void Everything_SetSearchW(WString lpString);

    /**
     * Original signature : <code>void Everything_SetSearchA(LPCSTR)</code><br>
     * <i>native declaration : include\Everything.h:76</i>
     */
    void Everything_SetSearchA(WString lpString);

    /**
     * Original signature : <code>void Everything_SetMatchPath(BOOL)</code><br>
     * <i>native declaration : include\Everything.h:77</i>
     */
    void Everything_SetMatchPath(boolean bEnable);

    /**
     * Original signature : <code>void Everything_SetMatchCase(BOOL)</code><br>
     * <i>native declaration : include\Everything.h:78</i>
     */
    void Everything_SetMatchCase(boolean bEnable);

    /**
     * Original signature : <code>void Everything_SetMatchWholeWord(BOOL)</code><br>
     * <i>native declaration : include\Everything.h:79</i>
     */
    void Everything_SetMatchWholeWord(boolean bEnable);

    /**
     * Original signature : <code>void Everything_SetRegex(BOOL)</code><br>
     * <i>native declaration : include\Everything.h:80</i>
     */
    void Everything_SetRegex(boolean bEnable);

    /**
     * Original signature : <code>void Everything_SetMax(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:81</i>
     */
    void Everything_SetMax(int dwMax);

    /**
     * Original signature : <code>void Everything_SetOffset(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:82</i>
     */
    void Everything_SetOffset(int dwOffset);

    /**
     * Original signature : <code>void Everything_SetReplyWindow(HWND)</code><br>
     * <i>native declaration : include\Everything.h:83</i>
     */
//    void Everything_SetReplyWindow(EverythingNative.HWND hWnd);

    /**
     * Original signature : <code>void Everything_SetReplyID(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:84</i>
     */
    void Everything_SetReplyID(int dwId);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>void Everything_SetSort(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:85</i>
     */
    void Everything_SetSort(int dwSort);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>void Everything_SetRequestFlags(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:86</i>
     */
    void Everything_SetRequestFlags(int dwRequestFlags);

    /**
     * read search state<br>
     * Original signature : <code>BOOL Everything_GetMatchPath()</code><br>
     * <i>native declaration : include\Everything.h:89</i>
     */
    boolean Everything_GetMatchPath();

    /**
     * Original signature : <code>BOOL Everything_GetMatchCase()</code><br>
     * <i>native declaration : include\Everything.h:90</i>
     */
    boolean Everything_GetMatchCase();

    /**
     * Original signature : <code>BOOL Everything_GetMatchWholeWord()</code><br>
     * <i>native declaration : include\Everything.h:91</i>
     */
    boolean Everything_GetMatchWholeWord();

    /**
     * Original signature : <code>BOOL Everything_GetRegex()</code><br>
     * <i>native declaration : include\Everything.h:92</i>
     */
    boolean Everything_GetRegex();

    /**
     * Original signature : <code>DWORD Everything_GetMax()</code><br>
     * <i>native declaration : include\Everything.h:93</i>
     */
    int Everything_GetMax();

    /**
     * Original signature : <code>DWORD Everything_GetOffset()</code><br>
     * <i>native declaration : include\Everything.h:94</i>
     */
    int Everything_GetOffset();

    /**
     * Original signature : <code>LPCSTR Everything_GetSearchA()</code><br>
     * <i>native declaration : include\Everything.h:95</i>
     */
    WString Everything_GetSearchA();

    /**
     * Original signature : <code>LPCWSTR Everything_GetSearchW()</code><br>
     * <i>native declaration : include\Everything.h:96</i>
     */
    WString Everything_GetSearchW();

    /**
     * Original signature : <code>DWORD Everything_GetLastError()</code><br>
     * <i>native declaration : include\Everything.h:97</i>
     */
    int Everything_GetLastError();

    /**
     * Original signature : <code>HWND Everything_GetReplyWindow()</code><br>
     * <i>native declaration : include\Everything.h:98</i>
     */
//    EverythingNative.HWND Everything_GetReplyWindow();

    /**
     * Original signature : <code>DWORD Everything_GetReplyID()</code><br>
     * <i>native declaration : include\Everything.h:99</i>
     */
    int Everything_GetReplyID();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetSort()</code><br>
     * <i>native declaration : include\Everything.h:100</i>
     */
    int Everything_GetSort();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetRequestFlags()</code><br>
     * <i>native declaration : include\Everything.h:101</i>
     */
    int Everything_GetRequestFlags();

    /**
     * execute query<br>
     * Original signature : <code>BOOL Everything_QueryA(BOOL)</code><br>
     * <i>native declaration : include\Everything.h:104</i>
     */
    boolean Everything_QueryA(boolean bWait);

    /**
     * Original signature : <code>BOOL Everything_QueryW(BOOL)</code><br>
     * <i>native declaration : include\Everything.h:105</i>
     */
    boolean Everything_QueryW(boolean bWait);

    /**
     * query reply<br>
     * Original signature : <code>BOOL Everything_IsQueryReply(UINT, WPARAM, LPARAM, DWORD)</code><br>
     * <i>native declaration : include\Everything.h:108</i>
     */
    boolean Everything_IsQueryReply(int message, EverythingNative.WPARAM wParam, EverythingNative.LPARAM lParam, int dwId);

    /**
     * write result state<br>
     * Original signature : <code>void Everything_SortResultsByPath()</code><br>
     * <i>native declaration : include\Everything.h:111</i>
     */
    void Everything_SortResultsByPath();

    /**
     * read result state<br>
     * Original signature : <code>DWORD Everything_GetNumFileResults()</code><br>
     * <i>native declaration : include\Everything.h:114</i>
     */
    int Everything_GetNumFileResults();

    /**
     * Original signature : <code>DWORD Everything_GetNumFolderResults()</code><br>
     * <i>native declaration : include\Everything.h:115</i>
     */
    int Everything_GetNumFolderResults();

    /**
     * Original signature : <code>DWORD Everything_GetNumResults()</code><br>
     * <i>native declaration : include\Everything.h:116</i>
     */
    int Everything_GetNumResults();

    /**
     * Original signature : <code>DWORD Everything_GetTotFileResults()</code><br>
     * <i>native declaration : include\Everything.h:117</i>
     */
    int Everything_GetTotFileResults();

    /**
     * Original signature : <code>DWORD Everything_GetTotFolderResults()</code><br>
     * <i>native declaration : include\Everything.h:118</i>
     */
    int Everything_GetTotFolderResults();

    /**
     * Original signature : <code>DWORD Everything_GetTotResults()</code><br>
     * <i>native declaration : include\Everything.h:119</i>
     */
    int Everything_GetTotResults();

    /**
     * Original signature : <code>BOOL Everything_IsVolumeResult(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:120</i>
     */
    boolean Everything_IsVolumeResult(int dwIndex);

    /**
     * Original signature : <code>BOOL Everything_IsFolderResult(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:121</i>
     */
    boolean Everything_IsFolderResult(int dwIndex);

    /**
     * Original signature : <code>BOOL Everything_IsFileResult(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:122</i>
     */
    boolean Everything_IsFileResult(int dwIndex);

    /**
     * Original signature : <code>LPCWSTR Everything_GetResultFileNameW(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:123</i>
     */
    WString Everything_GetResultFileNameW(int dwIndex);

    /**
     * Original signature : <code>LPCSTR Everything_GetResultFileNameA(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:124</i>
     */
    WString Everything_GetResultFileNameA(int dwIndex);

    /**
     * Original signature : <code>LPCWSTR Everything_GetResultPathW(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:125</i>
     */
    WString Everything_GetResultPathW(int dwIndex);

    /**
     * Original signature : <code>LPCSTR Everything_GetResultPathA(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:126</i>
     */
    WString Everything_GetResultPathA(int dwIndex);

    /**
     * Original signature : <code>DWORD Everything_GetResultFullPathNameA(DWORD, LPSTR, DWORD)</code><br>
     * <i>native declaration : include\Everything.h:127</i>
     */
    int Everything_GetResultFullPathNameA(int dwIndex, EverythingNative.LPSTR buf, int bufsize);

    /**
     * Original signature : <code>DWORD Everything_GetResultFullPathNameW(DWORD, LPWSTR, DWORD)</code><br>
     * <i>native declaration : include\Everything.h:128</i>
     */
    int Everything_GetResultFullPathNameW(int dwIndex, Buffer wbuf, int wbuf_size_in_wchars);

    int Everything_GetResultFullPathNameW(int dwIndex, Pointer wbuf, int wbuf_size_in_wchars);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetResultListSort()</code><br>
     * <i>native declaration : include\Everything.h:129</i>
     */
    int Everything_GetResultListSort();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetResultListRequestFlags()</code><br>
     * <i>native declaration : include\Everything.h:130</i>
     */
    int Everything_GetResultListRequestFlags();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCWSTR Everything_GetResultExtensionW(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:131</i>
     */
    WString Everything_GetResultExtensionW(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCSTR Everything_GetResultExtensionA(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:132</i>
     */
    WString Everything_GetResultExtensionA(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_GetResultSize(DWORD, LARGE_INTEGER*)</code><br>
     * <i>native declaration : include\Everything.h:133</i>
     */
    boolean Everything_GetResultSize(int dwIndex, EverythingNative.LARGE_INTEGER lpSize);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_GetResultDateCreated(DWORD, FILETIME*)</code><br>
     * <i>native declaration : include\Everything.h:134</i>
     */
    boolean Everything_GetResultDateCreated(int dwIndex, EverythingNative.FILETIME lpDateCreated);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_GetResultDateModified(DWORD, FILETIME*)</code><br>
     * <i>native declaration : include\Everything.h:135</i>
     */
    boolean Everything_GetResultDateModified(int dwIndex, EverythingNative.FILETIME lpDateModified);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_GetResultDateAccessed(DWORD, FILETIME*)</code><br>
     * <i>native declaration : include\Everything.h:136</i>
     */
    boolean Everything_GetResultDateAccessed(int dwIndex, EverythingNative.FILETIME lpDateAccessed);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetResultAttributes(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:137</i>
     */
    int Everything_GetResultAttributes(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCWSTR Everything_GetResultFileListFileNameW(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:138</i>
     */
    WString Everything_GetResultFileListFileNameW(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCSTR Everything_GetResultFileListFileNameA(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:139</i>
     */
    WString Everything_GetResultFileListFileNameA(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetResultRunCount(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:140</i>
     */
    int Everything_GetResultRunCount(int dwIndex);

    /**
     * Original signature : <code>BOOL Everything_GetResultDateRun(DWORD, FILETIME*)</code><br>
     * <i>native declaration : include\Everything.h:141</i>
     */
    boolean Everything_GetResultDateRun(int dwIndex, EverythingNative.FILETIME lpDateRun);

    /**
     * Original signature : <code>BOOL Everything_GetResultDateRecentlyChanged(DWORD, FILETIME*)</code><br>
     * <i>native declaration : include\Everything.h:142</i>
     */
    boolean Everything_GetResultDateRecentlyChanged(int dwIndex, EverythingNative.FILETIME lpDateRecentlyChanged);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCWSTR Everything_GetResultHighlightedFileNameW(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:143</i>
     */
    WString Everything_GetResultHighlightedFileNameW(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCSTR Everything_GetResultHighlightedFileNameA(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:144</i>
     */
    WString Everything_GetResultHighlightedFileNameA(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCWSTR Everything_GetResultHighlightedPathW(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:145</i>
     */
    WString Everything_GetResultHighlightedPathW(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCSTR Everything_GetResultHighlightedPathA(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:146</i>
     */
    WString Everything_GetResultHighlightedPathA(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCWSTR Everything_GetResultHighlightedFullPathAndFileNameW(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:147</i>
     */
    WString Everything_GetResultHighlightedFullPathAndFileNameW(int dwIndex);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>LPCSTR Everything_GetResultHighlightedFullPathAndFileNameA(DWORD)</code><br>
     * <i>native declaration : include\Everything.h:148</i>
     */
    WString Everything_GetResultHighlightedFullPathAndFileNameA(int dwIndex);

    /**
     * reset state and free any allocated memory<br>
     * Original signature : <code>void Everything_Reset()</code><br>
     * <i>native declaration : include\Everything.h:151</i>
     */
    void Everything_Reset();

    /**
     * Original signature : <code>void Everything_CleanUp()</code><br>
     * <i>native declaration : include\Everything.h:152</i>
     */
    void Everything_CleanUp();

    /**
     * Original signature : <code>DWORD Everything_GetMajorVersion()</code><br>
     * <i>native declaration : include\Everything.h:154</i>
     */
    int Everything_GetMajorVersion();

    /**
     * Original signature : <code>DWORD Everything_GetMinorVersion()</code><br>
     * <i>native declaration : include\Everything.h:155</i>
     */
    int Everything_GetMinorVersion();

    /**
     * Original signature : <code>DWORD Everything_GetRevision()</code><br>
     * <i>native declaration : include\Everything.h:156</i>
     */
    int Everything_GetRevision();

    /**
     * Original signature : <code>DWORD Everything_GetBuildNumber()</code><br>
     * <i>native declaration : include\Everything.h:157</i>
     */
    int Everything_GetBuildNumber();

    /**
     * Original signature : <code>BOOL Everything_Exit()</code><br>
     * <i>native declaration : include\Everything.h:158</i>
     */
    boolean Everything_Exit();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_IsDBLoaded()</code><br>
     * <i>native declaration : include\Everything.h:159</i>
     */
    boolean Everything_IsDBLoaded();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_IsAdmin()</code><br>
     * <i>native declaration : include\Everything.h:160</i>
     */
    boolean Everything_IsAdmin();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_IsAppData()</code><br>
     * <i>native declaration : include\Everything.h:161</i>
     */
    boolean Everything_IsAppData();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_RebuildDB()</code><br>
     * <i>native declaration : include\Everything.h:162</i>
     */
    boolean Everything_RebuildDB();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_UpdateAllFolderIndexes()</code><br>
     * <i>native declaration : include\Everything.h:163</i>
     */
    boolean Everything_UpdateAllFolderIndexes();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_SaveDB()</code><br>
     * <i>native declaration : include\Everything.h:164</i>
     */
    boolean Everything_SaveDB();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_SaveRunHistory()</code><br>
     * <i>native declaration : include\Everything.h:165</i>
     */
    boolean Everything_SaveRunHistory();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_DeleteRunHistory()</code><br>
     * <i>native declaration : include\Everything.h:166</i>
     */
    boolean Everything_DeleteRunHistory();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetTargetMachine()</code><br>
     * <i>native declaration : include\Everything.h:167</i>
     */
    int Everything_GetTargetMachine();

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetRunCountFromFileNameW(LPCWSTR)</code><br>
     * <i>native declaration : include\Everything.h:169</i>
     */
    int Everything_GetRunCountFromFileNameW(WString lpFileName);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_GetRunCountFromFileNameA(LPCSTR)</code><br>
     * <i>native declaration : include\Everything.h:170</i>
     */
    int Everything_GetRunCountFromFileNameA(WString lpFileName);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_SetRunCountFromFileNameW(LPCWSTR, DWORD)</code><br>
     * <i>native declaration : include\Everything.h:171</i>
     */
    boolean Everything_SetRunCountFromFileNameW(WString lpFileName, int dwRunCount);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>BOOL Everything_SetRunCountFromFileNameA(LPCSTR, DWORD)</code><br>
     * <i>native declaration : include\Everything.h:172</i>
     */
    boolean Everything_SetRunCountFromFileNameA(WString lpFileName, int dwRunCount);

    /**
     * Everything 1.4.1<br>
     * Original signature : <code>DWORD Everything_IncRunCountFromFileNameW(LPCWSTR)</code><br>
     * <i>native declaration : include\Everything.h:173</i>
     */
    int Everything_IncRunCountFromFileNameW(WString lpFileName);

    public static class FILETIME extends PointerType {
        public FILETIME(Pointer address) {
            super(address);
        }

        public FILETIME() {
            super();
        }
    }

    ;

    public static class LPCSTR extends PointerType {
        public LPCSTR(Pointer address) {
            super(address);
        }

        public LPCSTR() {
            super();
        }
    }

    ;

    public static class HWND extends PointerType {
        public HWND(Pointer address) {
            super(address);
        }

        public HWND() {
            super();
        }
    }

    ;

    public static class LPARAM extends PointerType {
        public LPARAM(Pointer address) {
            super(address);
        }

        public LPARAM() {
            super();
        }
    }

    ;

    public static class LPSTR extends PointerType {
        public LPSTR(Pointer address) {
            super(address);
        }

        public LPSTR() {
            super();
        }
    }

    ;

    public static class LARGE_INTEGER extends PointerType {
        public LARGE_INTEGER(Pointer address) {
            super(address);
        }

        public LARGE_INTEGER() {
            super();
        }
    }

    ;

    public static class WPARAM extends PointerType {
        public WPARAM(Pointer address) {
            super(address);
        }

        public WPARAM() {
            super();
        }
    }

    ;

    public static class LPWSTR extends PointerType {
        public LPWSTR(Pointer address) {
            super(address);
        }

        public LPWSTR() {
            super();
        }
    }

    ;

    public static class LPCWSTR extends PointerType {
        public LPCWSTR(Pointer address) {
            super(address);
        }

        public LPCWSTR() {
            super();
        }
    }

    ;
}