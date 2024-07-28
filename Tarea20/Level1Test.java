import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Level1Test {

    @Test
    public void test1() {
        String ws = "";
        String res = Level1.BastShoe("5");
        assertTrue (ws.equals(res));
    }

    @Test
    public void test2() {
        String ws = "Привет М";
        String res1 = "";
        res1 = Level1.BastShoe("1 Привет Мир");
        res1 = Level1.BastShoe("2 2");
        res1 = Level1.BastShoe("4");
        res1 = Level1.BastShoe("5");
        res1 = Level1.BastShoe("4");
        res1 = Level1.BastShoe("5");

        assertTrue(ws.equals (res1));

    }
}
