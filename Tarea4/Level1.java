public class Level1 {

    public static int [] funcsort (int [] tele1, int L) {
        //int L = tele1.length;
        int Lmin = 0;
        int[] tele2 = new int[L];

        for (int i = 0; i < L; i++) {
            if (i == 0) {
                Lmin = tele1[0];
                tele2[0] =  Lmin;
            }
            else {
                if (tele1[i] < Lmin) {
                    Lmin = tele1[i];

                    int index = i;
                    while (index > 0) {
                        if (tele2 [index-1] > Lmin) {

                            tele2 [index] = tele2 [index-1];
                            tele2 [index - 1] = Lmin;
                        }
                        else
                        break;//****

                        index--;
                        }
                    }
                else tele2[i] = tele1[i];
                }
            Lmin = tele2[i];
            }
         return tele2;

    }

    public static int [] funcreverc (int [] tele2, int N) {
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

        int[] newtele = funcsort (Tele, N);
        int[] newtele1 = funcreverc (newtele, N);

        return newtele1;
    }

 
} 


