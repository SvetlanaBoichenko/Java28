import java.util.*;

public class Level1 {

    public static HashMap initmap(int[][] shema, int x, int y) {

        HashMap<Integer, Integer[]> buttmap = new HashMap();
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++) {
                Integer[] coord = {i, j};
                buttmap.put(shema[i][j], coord);
            }
        return buttmap;
    }

    public static double maptosum(HashMap<Integer, Integer[]> bmap, int[] bhist, int N) {
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

            if (Math.abs (x1 - x2) == 1)
                d1 = 1;
            if (Math.abs (y1 - y2) == 1)
                d2 = 1;
            if ((d1 + d2) == 1)
                res = res + 1;
            else
                res = res + Math.sqrt(2);   //1.41421356237;
        }
        return res;
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

        HashMap<Integer, Integer[]> butmap = new HashMap();
        butmap = initmap (buttshema, buttshema.length, buttshema[0].length);

        double sum = maptosum ( butmap, hits,  N); // sum of all dists

        String str = String.format("%.5f",sum); // per = 5!

        str = delsymb (str, ',');
        str = delsymb (str, '0');

        return str;
    }


}





