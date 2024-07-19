import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {

    @Test
    public void test1() {

        int [] await = { 15, 15, 13, 12, 11, 9, 0, -24};

        int[] a = {0,13,15,-24,15,11,9, 12};

        int[] ares = Level1.funcsortback(a, 8);

        assertArrayEquals (ares, await);

    }


    @Test
    public void test2() {

        int[] a = {0,13,15,24,15,11,9, 12};

        int wd = 26;

        int rd = Level1.MaximumDiscount  (8, a);

        assertEquals (wd, rd);

    }

}