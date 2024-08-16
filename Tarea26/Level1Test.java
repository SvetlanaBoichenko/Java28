import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Level1Test {
    @Test
    public void test1() {
       boolean wb = false;
        boolean b =Level1.white_walkers("aaS=8");
        assertEquals (b, wb);
    }

    @Test
    public void test2() {
        boolean wb = true;
        boolean b =Level1.white_walkers("axxbnnn6===4xaf5===eee5bbbb7");
        assertEquals (b, wb);
    }
    @Test
    public void test3() {
        boolean wb = false;
        boolean b =Level1.white_walkers("");
        assertEquals (b, wb);
    }

    @Test
    public void test4() {
        boolean wb = false;
        boolean b =Level1.white_walkers("  5   5   5");
        assertEquals (b, wb);
    }
    @Test
    public void test6() {
        boolean wb = false;
        boolean b =Level1.white_walkers("  5===5mmm5===");
        assertEquals (b, wb);
    }
    @Test
    public void test7() {
        boolean wb = true;
        boolean b =Level1.white_walkers("abc=7==hdjs=3gg1=======5");
        assertEquals (b, wb);
    }
    @Test
    public void test8() {
        boolean wb = false;
        boolean b =Level1.white_walkers("abc=7==hdjs=3gg5====5");
        assertEquals (b, wb);
    }
    @Test
    public void test9() {
        boolean wb = false;
        boolean b =Level1.white_walkers("gg5===5abc=7==hd=js=3");
        assertEquals (b, wb);
    }
    @Test
    public void test10() {
        boolean wb = false;
        boolean b =Level1.white_walkers("aaS===8");
        assertEquals (b, wb);
    }
    @Test
    public void test11() {
        boolean wb = true;
        boolean b = Level1.white_walkers("9===2===9===1===9");
        assertEquals (b, wb);
    }
    @Test
    public void test12() {
        boolean wb = true;
        boolean b = Level1.white_walkers("9===1===9===2===9");
        assertEquals (b, wb);
    }
    @Test
    public void test13() {
        boolean wb = false;
        boolean b = Level1.white_walkers("9===2===9===2===9");
        assertEquals (b, wb);
    }
    @Test
    public void test14() {
        boolean wb = true;
        boolean b = Level1.white_walkers("9===2===9===2===8");
        assertEquals (b, wb);
    }
    @Test
    public void test15() {
        boolean wb = false;
        boolean b = Level1.white_walkers("jkjkjkjk1====9===1===9===1===8");
        assertEquals (b, wb);
    }

    @Test
    public void test16() {
        boolean wb = true;
        boolean b = Level1.white_walkers("====9====2===9===3===8=khjkjhkhjkkhjkjhjkhjjkjhjjk==2=mbmbmbm==8");
        assertEquals (b, wb);
    }
}