import java.util.*;

public class Level1 {
        public static int [][]   EqLens (String s1, String s2) {

            int Len1 = s1.length();
            int Len2 = s2.length();

            String s11 = s1;
            String s22 = s2;

            if (Len1 < Len2) {
                int temp = Len1;
                Len1 = Len2;
                Len2 = temp;
                s11 = s2;
                s22 = s1;
            }
            
            int[][] strs = new int[3][Len1];

            int[] results = new int[Len1];
            int[] results2 = new int[Len1];
            int[] resarray = new int[Len1];

            for (int i = 0; i < Len1; i++) {
                results[i] = Integer.parseInt(s11.substring(i, i + 1));
                resarray[i] = 0;
            }

            int j = 0;
            for (int i = Len1 - Len2; i < Len1; i++) {
                results2[i] = Integer.parseInt(s22.substring(j, j + 1));
                j++;
            }

            boolean f1 = true;
            if (Len1 == Len2) {
                for (int n = 0; n<Len1; n++) {
                    if (results2[n] > results[n]) {
                         f1 = false;
                         break;
                    }
                }
            }

            if (f1) {
                strs[0] = results;
                strs[1] = results2;
            }
            else {
                strs[0] = results2;
                strs[1] = results;
            }
            strs[2] = resarray;
        
        return strs;
    }

        public static String BigMinus(String s1, String s2) {
            if (s1.equals(s2)) return "0";

            int [][] iarrays =  EqLens (s1, s2);

            int [] results = iarrays[0];
            int [] results2 = iarrays[1];
            int [] resarray = iarrays[2];
            int Len1 = results.length;

            boolean curmenos = false;
            int a,b;

            for (int i = Len1-1; i >= 0; i--) {
                a = results[i];
                b = results2[i];

                if (curmenos == true)   //
                   a--;

                if (a < b ) {
                    curmenos = true;
                    a += 10;
                }
                else
                    curmenos = false;

                int res = Math.abs (a - b);

                resarray[i] = res;
            }

            int k;
            int[] newArray;
            for( k = 0;  k < resarray.length;  k++ ) {
                if (resarray[k] != 0)
                  break;
            }
             newArray = new int[resarray.length-k];

            for (int i = 0; i< resarray.length-k; i++ ) {
                 newArray[i] = resarray[i+k];
            }

            String sres = Arrays.toString(newArray).replaceAll("\\[|]| ", "");
            return sres.replaceAll("\\p{Punct}" , "");
        }



    }



