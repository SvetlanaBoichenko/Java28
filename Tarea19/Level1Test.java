import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

public class Level1Test {

    @Test
    public void test1() {
        String [] s = { "платье1 5", "сумка32 2", "платье1 1", "сумка23 2", "сумка128 4" };
        String[] ws = { "платье1 6", "сумка128 4", "сумка23 2", "сумка32 2" };

    String [] ress = Level1.ShopOLAP(5, s);
    assertEquals(ws, ress);
    }

    @Test
    public void test2() {
        String [] s = { "платье1 555", "сумка32 2", "сумка32 2", "сумка32 2", "сумка32 2" };
        String[] ws = { "платье1 555",  "сумка32 8" };

        String [] ress = Level1.ShopOLAP(5, s);
        assertEquals(ws, ress);
    }

    @Test
    public void test3() {
        String [] s = { "a 1", "a 2", "a 3", "a 4", "a 5" };
        String[] ws = { "a 15" };

        String [] ress = Level1.ShopOLAP(5, s);
        assertEquals(ws, ress);
    }

    @Test
    public void test4() {
        String [] s = { "" };
        String[] ws = { };

        String [] ress = Level1.ShopOLAP(0, s);
        assertEquals(ws, ress);
    }

    @Test
    public void test5() {
        String [] s = { "v1 1","v2 2", "v3 3", "v4 4" };
        String[] ws = {"v4 4","v3 3", "v2 2", "v1 1" };

        String [] ress = Level1.ShopOLAP(4, s);
        assertEquals(ws, ress);
    }


    @Test
    public void test6() {
        String [] s = { "v1 1","v2 1", "v3 1", "v4 100" };
        String[] ws = {"v4 100", "v1 1","v2 1", "v3 1" };

        String [] ress = Level1.ShopOLAP(4, s);
        assertEquals(ws, ress);
    }
    @Test
    public void test7() {

        String[] s = {
                "Одувачик 10",
                "платье1 5",
                "Диван4 110",
                "сумка32 2",
                "платье1 1",
                "платье1 11",
                "сумка32 10",
                "сумка128 144",
                "Одувачик 0",
                "Диван 110",
                "платье 10",
                "Диван4 12",
                "Диван4 12",
                "Диван5 12"
        };

        String[] ws  = {
                "сумка128 144",
                "Диван4 134",
                "Диван 110",
                "платье1 17",
                "Диван5 12",
                "сумка32 12",
                "Одувачик 10",
                "платье 10"
        };

        String [] ress = Level1.ShopOLAP(14, s);
        assertEquals(ws, ress);

    }
}