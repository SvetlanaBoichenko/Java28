public class Level1 {
    Level1() {
    }

    public static int odometer(int[] oksana) {
        int dist = 0;  // rasstoyanie
        int dt = 0;
        int v = 0;

        for (int i = 0; i < oksana.length; i += 2) {
            if (i == 0) {
                v = oksana[0];
                dt = oksana[1];
            } else {
                dt = oksana[i + 1] - oksana[i - 1];
                v = oksana[i];
            }
            dist = dist + dt * v;
        }

        return dist;
    }


//}





    public static void main (String[]args){
        Level1 lev = new Level1 ();
        int [] ksana = {10,1, 20,2, 10,5, 1,10, 4, 33};
        int s = lev.odometer(ksana);
    }

}