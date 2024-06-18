
import java.util.*;

public class Level1
{
    public static String Codirovka (String s) {
        String s2 = s;
        String str2 = s2.replaceAll(" ", "");
        int len = str2.length();

        double sq = Math.sqrt(len);
        int nx = (int) Math.floor(sq);
        int ny = (int) Math.ceil(sq);

            while (nx * ny < len)
                nx++;

            char[] tempstr = new char[nx * ny + ny];
            int k = 0;
            int i, j;
            int dx = 0;
            String b2 = "";

            for (i = 0; i < ny; i++) {
                for (j = 0; j < nx; j++) {
                    tempstr[dx] = str2.charAt(i + k);
                    k += ny;
                    dx++;

                    if (i + k >= str2.length()) {
                        k = 0;
                        break;
                    }
                }
                tempstr[dx] = ' ';
                dx++;
            }
            b2 = (String.valueOf(tempstr)).trim();

        return b2;
    }

    public static String DeCodirovka (String s) {
        String b2 = s;
        int L1 = b2.length();
        int dx = 1;     // dx - probrel shift
        int i, j;       // i - string count
                        // j - colnum count
        int pos = 0;    // pos - cur pos

        int x = b2.indexOf(' '); // count of y - stolbcy
        char[] tmpstr2 = new char[L1];

        for (i = 0; i < x; i++) {
            tmpstr2[pos] = b2.charAt(i);
            pos++;

            for (j = i; j < L1; j++) {
                if (b2.charAt(j) == ' ') {
                    if (j + dx >= L1)
                        break;
                    else {
                        tmpstr2[pos] = b2.charAt(j + dx);
                        pos++;
                    }
                }
            }
            dx++;
        }

        String b3 = new String(tmpstr2);
        b3 = b3.trim();
        return b3;
    }

    public static String TheRabbitsFoot(String s, boolean encode) {

        String scode = "";

        if (encode == true)
           scode = Codirovka (s);
        else
          scode = DeCodirovka (s);

       return scode;
    }


} 



