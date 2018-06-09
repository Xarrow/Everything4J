import org.helixcs.everything4j.Everything4J;
import org.junit.Test;

import java.util.Map;

public class TestEverything {
    @Test
    public void testSearch(){
        Map<String,?> result = Everything4J.showSearchResult("abc");
        System.out.println(result);
    }
}
