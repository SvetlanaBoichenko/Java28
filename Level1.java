import java.util.*;

public class Level1 {
    Level1() {
    };

    public static int myfact(int num) {
        if (num == 1) return 1;
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res = res * (i);
        }
        return res;
    }

    public static int squirrel(int N) {
        int fact = myfact(N);       // N! nuts

        while (fact >= 10) {        // looking for the first num
            fact = fact / 10;       // delete last num
        }

        return fact;
    }


}



        
