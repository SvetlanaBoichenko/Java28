import java.util.*;

public class Level1
{
    public static String Fmas (String sinput) {
        int len = sinput.length();
        char[] arr = new char [len];
        arr = sinput.toCharArray();

        for (int i = len-1; i > 1; i-- ) {
            char ch1 = arr [i - 1];
            char ch2 = arr [i];

            if (arr [i - 1] < arr [i]) {
                char tmp = arr[i - 1];
                arr [i - 1] = arr [i];
                arr [i] = tmp;

                String sres = new String(arr);
                return sres;
            }
        }
        return "";
    }

    public static char [] revers (char [] arr1) {
       int j = arr1.length-1;
        for (int i = 0; i < arr1.length/2; i++) {
            char a = arr1 [i];
            arr1[i] = arr1[j];
            arr1[j] = a;
            j--;
      }
        return arr1;
    }

    
    public static String BiggerGreater(String input)
    {
        String sresult = Fmas (input);

        if (sresult != "")
            return sresult;


        int len = input.length();
        String sresult2 = input.substring(1, len);
        char [] arr =  new  char [len-1];

        arr = sresult2.toCharArray();

        revers (arr);
        char ch = input.charAt(0);
        char ch2 = ' ';

        for (int i = 0; i < len-1; i++) {
            if (ch < arr [i]) {
                ch2 = arr [i];
                arr [i] = ch;
                sresult = new String (arr);

                return String.valueOf(ch2) + sresult;
            }
        }

        return "";
    }

  
}



