import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Level1Test {

    @Test
    public void test0() {
        int wres = 12;

        int[][] a = {{3, 5, 5}, {5, 2, 2}};

        int res = Level1.Unmanned(10, 2, a);
        assertTrue(wres == res);
    }
    @Test
    public void test1() {
        int wres = 24;

        int[][] a = {{3, 5, 5}, {5, 2, 2}, {8, 4, 4},};

        int res = Level1.Unmanned(20, 3, a);
        assertTrue(wres == res);
    }

    @Test
    public void test2() {
        int wres = 104;

        int[][] a = {{3, 5, 5}, {5, 2, 2}, {8, 4, 4},{16, 100,100}};

        int res = Level1.Unmanned(20, 4, a);
        assertTrue(wres == res);
    }



    @Test
    public void test13() {
        int wres = 10;
        int[][] a = {{11,5,5},{15,2,2}};

        int res = Level1.Unmanned(10, 2, a);
        assertTrue(wres == res);
        }
}
