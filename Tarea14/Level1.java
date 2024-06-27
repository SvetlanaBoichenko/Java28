    import java.util.*; 

    public class Level1
    {
        public static int Unmanned (int L, int N, int [][] track) {   //3
            int[][] track1 = track.clone();

            int Tcur = 0;          // real cur pos//
            int Tlenold = 0;       // old len from array without dt
            int sv1, sv2  = 0;     // T semaforo
            int dt   = 0;          // Wait
            int dtsv = 0;          // leave in red
            int Tlen = 0;

            for (int i = 0; i < track1.length; i++) {
                int [] subtrack = track1[i];
                Tlen = subtrack [0];
                sv1 = subtrack [1];
                sv2 = subtrack [2];

                int svo = sv1 + sv2;
                Tcur += Tlen-Tlenold;// +dt;
                Tlenold = Tlen;

                if(Tcur < sv1){
                    dt = 0;
                    Tcur = sv1;//+= dt;
                    continue;
                }

                int n = Tcur /svo; //
                int ost = Tcur % svo;

                if (ost == 0) {
                    Tcur += sv1;
                    dt = 0;
                    continue;
                }

                ost = Tcur - n*svo;

                if (sv1 > ost){
                    dt = sv1-ost;
                }
                else dt = 0;

                Tcur += dt;
            }
            Tcur += (L - Tlenold);
            return Tcur;
        }


    }



