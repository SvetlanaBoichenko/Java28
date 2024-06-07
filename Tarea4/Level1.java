public class Level1 {

    public static int [] funcmin (int [] tele1, int l) {

        int lmin = 0;
        int[] tele2 = new int[l];

        for (int i = 0; i < l; i++) {
            if (i == 0) {
                lmin = tele1[0];
                tele2[0] = lmin;
            }
            else {
                if (tele1[i] < lmin) {
                    lmin = tele1[i];

                    int index = i;
                    while (index > 0) {
                        if (tele2[index-1] > lmin) {

                            tele2[index] = tele2[index-1];
                            tele2[index - 1] = lmin;
                        }
                        else
                            tele2[index - 1] = lmin;

                        index--;
                        }
                    }
                else tele2[i] = tele1[i];
                }
            }
        return tele2;
    }

    public static int [] funcback (int [] tele2, int N) {
        int  N2 = N/2;
        int [] newtele = tele2.clone();
        int k = N-1;

        for (int i = N2; i< N; i++) {
            int temp = newtele [i];
            newtele[i] = newtele [k];
            newtele [k] = temp;
            k--;
            if (k - i <= 1) break; // nechet count of arr
        }

     return newtele;
    }


    public static int [] MadMax (int N, int [] Tele) {
        int N1 = N/2;
        int N2 = N - N1;

        int[] newtele = funcmin (Tele, N);
        int[] newtele1 = funcback (newtele, N);

        return newtele1;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] ishmatrix  = {3,2,6,8,1};
        MadMax (5, ishmatrix);
    }
}