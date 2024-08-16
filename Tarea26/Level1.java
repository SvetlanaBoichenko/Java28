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
        arrb[0] = true; // sum1 = 10

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
        boolean b = false;//, oldb = false, firstflag = true;
        int len = village.length();

        for (int i = 0; i < len; i++) {

            char a = sarr[i];
            if (Character.isDigit(a) & j < 0) {
                j = i;
                continue;
            }

            if (Character.isDigit(a) & j >= 0) {
                resarr = LookW (sarr, j, i); // только 1 раз, а нам надо много

                if (resarr[0] == true & resarr[1] == false) {
                    b = false;// больше не проверем вообще ничего
                    break;
                }

                if (resarr[0] == true & resarr[1] == true) {
                    b = true; // иначе b  не  меняем
                }

               // oldb = b;
                i--;
                j = -1;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        boolean b = white_walkers("  5   5   5");
        System.out.println(b);
    }
}





/*
        "axxb6===4xaf5===eee5" => true
       "5==ooooooo=5=5" => false
        "abc=7==hdjs=3gg1=======5" => true
        "aaS=8" => false
        "9===1===9===1===9" => true

 */
