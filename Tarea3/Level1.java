public class Level1 {

    public static int ConquestCampaign(int N, int M, int L, int[] battalion) {
        int counter = 0;

        int Lnext = L * 2 - 1;
        int x, y;
        int day = 1;
        int ocup = L;
        int counter_old = L;

        int[][] battalion2 = new int[N][M];  // Array for new coord
        int[] battalion1 = new int[M * N * 2];

        for (int j = 0; j < M * N * 2; j++) {
            battalion1[j] = -1;
        }

        for (int j = 0; j < L * 2; j++) {
            battalion1[j] = battalion[j] - 1;
        }

        for (int n = 0; n <= Lnext; n += 2) {  // count of coord

            if (ocup <= 0) {
                day++;
                ocup = counter - counter_old; //cuanto cuadrados ocupamos por 1 dia
                counter_old = counter;
            }

            ocup--;

            x = battalion1[n];
            y = battalion1[n + 1];

            if (battalion2[x][y] == 0) {
                battalion2[x][y] = 1;

                counter++;
            }

            int x1 = x;
            x1--;
            for (int a = 0; a < 3; a++) {
                if (x1 < N & y < M & x1 >= 0 & y >= 0) {   // los vecinos  x != x1 &

                    if (battalion2[x1][y] == 0) {
                        battalion2[x1][y] = 1;
                        battalion1[++Lnext] = x1;
                        battalion1[++Lnext] = y;

                        counter++;
                    }
                }
                x1++;
            }
            int y1 = y;
            y1--;
            for (int a = 0; a < 3; a++) {
                if (x < N & y1 < M & x >= 0 & y1 >= 0) {       // los vecinos & y != y1

                    if (battalion2[x][y1] == 0) {
                        battalion2[x][y1] = 1;
                        battalion1[++Lnext] = x;
                        battalion1[++Lnext] = y1;

                        counter++;
                    }
                }
                y1++;
            }

        }
        return day;
    }


}



    public static void main (String[]args){
        int[] batt = {1,1, 3,5, 4,4};
        int day = 0;
        day = ConquestCampaign(7, 8, 3, batt);

        day = day + 1;
    }
}
