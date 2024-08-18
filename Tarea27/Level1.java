public class Level1
{
    public static boolean isSort (int [] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int MinIndex (int [] arr, int k, int len) {
        int min = arr[k];
        int ind = k;

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[k];
                ind = i;
            }
        }
        return ind;
    }

    public static int [] ChangeIndex (int [] arr, int i1, int i2) {
        int temp = arr[i1];

        arr[i1] = arr[i2];
        arr[i2] = temp;
        return arr;
    }


    public static int [] MoveNum (int [] arr, int in, int itek) {

        for (int i = in; i < itek; i++) {
            int temp = arr[i];
            arr[i] = arr [itek];
            arr [itek] = temp;
            itek--;

        }
        return arr;
    }

    public static boolean Football(int F[], int N)
    {
        if (isSort (F)) return true;

        int [] F1 = F.clone();
        int len = F.length;
        int minindex = 0;

        for (int i = 0; i < len; i++){  // ищем мин и его индекс
            minindex = MinIndex (F, i, len);

            if (minindex == i) {
                continue;
            }
            // индекс мин больше чем надо
            // 1. перестановка
            ChangeIndex (F1, i, minindex);
            if (isSort (F1)) return true;

            F1 = F.clone();
            MoveNum(F1, i, minindex);
            break;
           // return (isSort (F1)) ;
        }
        return (isSort (F1)) ;
    }


    public static void main(String[] args) {
        int arr2[] = {1,3,2};    // 1,5,4,3,2,6  // 9, 5, 3, 7, 1
       boolean b = Football(arr2, 4);
        System.out.println(b);

    }
}

// 1. тсортирован ли
// Находим минимум  и его i
// Если мин на своем месте, продолжаем
// если нет - меняем местами с нужным i
// или - делаем поворот части массива начиная с мин(i)
