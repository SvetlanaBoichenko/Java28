import java.util.*;

public class Level1
{
    static String curstr = "";
    static int oldcmd = 0;
    static int ind = 0;
    static List<String> Undolist = new ArrayList<>();

    public static String BastShoe(String command) {
        int cmd = 0;
        String sc = command.substring(0, 1);

        sc = sc.replaceAll ("\\s+", "");
        if (sc.compareTo ("") == 0)
            return "";

        cmd = Integer.parseInt (sc);

        if (cmd == 1 & (oldcmd == 4)) {
            oldcmd = cmd;
            Undolist.clear();
            Undolist.add (0,curstr);     //predposl
            curstr = curstr + command.substring (2);
            Undolist.add(0,curstr);      //posl
            ind = 0;
            return  curstr;
        }

        if (cmd == 1) {
            oldcmd = cmd;
            curstr = curstr + command.substring (2);
            Undolist.add(0,curstr);
            return  curstr;
        }

        if (cmd == 2 & (oldcmd == 4) ) {
            oldcmd = cmd;
            Undolist.clear();
            Undolist.add (0,curstr);     //predposl
            ind = 0;
            int count = Integer.parseInt (command.substring(2));

            if (count >= curstr.length()) {
                curstr = "";
                return curstr;
            } else
                curstr = curstr.substring(0, curstr.length() - count);

            Undolist.add(0, curstr);     //posl
            return curstr;
        }

        if (cmd == 2) {
            oldcmd = cmd;
            int count = Integer.parseInt (command.substring (2));
            if (count >= curstr.length())
                curstr = "";
             else
                curstr = curstr.substring (0, curstr.length() - count);

             Undolist.add (0,curstr);
            return curstr;
        }

        if (cmd == 3 & command.length() >= 2) {
            int count = Integer.parseInt (command.substring(2));
            if (count >= curstr.length()) {
                curstr = "";
                return "";
            }
            char a = curstr.charAt (count);

            return Character.toString(a);
        }

        if (cmd == 3 & command.length() < 2)
            return "";

        if (cmd == 4 & Undolist.size() == 0) {
            oldcmd = cmd;
            curstr = "";
            return curstr;
        }

        if (cmd == 4 ){
            ind++;
            if (ind >= Undolist.size()) {
                ind = Undolist.size() - 1;
            }
            curstr = Undolist.get(ind);
            oldcmd = cmd;
            return curstr;
        }

        if (cmd == 5 & Undolist.size() == 0) {
            oldcmd = cmd;
            curstr = "";
            return curstr;
        }

        if (cmd == 5) { 
            ind--;
            if (ind < 0) {
                ind = 0;
            }
            curstr = Undolist.get (ind);
            oldcmd = cmd;
            return curstr;
        }
        return "";
    }

    
} 



