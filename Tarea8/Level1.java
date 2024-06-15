public class Level1
{
    public static int SumOfThe(int N, int [] data)
    {
        int Sum = 0;
        int S = 0;
        int sindex = 0;

        for (int i = 0; i< N; i++) {
            Sum = Sum + data[i];
        }

        for (int i = 0; i< N; i++) {
            if (Sum - data[i] == data[i]) {
                sindex = i;
                break;
            }
        }
        S = data [sindex];

        return S ;
    }
    public static void main(String[] args) {
        int [] data = {1,-2,3,4,5,6, 17};
        int summa =  SumOfThe ( 7,  data);


    }
}