import java.util.*;

public class Level1
{
    public static int [] SetToPlace (int num, int pos, int [] arr) {
        int [] newarr = arr.clone();
        int len = arr.length;
        int tmp;
        if (pos +1 == num)
            return newarr;
        for (int i = pos; i >= 0; i--) {
            if (pos + 1 - num >= 2) {            // 2 vueltas
                tmp = newarr[pos - 2];
                newarr[pos - 2] = num;
                newarr[pos] = tmp;
                tmp = newarr[pos - 1];
                newarr[pos - 1] = newarr[pos];
                newarr[pos] = tmp;
                pos = pos-2;
            } else if (pos + 1 - num == 1 & pos+1 < len) {    // 1 vuelta
                tmp = newarr[pos - 1];
                newarr[pos - 1] = num;
                newarr[pos] = tmp;

                tmp = newarr[pos + 1];
                newarr[pos + 1] = newarr[pos];
                newarr[pos] = tmp;
                pos = pos-1;
            }
            else
                return newarr;
        }
            return newarr;
    }

    public static boolean MisterRobot(int N, int [] data)
    {
        int x = 1;

        int [] dataord = data.clone();
        int [] dataish =  data.clone();
        int len = data.length;

        for (int i = 0; i < N; i++) {
            if ( dataish [i] == x) {
                if (x == i + 1) continue;

                dataord = SetToPlace (x, i, dataish);

                if (dataord != null)
                    dataish = dataord.clone();
                i = 0;
                x++;
                if (x > N-2) break;
            }
        }

        if (dataord [len-2] < dataord [len-1])
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int [] t = {5,4,3,2,1};
        boolean b = MisterRobot(5, t);

        System.out.println(b);
    }
}