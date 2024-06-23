import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Level1Test {

    @Test
    public void test1() {
       String ws = "5";
       String res = Level1.BigMinus("100", "95");
        assertTrue (ws.equals(res));
    }

    @Test
    public void test2() {
        String ws = "499905";
        String res = Level1.BigMinus("500000", "95");
        assertTrue (ws.equals(res));
    }

    @Test
    public void test3() {
        String ws = "99993";
        String res = Level1.BigMinus("100000", "7");
        assertTrue (ws.equals(res));
    }


    @Test
    public void test4() {
        String ws = "1";
        String res = Level1.BigMinus("100000", "99999");
        assertTrue (ws.equals(res));
    }

    @Test
    public void test5() {
        String ws = "99999";
        String res = Level1.BigMinus("100000", "1");
        assertTrue (ws.equals(res));
    }
}