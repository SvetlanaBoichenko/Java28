import java.util.*;

public class Level1 {

    public static int PrintingCosts(String Line) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put((int)('!'),  9);
        map.put((int)(' '), 0);
        map.put((int)('"'),  6);
        map.put((int)('#'), 24);
        map.put((int)('$'), 29);
        map.put((int)('%'), 22);
        map.put((int)('&'), 24);
        map.put((int)('('), 12);
        map.put((int)(')'), 12);
        map.put((int)('*'), 17);
        map.put((int)('+'), 13);
        map.put((int)(','),  7);
        map.put((int)('-'),  7);
        map.put((int)('.'),  4);
        map.put((int)('/'), 10);
        map.put((int)('0'), 22);
        map.put((int)('1'), 19);
        map.put((int)('2'), 22);
        map.put((int)('3'), 23);
        map.put((int)('4'), 21);
        map.put((int)('5'), 27);
        map.put((int)('6'), 26);
        map.put((int)('7'), 16);
        map.put((int)('8'), 23);
        map.put((int)('9'), 26);
        map.put((int)(':'),  8);
        map.put((int)(';'), 11);
        map.put((int)('<'), 10);
        map.put((int)('='), 14);
        map.put((int)('>'), 10);
        map.put((int)('?'), 15);
        map.put((int)('@'), 32);
        map.put((int)('A'), 24);
        map.put((int)('B'), 29);
        map.put((int)('C'), 20);
        map.put((int)('D'), 26);
        map.put((int)('E'), 26);
        map.put((int)('F'), 20);
        map.put((int)('G'), 25);
        map.put((int)('H'), 25);
        map.put((int)('I'), 18);
        map.put((int)('J'), 18);
        map.put((int)('K'), 21);
        map.put((int)('L'), 16);
        map.put((int)('M'), 28);
        map.put((int)('N'), 25);
        map.put((int)('O'), 26);
        map.put((int)('P'), 23);
        map.put((int)('Q'), 31);
        map.put((int)('R'), 28);
        map.put((int)('S'), 25);
        map.put((int)('T'), 16);
        map.put((int)('U'), 23);
        map.put((int)('V'), 19);
        map.put((int)('W'), 26);
        map.put((int)('X'), 18);
        map.put((int)('Y'), 14);
        map.put((int)('Z'), 22);
        map.put((int)('['), 18);
        map.put((int)('\\'), 10);
        map.put((int)(']'), 18);
        map.put((int)('^'),  7);
        map.put((int)('_'),  8);
        map.put((int)('`'),  3);
        map.put((int)('a'), 23);
        map.put((int)('b'), 25);
        map.put((int)('c'), 17);
        map.put((int)('d'), 25);
        map.put((int)('e'), 23);
        map.put((int)('f'), 18);
        map.put((int)('g'), 30);
        map.put((int)('h'), 21);
        map.put((int)('i'), 15);
        map.put((int)('j'), 20);
        map.put((int)('k'), 21);
        map.put((int)('l'), 16);
        map.put((int)('m'), 22);
        map.put((int)('n'), 18);
        map.put((int)('o'), 20);
        map.put((int)('p'), 25);
        map.put((int)('q'), 25);
        map.put((int)('r'), 13);
        map.put((int)('s'), 21);
        map.put((int)('t'), 17);
        map.put((int)('u'), 17);
        map.put((int)('v'), 13);
        map.put((int)('w'), 19);
        map.put((int)('x'), 13);
        map.put((int)('y'), 24);
        map.put((int)('z'), 19);
        map.put((int)('{'), 18);
        map.put((int)('|'), 12);
        map.put((int)('}'), 18);
        map.put((int)('~'),  9);
        map.put((int)('\''),  3);

        int len = Line.length();
        int sum = 0;

        for (int i = 0; i< len; i++){
            Integer s = 0;
            char symb = Line.charAt(i);
            s = map.get((int) symb);

            if (s == null) {
                s = 23;
            }
            sum = sum + s;
        }
        return sum;
    }


} 



