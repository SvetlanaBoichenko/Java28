import java.util.*;

public class Level1 {
    public static int[][] Inittab(int H, int W, int N, String[] tree) {
        int[][] tab = new int[H][W];

        for (int i = 0; i < H; i++) {
            String str = tree[i];
            for (int j = 0; j < W; j++) {
                if (str.charAt(j) == '+')
                    tab[i][j] = 1;
                else
                    tab[i][j] = 0;
            }
        }
        return tab;
    }

    public static int[][] Ramas1(int[][] treetab) {
        for (int i = 0; i < treetab.length; i++) {
            for (int j = 0; j < treetab[0].length; j++) {
                treetab[i][j]++;
            }
        }
        return treetab;
    }


    public static int[][] Rem1(int x, int y, int[][] treetab) {
        int H = treetab.length;
        int W = treetab[0].length;

        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

        if (x > 0)
            x1 = x - 1;


        if (x < H - 1)
            x2 = x + 1;

        if (x >= H - 1)
            x2 = H-1;


        if (y > 0)
            y1 = y - 1;


        if (y < W - 1)
            y2 = y + 1;

        if (y >= W - 1)
            y2 = W-1;


        if (treetab[x][y1] <= 2)
            treetab[x][y1] = 0;

        if (treetab[x][y2] <= 2)
            treetab[x][y2] = 0;

        if (treetab[x1][y] <= 2)
            treetab[x1][y] = 0;

        if (treetab[x2][y] <= 2)
            treetab[x2][y] = 0;

        return treetab;
    }

    public static int[][] Rem3(int n, int[][] treetab) {
        int H = treetab.length;
        int W = treetab[0].length;

        for (int x = 0; x < H; x++) {
            for (int y = 0; y < W; y++) {
                if (treetab[x][y] >= n) {
                    treetab[x][y] = 0;
                }
            }
        }
        return treetab;
    }


    public static int[][] Rem(int[][] treetab, int H, int W) {

        for (int x = 0; x < H; x++) {
            for (int y = 0; y < W; y++) {
                if (treetab[x][y] > 2) {
                    Rem1(x, y, treetab);
                }
            }
        }

          Rem3(3, treetab);
        return treetab;
    }

    public static String[] TreeOfLife(int H, int W, int N, String[] tree) {
        int[][] treetab = Inittab(H, W, N, tree);


        for (int i = 0; i < N; i++) {
            Ramas1(treetab);
            if (i % 2 != 0)
                Rem(treetab, H, W);
        }

        String[] res = new String[H];
        String curstr = "";

        for (int i = 0; i < H; i++) {
            res[i] = "";
            for (int j = 0; j < W; j++) {
                if (treetab[i][j] == 0) {
                    curstr = ".";
                } else {
                    curstr = "+";
                }
                res[i] = res[i] + curstr;
            }
        }
        return res;
    }

    
} 



