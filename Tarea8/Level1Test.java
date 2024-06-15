import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Level1Test {
    @Test
    public void tessort() {

        int[] arr1 = new int[]{-1, 1, 0};
        int waitS = 0;
        int reals = Level1.SumOfThe(3, arr1);
        assertTrue(waitS == reals);

    }

    @Test
    public void tessort2() {

        int[] arr1 = new int[]{2,2};
        int waitS = 2;
        int reals = Level1.SumOfThe(2, arr1);
        assertTrue(waitS == reals);

    }


    @Test
    public void tessort3() {

        int[] arr1 = new int[]{-2,-2,-2, 0, -10, -16};
        int waitS = -16;
        int reals = Level1.SumOfThe(6, arr1);
        assertTrue(waitS == reals);

    }
}