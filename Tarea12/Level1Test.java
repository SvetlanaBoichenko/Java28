import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Level1Test {

    @Test
    public void testv1() {
        String waitstr = "no winner";
        int[] v = {3,3 };
        String str = Level1.MassVote(2,v);

        assertTrue (str.equals(waitstr));
    }

    @Test
    public void testv2() {
        String waitstr = "majority winner 1";
        int[] v = {60, 10, 10, 15, 5};
        String str = Level1.MassVote(5,v);

        assertTrue (str.equals(waitstr));
    }

    @Test
    public void testv3() {
        String waitstr = "minority winner 2";
        int[] v = {10, 15, 10};
        String str = Level1.MassVote(3,v);

        assertTrue (str.equals(waitstr));
    }

    @Test
    public void testv4() {
        String waitstr = "minority winner 4";
        int[] v = {10, 11, 13, 28, 19, 5};
        String str = Level1.MassVote(6,v);

        assertTrue (str.equals(waitstr));
    }

}