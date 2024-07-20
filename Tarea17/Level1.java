import java.util.*;

public class Level1
{
    public static boolean LineAnalysis(String line)
    {
        String s1 = line;

        if (!s1.startsWith("*") || !s1.endsWith("*"))
            return false;
        if (s1.length() == 1)
            return true;

        s1 = s1.substring(1);
        int ind = s1.indexOf ('*');

        String s2 = s1.substring(0, ind);
        int slen = s1.length();

        for (int i = 0; i < slen; i++) {
           String scur = s1.substring(0, ind);
            if (!scur.equals (s2))
                return false;

            s1 = s1.substring(ind + 1);
            if (s1.length() <= 0)
                break;
            ind = s1.indexOf ('*');
        }
        return true;
    }

 
} 



