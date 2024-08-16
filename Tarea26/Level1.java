import java.util.*;

public class Level1
{
    public static boolean[]  LookW (char []sarr, int j,int k) {

        boolean [] arrb = {false, false};

        int s1 = Character.getNumericValue(sarr[j])+Character.getNumericValue(sarr[k]);
        if (s1 != 10) {
            arrb[0] = false; //  Sum1 no 10
            return arrb;
        }
        arrb[0] = true;      // sum1 = 10

        if (k-j < 4 ) {
            arrb[1] = false; //
            return arrb;
        }

        s1 = 0;
        for (int i = j+1; i < k; i++ ) {
            if (sarr[i] == '=')
                s1++;
        }

        if (s1 == 3) {
            arrb[1] = true;
        }

        return arrb;
    }

    public static boolean white_walkers(String village){
        char[] sarr = village.toCharArray();

        boolean [] resarr = {false, false};
        int j = -1;
        boolean b = false;
        int len = village.length();

        for (int i = 0; i < len; i++) {

            char a = sarr[i];
            if (Character.isDigit(a) & j < 0) {
                j = i;
                continue;
            }

            if (Character.isDigit(a) & j >= 0) {
                resarr = LookW (sarr, j, i); 

                if (resarr[0] == true & resarr[1] == false) {
                    b = false;     // nada mas
                    break;
                }

                if (resarr[0] == true & resarr[1] == true) {
                    b = true;     // nada cambio
                }

                i--;
                j = -1;
            }
        }

        return b;
    }

    
}


