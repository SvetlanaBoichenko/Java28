import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class Level1Test {

    @Test
    public void test1() {
        String s = "//////////";
        int waitcount = s.length() * 10;
        int count = Level1.PrintingCosts(s);
        assertTrue(count == waitcount);
    }

    @Test
    public void test2() {
        String s = "\\";
        int waitcount = 10;//s.length() * 10;
        int count = Level1.PrintingCosts(s);
        assertTrue(count == waitcount);
    }

    @Test
    public void test3() {
        String s = "\\\\\\\\\\\\";
        int waitcount = s.length() * 10;
        int count = Level1.PrintingCosts(s);
        assertTrue(count == waitcount);
    }

    @Test
    public void test4() {
        String s = "\'";
        int waitcount = 3;      //s.length() * 10;
        int count = Level1.PrintingCosts(s);
        assertTrue(count == waitcount);
    }

    @Test
    public void test5() {
        String s = "\' \'";
        int waitcount = 3+3;      //s.length() * 10;
        int count = Level1.PrintingCosts(s);
        assertTrue(count == waitcount);
    }
}