import org.junit.Test;

import static org.junit.Assert.*;

public class Level1Test {
    @Test
    public void test1() {
        String ws = "100";
        String rs = Level1.Keymaker(3);
        assertEquals(ws, rs);
    }
    @Test
    public void test2() {
        String ws = "1001";
        String rs = Level1.Keymaker(4);
        assertEquals(ws, rs);
    }

    @Test
    public void test3() {
        String ws = "100100001";
        String rs = Level1.Keymaker(9);
        assertEquals(ws, rs);
    }
    @Test
    public void test4() {
        String ws = "1001000010000001";
        String rs = Level1.Keymaker(16);
        assertEquals(ws, rs);
    }
    @Test
    public void test5() {
        String ws = "1001000010000001000000001";
        String rs = Level1.Keymaker(25);
        assertEquals(ws, rs);
    }

    @Test
    public void test6() {
        String ws = "100100001000000100000000100000000001";
        String rs = Level1.Keymaker(36);
        assertEquals(ws, rs);
    }
    @Test
    public void test7() {
        String ws = "1001000010000001000000001000000000010000000000001";
        String rs = Level1.Keymaker(49);
        assertEquals(ws, rs);
    }

}