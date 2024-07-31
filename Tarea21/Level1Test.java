import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Level1Test {

    @Test
    public void test1() {
        String s = "платье";
        String ws = "плаьте";

        String rs = Level1.BiggerGreater(s);
        assertEquals(rs, ws);
    }

    @Test
    public void test2() {
        String s = "ggg";
        String ws = "";

        String rs = Level1.BiggerGreater(s);
        assertEquals(rs, ws);
    }

    @Test
    public void test3() {
        String s = "eva";
        String ws = "vae";

        String rs = Level1.BiggerGreater(s);
        assertEquals(rs, ws);
    }
}