import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Level1Test {

    @Test
    public void teststrings1() {
        ArrayList<String> A1 = new ArrayList<String>();
        A1.add("мама");
        A1.add("папа");
        A1.add("баба");

        String s = "мама папа баба";

        ArrayList<String> A2 = Level1.MakeStringList(4, s);
        assertTrue(A1.equals(A2));
    }

    @Test
    public void teststrings2() {
        ArrayList<String> A1 = new ArrayList<String>();
        A1.add("1) строка");
        A1.add("разбивается");
        A1.add("на набор");
        A1.add("строк через");
        A1.add("выравнивание");
        A1.add("по заданной");
        A1.add("ширине.");

        String s = "1) строка разбивается на набор строк через выравнивание по заданной ширине.";

        ArrayList<String> A2 = Level1.MakeStringList(12, s);
        assertTrue(A1.equals(A2));

    }

    @Test
    public void testtab1() {
    int [] waittab = {1,0,0};

    String[] S1 = {"мама","папа", "баба"};

    int [] restab = Level1.MakeLocTab(S1,"мама", 3 );
        assertArrayEquals(waittab, restab);
    }

    @Test
    public void testtab2() {
        int [] waittab = {0, 0, 0, 0, 0, 0, 1};

        String[] S1 = new String[7];
        S1[0] = "1) строка";
        S1[1] = "разбивается";
        S1[2] = "на набор";
        S1[3] = "строк через";
        S1[4] = "выравнивание";
        S1[5] = "по заданной";
        S1[6] = "ширине.";


        int [] restab = Level1.MakeLocTab(S1, "ширине.", 7);
        assertArrayEquals(waittab, restab);
    }

}