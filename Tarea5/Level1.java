
 import java.util.*;

 public class Level1
    {
        public static int [] funcsort (int [] tele1, int L) {
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


       public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {
           int idssort[] = funcsort(ids, N);
           int salarysort[] = funcsort(salary, N);

           int[] newtabsalary = new int[N];

           HashMap<Integer, Integer> idsalary = new HashMap();

           for (int i = 0; i < N; i++) {
               int k = idssort [i];
               int val = salarysort [i];
               idsalary.put (k, val);
           }

           for (int j = 0; j < N; j++) {
                int nextkey = ids [j];
               newtabsalary[j] = idsalary.get (nextkey);
            }
           return newtabsalary;
        }


    public static void main(String[] args) {
        int tabsotr[] = {11,13,1,5,3,10};
        int tabsalold[] = {40,40,30,10,35,10};

        int [] synctabsalary = SynchronizingTables(6, tabsotr,tabsalold);

    }
}