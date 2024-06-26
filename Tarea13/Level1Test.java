import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Level1Test {

    @Test
    public void test1() {
        int res = Level1.changeroot(1234, false);
        assertTrue(4660 == res);
    }

    @Test
    public void test2() {
        int[] v = {33, 111};
        int []resw = {51,273};
        int [] resv = Level1.UFO(2, v, false);

        assertArrayEquals(resw, resv);
    }

    @Test
    public void test3() {
        int[] v = {10000, 10001};
        int []resw = {65536,65537};
        int [] resv = Level1.UFO(2, v, false);

        assertArrayEquals(resw, resv);
    }
}