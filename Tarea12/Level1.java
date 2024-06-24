
//import java.util.*;

public class Level1 {

    public static String MassVote(int N, int [] Votes)
    {
        //  max votas
        int vmax = 0;
        int ind = -1 ;

        String retstr = "";

        for (int i = 0; i < N; i++) {
            if (Votes[i] == vmax) {
                ind = -1;
            }

            if (Votes[i] > vmax) {
                vmax = Votes[i];
                ind = i;
            }
        }

        if (ind < 0)
            return "no winner";

        double sum = 0.0;
        double per = 0.0;

        for (int i = 0; i < N ; i++) {
            sum = sum +(double)Votes[i];
        }

        per =  (vmax / sum )* 100.0;    // %
        per = Math.round(per * 1000);
        per = per / 1000;


        String sindex = String.valueOf(ind+1);

        if ( per >= 50.000)
            retstr = "majority winner " +  sindex;
        else
            retstr = "minority winner " +  sindex;

        return retstr ;
    }


    public static void main (String[] args) {

        int [] Votes = {1,4,3,4,5,1,11,1,2};

        String s =  MassVote(9, Votes);
        System.out.println("Hello world!");
    }

}