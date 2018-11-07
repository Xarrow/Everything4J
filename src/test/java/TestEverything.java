import org.helixcs.everything4j.Everything4j;
import org.junit.Test;

import java.util.List;

public class TestEverything {
    private static Everything4j everything4jInstance = Everything4j.getInstance();

    @Test
    public void testSearchE() {
        List<String> sl = everything4jInstance.searchResult("google");
        System.out.println(sl.size());
        for (int i = 0; i < sl.size(); i++) {
            System.out.println(i + " ==> " + sl.get(i));
        }
        // force test
//        while (true) {
//            new Thread(() -> {
//                System.out.println(sl.size());
//                for (int i = 0; i < sl.size(); i++) {
//                    System.out.println(i + " ==> " + sl.get(i));
//                }
//                System.gc();
//            }).start();
//        }
    }

    @Test
    public void testSearchFileNames() {
        List<String> sl = everything4jInstance.searchNameList("abc .py");
        System.out.println(sl.size());
        for (String s : sl) {
            System.out.println(s);
        }
    }

    @Test
    public void testPathList() {
        List<String> sl = everything4jInstance.searchPathList("abc .py");
        System.out.println(sl.size());
        for (String s : sl) {
            System.out.println(s);
        }
    }
}

