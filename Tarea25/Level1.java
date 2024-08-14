import java.util.*;

public class Level1
{
    public static int sum (int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr [i];
        }
        return sum;
    }
    //-------------------------------
    public static int amax (int A[], int j, int k) {
        int mx = 0;

        if (j >= 0 && j<A.length) {
           mx = A[j];
        }
        for (int i = j; i <= k; i++) {

            if (A[i] > mx) {
                mx = A[i];
            }
        }
        return mx;
    }
    //---------------------------------------------
    public static int[] S (int A []) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        int N = A.length;
        int max = 0, k = 0;

        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= N - i - 1; j++) {
                k = i + j;
                max = amax (A, j, k);
                B.add (max);
            }
        }
       int [] ret = new int[B.size()];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = B.get(i);
        }
        return ret;
    }
    //-------------------------------------
    public static boolean TransformTransform(int A[], int N) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        int A1[] = S (S(A));
        int s = sum (A1);

        if (s % 2 == 0)
            return  true;

        return false;
    }


}



