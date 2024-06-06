public class Level1 {

    public static  int [][] desembarco (int n, int m, int [] arrcoord) {  //new desembarco if repite
        int[][] bat2 = new int [n][m];           // carta de desembarco
        for (int i = 0; i < arrcoord.length; i += 2) {
           int x = arrcoord [i];
           int y = arrcoord [i+1];
           bat2 [x-1][y-1] = 2;
        }
        return bat2;
    }

    static int[][]  set1 (int N, int M, int[][] batt2) {
        int i, j, i1, j1 = 0;
        int[][] batt = batt2.clone();

        for (i = 0; i < N; i++)
            for (j = 0; j < M; j++) {
                if (batt[i][j] == 2) {
                    batt[i][j] = 1;

                    i1 = i - 1;
                    if (i1 >= 0 && i1 < N)
                        if (batt[i1][j] == 0)
                            batt[i1][j] = 1;
                    i1 = i + 1;
                    if (i1 >= 0 && i1 < N)
                        if (batt[i1][j] == 0)
                            batt[i1][j] = 1;
                    j1 = j - 1;
                    if (j1 >= 0 && j1 < M)
                        if (batt[i][j1] == 0)
                            batt[i][j1] = 1;
                    j1 = j + 1;
                    if (j1 >= 0 && j1 < M)
                        if (batt[i][j1] == 0)
                            batt[i][j1] = 1;
                }
            }
        return batt;
    }

    public static int[][] set2 (int N, int M, int[][] batt3) {
        int i, j = 0;
        int[][] batt = batt3.clone();
        boolean is1 = false;

        for (i = 0; i < N; i++)
            for (j = 0; j < M; j++) {
                if (batt[i][j] == 1)
                    batt[i][j] = 2;
                if(is1 == false) is1 = true;
                }
        return batt;
    }

    public static boolean hayzerr (int N, int M, int[][] batt) {
        int i, j = 0;

        for (i = 0; i < N; i++)
            for (j = 0; j < M; j++) {
                if (batt[i][j] == 0)
                return true;
            }
        return false;
    }

    public static int ConquestCampaign (int N, int M, int L, int[] battalion) {
        if (battalion.length == 0 ) return 0;

        int[][] battalion2 = desembarco(N, M, battalion);  // Array for new coord
        int day = 1;

        if (L >= M*N)
            return day;

        boolean hayzerro = true;

        while (hayzerro) {
            hayzerro = hayzerr (N, M, battalion2);
            if (hayzerro) {
                day++;
            }
            else break;

            battalion2 = set1(N, M, battalion2);
            battalion2 = set2 (N, M, battalion2);
        }
        return day;
    } 

    
}


  


