import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Level1Test {
    @Test
    public void testndosymb() {
        int waitk = 5;
        int k = Level1.ndosymb("wwwwn.kkkk", '.');
        assertTrue (k == waitk);
    }
    @Test
    public void testndosymb2() {
        int waitk = 10;
        int k = Level1.ndosymb("wwwwnkkkk0", 'm');
        assertTrue (k == waitk);
    }

    @Test
    public void testdelsymb() {
        String waitstr = "svetln";
        String str = Level1.delsymb ("svetlana", 'a');

        assertTrue (str.equals(waitstr));
    }

    @Test
    public void testmaptosum() {
        HashMap<Integer, Integer[]> buttmap = new HashMap();
        Integer[] m1 = {0,0};
        Integer[] m2 = {0,1};
        Integer[] m3 = {0,2};
        Integer[] m4 = {1,0};
        Integer[] m5 = {1,1};
        Integer[] m6=  {1,2};
        Integer[] m7 = {2,0};
        Integer[] m8 = {2,1};
        Integer[] m9 = {2,2};

         buttmap.put(1, m1);
         buttmap.put(2, m2);
         buttmap.put(3, m3);
         buttmap.put(4, m4);
         buttmap.put(5, m5);
         buttmap.put(6, m6);
         buttmap.put(7, m7);
         buttmap.put(8, m8);
         buttmap.put(9, m9);

        int [] bhist = {1,2,3,5,6,9,8,7,4};

        double waitres = 8.41;

        double dres =  Level1.maptosum( buttmap,  bhist, 9,  1, 1.41);
        assertTrue (waitres == dres);
    }

    @Test
    public void testPatternUnlock() {

        String swait = "841421";
        int[] bhist = {6, 1, 9, 2, 8, 7, 3, 4, 5};

        String res = Level1.PatternUnlock(9, bhist);
        assertTrue (res.equals (swait));
    }
}