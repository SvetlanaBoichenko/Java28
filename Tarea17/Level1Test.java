import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Level1Test {
    @Test
    public void test1() {
        boolean wres = false;

        boolean res = Level1.LineAnalysis("....*");
        assertTrue(wres == res);
    }

    @Test
    public void test2() {
        boolean wres = true;

        boolean res = Level1.LineAnalysis("*....*");
        assertTrue(wres == res);
    }

    @Test
    public void test3() {
        boolean wres = true;

        boolean res = Level1.LineAnalysis("***********************************");
        assertTrue(wres == res);
    }

    @Test
    public void test4() {
        boolean wres = true;

        boolean res = Level1.LineAnalysis("*");
        assertTrue(wres == res);
    }

    @Test
    public void test5() {
        boolean wres = true;

        boolean res = Level1.LineAnalysis("**");
        assertTrue(wres == res);
    }

    @Test
    public void test6() {
        boolean wres = false;

        boolean res = Level1.LineAnalysis("*.*.*.*.*.*.*.......*.*");
        assertTrue(wres == res);
    }

    @Test
    public void test7() {
        boolean wres = false;

        boolean res = Level1.LineAnalysis("*...*.*.*.*.*.*.*.*");
        assertTrue(wres == res);
    }


}