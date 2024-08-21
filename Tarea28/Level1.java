public class Level1
{
    public static String Keymaker(int k)
    {
       int []a = new int [k];

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                if (j % i == 0 && a[j - 1] == 0) {
                    a[j - 1] = 1;
                    continue;
                }
                if (j % i == 0 && a[j - 1] == 1)
                    a[j - 1] = 0;
            }
        }

        String s1 = "";
        for (int j = 0; j< k; j++) {
            s1 = s1 + String.valueOf(a[j]);
        }

        return s1 ;
    }

    public static void main(String[] args) {
        String s = Keymaker(25);

        System.out.println(s);
    }
}