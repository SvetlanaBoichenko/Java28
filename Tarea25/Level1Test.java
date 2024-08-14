import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class Level1Test {
    @Test
    public void test1() {
        boolean wb = false;
        int[] a = {1, 2, 3, 4};
        boolean b = Level1.TransformTransform(a, 4);
        assertTrue(wb == b);
    }

    @Test
    public void test2() {
        boolean wb = false;
        int [] a = {1,2};
        boolean b = Level1.TransformTransform(a,2);
        assertTrue (wb== b);
    }

    @Test
    public void test3() {
        boolean wb = true;
        int [] a = {6};
        boolean b = Level1.TransformTransform(a,1);
        assertTrue (wb== b);
    }

    @Test
    public void test4() {
        boolean wb = true;
        int [] a = {4,2};
        boolean b = Level1.TransformTransform(a,2);
        assertTrue (wb== b);
    }


    }
