import java.util.*;

public class Level1
{
    public static  String[] StrToStrArr (int H, int W, String S1)  {
        String S11 = S1.replace(" ", "");
        char cha[] = S11.toCharArray();
        char[][] cha2 = new char[H][W];

        int i = 0;
        int k = 0;
        for (i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                cha2[i][j] = cha[k];
                k++;
            }
        }
        String[] sa2 = new String[H];

        for (int n = 0; n < H; n++) {
            sa2[n] = new String (cha2[n]);
        }
        return sa2;
    }


    public static  int[] [] StrToIntArr (String[] S) {

        int [][] si = new int [S.length][S[0].length()];

        for (int i = 0; i < S.length; i++) {
             for (int j = 0; j < S[i].length(); j++) {
                 char a = S[i].charAt(j);
                 int el = Character.getNumericValue(a);
                 si [i][j] = el;
             }
        }
        return si;
    }

    public static boolean  ifsubarr2 (int [][] tab1, int [][]tab2, int i, int j) {
        int ii,jj, k=0, l= 0;
        boolean res = false;

        int x1 = tab1.length;
        int x2 = tab2.length;
        int y1 = tab1[0].length;
        int y2 = tab2[0].length;
        int[][] temp = new int[x2][y2];

        for (ii = i; ii < x2+i; ii++) {
            l = 0;
            for (jj = j; jj < (y2+j); jj++) {
                temp[k][l] = tab1[ii][jj];
                l++;
            }
            k++;
        }

        res = Arrays.deepEquals(tab2, temp);
        return res;
    }

    public static boolean ifsubarr (int [] array1 , int[] array2, int x , int y ) {
        int i, j = 0;
        for (i = 0; i < y; i++) {
            for (j = 0; j < x; j++)
                if (array2[i] == array1[j])
                    break;
            if (j == x)
                return false;
        }
        return true;
    }

    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2)
    {
        boolean fret = false;

        String [] S11 = StrToStrArr (H1, W1, S1);
        String [] s22 = StrToStrArr (H2, W2, S2);

        int [][] tab1 = StrToIntArr (S11);
        int [][] tab2 = StrToIntArr (s22);

        int i,j = 0;

        for (i = 0; i <= tab1.length-tab2.length; i++ ) {
            for (j = 0; j <= tab1[0].length - tab2[0].length; j++) {
                fret = ifsubarr2(tab1, tab2, i, j);
                if (fret)
                    return fret;
            }
        }
        return fret;
    }




    public static void main(String[] args) {

        String S111 = "1234567 2345567 0987567 0999568";
        String S221 = "10";

        boolean f = TankRush (4, 7, S111, 1, 2, S221);
        System.out.println(f);
    }
}


    /*

     public static int [][] StringsToFlagArray (String []S11, String []s22, int H1, int H2, int x) {
    int i = 0;
    int j = 0;
    String subsa;
    int index = 0;
    int n = -1;
    int k = 1;
    int [][] tab  = new int [x][x];

      for (i = 0; i< x; i++)
          for (j = 0; j < x; j++) {
              tab [i][j] = 0;
          }


      for (i = 0; i < H2; i++) {                              // цикл по мал массиву 34  98
          subsa = new String(s22[i]);                    // переход на след строку

          for (j = i; j < H1; j++) {                           // цикл по бол массиву  1234 2345 0987 - поиск малой строки
              String sa = new String(S11[j]);

              for (int y = 0; y < sa.length(); y++) {
                  n = sa.indexOf(subsa, index);  // int ind ex Of ( S tring str, int starti nd ex
                  if (n >= 0) {
                      tab[j][n] = k;
                      index = n + 1;
                      n = -1;
                  }
              }
              index = 0;
          }
          k++;
      }
      return tab;
  }

     public static int [][] transp (int [][] tab, int x) {
        int i = 0;
        int j = 0;

        for (i = 0; i < x; i++) {
            for (j = i + 1; j < x; j++) {
                int temp = tab[i][j];
                tab[i][j] = tab[j][i];
                tab[j][i] = temp;
            }
        }
        return tab;
    }
    if (ind1[i] >= 0) {                                      //  найдена
                    String s = sa.replaceAll(subsa, " ");     // заменить найденную подстроку на "  ";
                    S11[j] = s;

                    if (naydeno == true) {      //  Уже было
                        if (ind1[i] == ind1[i - 1]) {
                            f = true;
                            break;
                        }
                        else {                // уже было но индекс след - другой
                             i = -1;            // сначала все - ищем подстроку еще раз - сначада
                            f = false;
                            naydeno = false;
                            break;
                        }
                    }
                    else {

                        naydeno = true;
                        continue;
                    }
                }
                else {
                        if(naydeno == false) // просто не найдено первый раз
                            continue;
                        else {
                            i = -1;            // сначала все - ищем подстроку еще раз - сначада
                            f = false;
                            naydeno = false;
                            break;
                        }


                    }
            }*/