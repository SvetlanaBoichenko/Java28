
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Level1Test {
    @Test
    public void test1() {
        int wres = 24;

        int[][] a = {{3, 5, 5}, {5, 2, 2}, {8, 4, 4},};

        int res = Level1.Unmanned(20, 2, a);
        assertTrue(wres == res);
    }


    @Test
    public void test2() {
        int wres = 104;

        int[][] a = {{3, 5, 5}, {5, 2, 2}, {8, 4, 4}, {16, 100, 100}};

        int res = Level1.Unmanned(20, 4, a);
        assertTrue(wres == res);
    }

        @Test
        public void test3() {
            int wres = 11;

            int[][] a = {{3, 4, 1}, {5, 3, 4}, {9, 2, 5}};

            int res = Level1.Unmanned(10, 3, a);
            assertTrue(wres == res);
    }


    @Test
    public void test4() {
        int wres = 10;

        int[][] a = {{3, 1, 1}, {5, 1, 2}, {8, 4, 5}};

        int res = Level1.Unmanned(10, 3, a);
        assertTrue(wres == res);
    }

    @Test
    public void test5() {
        int wres = 10;

        int[][] a = {{3, 1, 1}, {5, 1, 2}, {8, 4, 5}};

        int res = Level1.Unmanned(10, 3, a);
        assertTrue(wres == res);
    }

    @Test
    public void test6() {
        int wres = 15;

        int[][] a = {{3, 1, 1}, {5, 6, 2}, {8, 4, 5}};

        int res = Level1.Unmanned(10, 3, a);
        assertTrue(wres == res);
    }

}
