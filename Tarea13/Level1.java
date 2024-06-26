import java.util.*;

public class Level1
{
    public static int changeroot (int num, boolean octal) {
        int rt;
        if (octal) {
            rt = 8;
        }
        else {
            rt = 16;
        }

        int ost = 0;
        int res = 0;
        int rt1 = 1;

        int cnum = num;
        while (cnum > 0) {
            ost = cnum % 10;     // last pos
            res = res + (ost * rt1);
            rt1 *= rt;
            cnum /= 10;       // detele last pos
        }
        return res;
    }

    public static int [] UFO(int N, int [] data, boolean octal) {
        int len   = data.length;
        int [] resarr = new int [len];
        for (int i = 0; i < len; i++){
            resarr[i] = changeroot (data[i], octal);
        }

        return resarr;
    }

 
} 



