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


    public static void main(String[] args) {
        int a[] = {1,2};
        boolean b = TransformTransform (a, 1);

       System.out.println(b);
    }
}




//На входе одномерный массив A (индексация начинается с нуля) случайных положительных целых чисел (возможно, повторяющихся).
// Трансформирующая трансформация S массива A происходит так:
// 0. Выходной массив/список B исходно пуст.
//  1. Организуем первый цикл для i, начиная с 0 и до длины массива A минус 1.
// 2. Организуем внутри первого цикла второй цикл для j, начиная с 0 и до длины массива A минус i минус 1.
//3. Рассчитываем значение k = i + j.
// 4. Из поддиапазона A[ j..k ] выбираем максимальное значение и записываем в конец списка B.
//  По завершении всех циклов список B считаем трансформирующей трансформацией, которую назовём S(A).
//  Говоря программистским языком, есть функция S(A), которая возвращает список B.
//  5. Ключевой ключ находится суммированием всех элементов списка, получаемого двойной
//  трансформацией S(S(A)) (результат первой трансформации подаётся на вход второй трансформации).