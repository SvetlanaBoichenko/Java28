//import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class Level1Test {
     @Test
    public void tessort () {

         int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};

         int[] resarr = Level1.funcsort(arr1, 6);
         int[] waitarr = {1, 2, 3, 4, 5, 6};

         assertArrayEquals(waitarr, resarr);
     }
         @Test
         public void tessort2 () {

             int[] arr1 = new int[]{6, 3, 5, 7, 2, 1, 4};

             int[] resarr = Level1.funcsort(arr1, 7);
             int[] waitarr = {1, 2, 3, 4, 5, 6, 7};

             assertArrayEquals(waitarr, resarr);
         }

         @Test
         public void testfuncrev () {

             int[] arr1 = new int[]{6, 3, 5, 7, 2, 1, 4};

             int[] resarr = Level1.funcreverc(arr1, 7);
             int[] waitarr = {6, 3, 5, 4, 1, 2, 7};

             assertArrayEquals(waitarr, resarr);
         }

         @Test
         public void testfuncrev22 () {

             int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

             int[] resarr = Level1.funcreverc(arr1, 19);
             int [] waitarr = {1,2,3,4,5,6,7,8,9,19,18,17, 16, 15, 14,13,12,11,10};

             assertArrayEquals (waitarr, resarr);
         }


    @Test
    public void testfuncmad () {

        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        int[] resarr = Level1.MadMax (19, arr1);
        int [] waitarr = {1,2,3,4,5,6,7,8,9,19,18,17, 16, 15, 14,13,12,11,10};

        assertArrayEquals (waitarr, resarr);
    }


    @Test
    public void testfuncmad1 () {

        int[] arr1 = new int[]{10,2,13,19,5,16,7,8,16,1,11,12,3,14,15,6,17,9,4};

        int[] resarr = Level1.funcsort ( arr1, 19);
        int [] waitarr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        assertArrayEquals (waitarr, resarr);
    }



    @Test
    public void testfuncmad2 () {

        int[] arr1 = new int[]{10,2,13,19,5,16,7,8,18,1,11,12,3,14,15,6,17,9,4};

        int[] resarr = Level1.MadMax (19, arr1);
        int [] waitarr = {1,2,3,4,5,6,7,8,9,19,18,17, 16, 15, 14,13,12,11, 10};

        assertArrayEquals (waitarr, resarr);
    }

    @Test
    public void testfuncmad3 () {

        int[] arr1 = new int[]{1};

        int[] resarr = Level1.MadMax (1, arr1);
        int [] waitarr = {1};

        assertArrayEquals (waitarr, resarr);
    }
}





