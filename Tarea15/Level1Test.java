//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {

    @Test
    public void test1() {
        boolean wres = true;

        boolean res = Level1.TankRush(3, 4, "1234 2345 0987", 2, 2, "34 98");
        assertTrue(wres == res);
    }


    @Test
    public void test3() {
        String S1 = "123456700 234556700 098756700";
        String S2 = "567 567 567";
        boolean wf = true;

        boolean f = Level1.TankRush(3, 9, S1, 3, 3, S2);
        assertEquals(wf, f);
    }

    @Test
    public void test4() {
        String S1 = "1234567000 2345567008 0987567001";
        String S2 = "567 568";
        boolean wf = false;

        boolean f = Level1.TankRush(3, 10, S1, 2, 3, S2);
        assertEquals(wf, f);
    }

    @Test
    public void test5() {
        String S1 = "1234567000 2345567008 0987567001";
        String S2 = "4567000 5567008 7567001";
        boolean wf = true;

        boolean f = Level1.TankRush(3, 10, S1, 3, 7, S2);
        assertEquals(wf, f);
    }

}
