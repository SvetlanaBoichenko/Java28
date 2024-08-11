import java.util.*;

public class Level1
{
    public static void MatrixChange (char[][] stmp, char[][] stmp2) {
        int S1 = stmp.length;
        int S2 = stmp[0].length;

        for (int x = 0; x < S1; x++) {
            for (int y = 0; y < S2; y++) {
                stmp[x][y] = stmp2[x][y];
            }
        }
    }

    public static void Turn1( char[][] stmp, int nvlt) {
        int pos = 0;
        int H = stmp.length;
        int W = stmp[0].length;

        for (int i = 0; i < nvlt; i++) {
            pos = i;
            MatrixTurn1(stmp, pos, H, W);
            W = W - 2;
            H = H - 2;
        }
    }

   public static void MatrixTurn1 (char[][] stmp, int pos,  int H, int W){
            int S1 = stmp.length;
            int S2 = stmp[0].length;

            char[][] stmp2 = new char[S1][S2];

            for (int x = 0; x < S1; x++) {
                for (int y = 0; y < S2; y++) {
                    stmp2[x][y] = stmp[x][y];
                }
            }
       //--------------------line--------------------------
       int i = pos;  // Line1 ->
            int j ;
       for (j = pos + 1; j < pos + W; j++) {
           stmp2[i][j]  =  stmp[i][j - 1];
       }

       i = pos + H - 1;     // line M <-
       for (j = pos + W - 1; j > pos; j--) {
           stmp2[i][j - 1] = stmp[i][j];
       }
      //------------row---------------------------------
       j = pos + W - 1; //row1 V
       for (i = pos; i < H + pos-1; i++) {
           stmp2[i + 1][j] = stmp[i][j];
       }

       i = pos + H -1;
       j = pos;         // row N ^
       for (i = pos + H -1; i > pos; i--) {
           stmp2[i-1][j] = stmp[i][j];
       }

       MatrixChange ( stmp, stmp2);
   }

    public static void MatrixTurn(String Matrix[], int M, int N, int T)
    {
        char[][] stmp = new char[M][N];
        for (int i = 0; i < M; i++) {
             stmp[i] = Matrix[i].toCharArray();
        }

        int nvlt = 0;
        if (M <= N)
            nvlt = (M+1)/2;
        else
            nvlt = (N+1)/2;

        for (int count = 0; count < T; count++) {
            Turn1 (stmp, nvlt);
        }

        String[] tmp = new String[M];

        for (int i = 0; i < M; i++) {
            Matrix[i] = new String (stmp[i]);
        }
    }

    
}




