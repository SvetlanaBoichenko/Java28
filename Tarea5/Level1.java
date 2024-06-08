import java.util.*;

 public class Level1
    {
        public static int [] funcsort (int [] arr1, int L) {
            int Lmin = 0;
            int[] arr2 = new int [L];

            for (int i = 0; i < L; i++) {
                if (i == 0) {
                    Lmin = arr1 [0];
                    arr2[0] =  Lmin;
                }
                else {
                    if (arr1 [i] < Lmin) {
                        Lmin = arr1 [i];

                       for ( int index = i; index > 0; index --) {

                            if (arr2 [index-1] > Lmin) {

                                arr2 [index] = arr2 [index-1];
                                arr2 [index - 1] = Lmin;
                            }
                            else
                                break;    //****
                        }
                    }
                    else arr2[i] = arr1[i];
                }
                Lmin = arr2[i];
            }
            return arr2;
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


} 



