import java.util.*;

public class Level1 { 
    
    public static HashMap initmap (int[][] shema, int x, int y) {
        HashMap<Integer, Integer[]> buttmap = new HashMap();
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++) {
                Integer[] coord = {i, j};
                buttmap.put(shema[i][j], coord);
            }
        return buttmap;
    }
   
    public static double maptosum(HashMap<Integer, Integer[]> bmap, int[] bhist, int N, double m1, double m2) {
        Integer[] curcoord;
        Integer x2, y2, x1, y1;
        double res = 0.0;

        for (int i = 1; i < N; i++) {
            curcoord = bmap.get(bhist[i]);
            x2 = curcoord[0];
            y2 = curcoord[1];

            curcoord = bmap.get(bhist[i - 1]);
            x1 = curcoord[0];
            y1 = curcoord[1];
            int d1 = 0;
            int d2 = 0;

            if ((x2 - x1) == 1 | (x1 - x2) == 1)
                d1 = 1;
            if ((y2 - y1) == 1 | (y1 - y2) == 1)
                d2 = 1;
            if ((d1 + d2) == 1)
                res = res + m1;
            else
                res = res + m2;
        }
        return res;
    }
  
    public static int ndosymb(String str, char el) {
        int nt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == el)
                break;
            nt++;
        }
        return nt;
    }
   
    public static String delsymb(String inpstr, char el) {
        String retstr = inpstr;
        char[] ca = retstr.toCharArray();
        int L1 = ca.length;
        int L2 = L1;

        for (int j = 0; j < L1; j++) {
            char c = retstr.charAt(j);
            if (c == el)
                L2--;
        }
        char[] ca2 = new char[L2];
        int n = 0;
        for (int i = 0; i < L1; i++) {
            if (ca[i] != el & n < L2) {
                ca2[n] = ca[i];
                n++;
            }
        }
        retstr = new String(ca2);
        return retstr;
    }

    public static String PatternUnlock (int N, int [] hits) {
        int [][] buttshema = {{6,1,9},{5,2,8},{4,3,7}};
        String str = "";
        int per = 5;            // percit = 5
        double m1 = 1.0;        // dist 1
        double m2 = 1.41421356237;   //  dist 2 per =6 no es obligatorio 5 aqui

        HashMap<Integer, Integer[]> butmap = new HashMap();
        butmap = initmap (buttshema, buttshema.length, buttshema[0].length);

        double sum = maptosum ( butmap, hits,  N, m1, m2 ); // sum of dists

        str = Double.toString (sum);
        char p = '.';
        int nt = ndosymb (str, p);        // n simb after the '.' (+ perc = 5)
        int len = 0;

        if (str.length() > nt + per)
            len = nt + per;
        else
            len = str.length();

        for (int i = 1; i<= per; i++)
            sum = sum * 10;     //9.999999 -> 999999.9  99.99999->9999999  9->90000

        str = Double.toString (sum);

        if (str.length() > len) {
            str = str.substring (0, len );
        }
        str = delsymb (str, '0');
        return str;
    }

    
}



