import org.helixcs.everything4j.Everything4j;
import org.junit.Test;

import java.util.List;

public class TestEverything {

    @Test
    public void testSearchE() {
        List<String> sl = Everything4j.searchResult("abc .py");
        System.out.println(sl.size());
        for (int i = 0; i < sl.size(); i++) {
            System.out.println(i + " ==> " + sl.get(i));
        }
    }

    @Test
    public void testSearchFileNames() {
        List<String> sl = Everything4j.searchNameList("abc .py");
        System.out.println(sl.size());
        for (String s : sl) {
            System.out.println(s);
        }
    }

    @Test
    public void testPathList() {
        List<String> sl = Everything4j.searchPathList("abc .py");
        System.out.println(sl.size());
        for (String s : sl) {
            System.out.println(s);
        }
    }
}

