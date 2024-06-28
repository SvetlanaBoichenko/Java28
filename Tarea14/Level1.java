import java.util.*;

        public class Level1
        {
            public static int Unmanned (int L, int N, int [][] track) {   //3

                int Tcur = 0;          // real cur pos//
                int sv1, sv2  = 0;     //  semaforos

                int dtcomm = 0;          // stop in red
                int Len1 = 0;
                int Lenold = 0;         // old len  without dt

                for (int i = 0; i < N; i++) {
                    int [] subtrack = track[i];
                    Len1 = subtrack [0];

                    if (Len1 >= L) {
                        break;
                    }

                    sv1 = subtrack [1];
                    sv2 = subtrack [2];

                    Tcur += Len1 - Lenold;       // +next pos
                    Lenold = Len1;

                    if (Tcur < sv1){
                        dtcomm += sv1-Tcur;
                        Tcur = sv1;
                        continue;
                    }

                    int ost = Tcur % (sv1 + sv2);

                    if (ost == 0) {
                        Tcur += sv1;
                        dtcomm += sv1;
                        continue;
                    }

                    if (sv1 > ost){
                        Tcur+= (sv1-ost);
                        dtcomm += (sv1-ost);
                    }

                }
                return (L + dtcomm);        
            } 

                
        }


            


