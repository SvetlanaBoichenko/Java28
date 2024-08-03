import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Level1Test {

    @Test
    public void test1() {
        boolean wr = true;
        boolean r = Level1.SherlockValidString("nnr");
        assertTrue(wr == r);
    }

    @Test
    public void test0() {
        boolean wr = true;
        boolean r = Level1.SherlockValidString("nr");
        assertTrue(wr == r);
    }

    @Test
    public void test2() {
        boolean wr = false;
        boolean r = Level1.SherlockValidString("nnrrkkkjjj");
        assertTrue(wr == r);
    }

    @Test
    public void test3() {
        boolean wr = true;
        boolean r = Level1.SherlockValidString("xxyyz");
        assertTrue(wr == r);
    }

    @Test
    public void test4() {
        boolean wr = false;
        boolean r = Level1.SherlockValidString("xyzzz");
        assertTrue(wr == r);
    }

    @Test
    public void test5() {
        boolean wr = false;
        boolean r = Level1.SherlockValidString(" xxyyza");
        assertTrue(wr == r);
    }

    @Test
    public void test6() {
        boolean wr = false;
        boolean r = Level1.SherlockValidString(" xxyyzabc");
        assertTrue(wr == r);
    }

    @Test
    public void test7() {
        boolean wr = true;
        boolean r = Level1.SherlockValidString("xyz");
        assertTrue(wr == r);
    }

    @Test
    public void test8() {
        boolean wr = false;
        boolean r = Level1.SherlockValidString("xccnnn");
        assertTrue(wr == r);
    }

    @Test
    public void test9() {
        boolean wr = true;
        boolean r = Level1.SherlockValidString("mmxxxccnn");
        assertTrue(wr == r);
    }

    @Test
    public void test10() {
        boolean wr = false;
        boolean r = Level1.SherlockValidString("jmmmmmxxxccnn");
        assertTrue(wr == r);
    }

}
