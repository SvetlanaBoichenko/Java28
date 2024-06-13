import java.util.*;

public class Level1 {

    public static ArrayList<String> MakeStringList (int len, String s) {
    ArrayList<String> A1 = new ArrayList<String>();
    int sublen = len;
    int slen = s.length();
    int i = 0;
    int j = 0;
    int x = 0;

    int ppos = sublen;

        while (i < slen) {
        if (s.charAt (i) == ' ') {
            i++;
        }
        ppos = sublen;
        x = i + sublen-1;

        for (j = x; j >= i; j-- ) {
            if (i + sublen > slen){
                ppos = slen;
                break;
            }
            if (x+1 < slen && s.charAt (x+1) == ' ') { // check first part 1
                ppos = j+1;
                break;
            }
            if (s.charAt (j) == ' ') {
                ppos = j;
                break;
            }
            if (j == i) {
                ppos = sublen+j; // not found probel
                break;
            }
        }
        A1.add (s.substring (i, ppos));
        i = ppos;
    }
        return A1;
}

    public static int[] MakeLocTab ( String[] strarray, String subs, int tabsize) {
        int[] rettab = new int[tabsize];

        for (int i = 0; i < tabsize; i++) {
            int x1 = 0;
            int ind1 = 0;
            int Ls = subs.length();

            for (int j = 0; j < strarray[i].length(); j++) {
                ind1 = strarray[i].indexOf(subs, x1);  // pos of rirst sym of subs

                if (ind1 >= 0) {                        // probel or begin or last
                    if (ind1 == 0 || (strarray[i].charAt(ind1 - 1) == ' ') == true) {//&
                        if ((ind1 +Ls) == strarray[i].length()   ||
                                ( strarray[i].charAt(ind1 + Ls) == ' ')) {
                            rettab[i]++;
                        }
                    }
                }
                else
                    break;
                x1 = x1 + ind1+Ls;
            }
        }
    return rettab;
    }

    public static int[] WordSearch(int len, String s, String subs) {
       int slen = len;
       String ws = s;
       int [] tabwords;

       ArrayList<String> A2 = MakeStringList (slen, ws);

        int tabsize = A2.size();
        tabwords = new  int[tabsize];

        String[] strarray = {}; // ArrayList to StringArray
        strarray = A2.toArray (new String [A2.size()]);

        tabwords = MakeLocTab ( strarray, subs,  tabsize);

       return tabwords;
    }

    public static void main (String[] args) {
        int [] resA;
        String s1 ="как упоительны в россии вечера";
        String s2 = "в";
     //   "1) строка разбивается на набор строк через выравнивание по заданной ширине."//
       resA = WordSearch(5, s1, s2);
    }
}



























/*
    for (j = 0; j < sublen; j++) {

        if (bw == true & j == (sublen - 1) &(i+j <slen)) { //
        A1.add (s.substring(i, ppos));
        if (i+j <slen) {
        if (s.charAt(i + j - 1) == ' ' | s.charAt(i + j) == ' ')
bw = false; }
        else
        break;

i = ppos-1;
        break;
        }

        else if (bw == true & j < (sublen - 1)& (i+j <slen)) {
        if (s.charAt (i + j) == ' ') {
bw = false;
ppos = j + i;
                        A1.add (s.substring (i, ppos));
i = ppos-1;
        break;
        }

        } else if (bw == false & j == (sublen - 1) & (i+j <slen)) {
        A1.add (s.substring (i, ppos));
        if (i+j <slen) {
        if (s.charAt(i + j - 1) != ' ' | s.charAt(i + j) != ' ')
bw = true; }
        else
        break;

i = ppos-1;

        } else if (bw == false & j < (sublen - 1) & (i+j <slen)) {
        if (s.charAt (i + j) == ' ') {
bw = false;
ppos = i + j;
                    }

                            }
                            }


 */