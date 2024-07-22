import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Level1Test {
    @Test
    public void test1() {
        boolean wres = true;
        int [] arr = {1,2,3,4,5};
        boolean res = Level1.MisterRobot(5, arr);
        assertTrue(wres == res);
    }
    @Test
    public void test2() {
        boolean wres = true;
        int [] arr = {1,6,3,4,5,2,7};
        boolean res = Level1.MisterRobot(7, arr);
        assertTrue(wres == res);
    }
    @Test
    public void test3() {
        boolean wres = true;
        int [] arr = {7,6,4,5,3,2,1};
        boolean res = Level1.MisterRobot(7, arr);
        assertTrue(wres == res);
    }
}
