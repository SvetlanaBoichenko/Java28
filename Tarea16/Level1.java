
public class Level1
{
    public static int [] funcsortback (int [] arr1, int L) {
        int Lmax = 0;
        int[] arr2 = new int[L];

        for (int i = 0; i < L; i++) {
            if (i == 0) {
                Lmax = arr1[0];
                arr2[0] =  Lmax;
            }
            else {
                if (arr1[i] > Lmax) {                     //
                    Lmax = arr1[i];

                    int index = i;
                    for (index = i; index > 0; index-- ) {
                        if (arr2 [index-1] < Lmax) {         // 

                            arr2 [index] = arr2 [index-1];
                            arr2 [index - 1] = Lmax;
                        }
                        else
                            break;        //
                    }
                }
                else arr2[i] = arr1[i];
            }
            Lmax = arr2[i];
        }
        return arr2;
    }


    public static int MaximumDiscount(int N, int [] price)
    {
        int [] B =  funcsortback (price, N);
        int bsum = 0;

        for (int i = 1; i <= N; i++ ) {
            if (i % 3 == 0) {
                bsum += B[i-1];
            }
        }
        return bsum ;
    }


} 



