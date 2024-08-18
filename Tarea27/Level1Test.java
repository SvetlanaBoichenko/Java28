import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Level1Test {

    @Test
    public void test1() {
        boolean wb = true;
        int [] a = {1, 2, 3, 4, 5, 10, 30, 20};
        boolean b = Level1.Football(a, 8) ;
        assertEquals(b, wb);
    }
    @Test
    public void test2() {
        boolean wb = true;
        int [] a = {10, 2, 3, 4, 5, 1, 20, 21};
        boolean b = Level1.Football(a, 8) ;
        assertEquals(b, wb);
    }
    @Test
    public void test3() {
        boolean wb = true;
        int [] a = {1, 2, 3, 4, 21, 13, 12, 11, 10};
        boolean b = Level1.Football(a, 9) ;
        assertEquals(b, wb);
    }
    @Test
    public void test4() {
        boolean wb = false;
        int [] a = {1, 2, 3, 4, 21, 13, 15, 11, 10};
        boolean b = Level1.Football(a, 9) ;
        assertEquals(b, wb);
    }
    @Test
    public void test5() {
        boolean wb = true;
        int [] a = {1};
        boolean b = Level1.Football(a, 1) ;
        assertEquals(b, wb);
    }

    @Test
    public void test6() {
        boolean wb = false;
        int [] a = {2, 4, 6, 8, 5, 9, 10};
        boolean b = Level1.Football(a, 7) ;
        assertEquals(b, wb);
    }

    @Test
    public void test7() {
        boolean wb = true;
        int [] a = {2, 4, 9, 8, 7, 6, 5, 10, 11};
        boolean b = Level1.Football(a, 8) ;
        assertEquals(b, wb);
    }

}