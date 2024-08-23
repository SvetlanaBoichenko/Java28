import java.util.*;

public class Level1 {

    public static int PrintingCosts(String Line) {
        HashMap<Character, Integer> map12 = new HashMap<Character, Integer>();

        map12.putAll(Map.of('!', 9, ' ', 0, '"', 6, '#', 24, '$', 29, '%', 22, '&', 24, '(', 12, ')', 12 ));
        map12.putAll(Map.of('*', 17, '+', 13, ',', 7, '-', 7, '.', 4, '/', 10, '0', 22, '1', 19, '2', 22, '3', 23 ));
        map12.putAll(Map.of( '4', 21, '5', 27, '6', 26, '7', 16, '8', 23, '9', 26, ':', 8, ';', 11, '<', 10, '=', 14));
        map12.putAll(Map.of('>', 10, '?', 15, '@', 32, 'A', 24, 'B', 29, 'C', 20, 'D', 26, 'E', 26, 'F', 20, 'G', 25));
        map12.putAll(Map.of('H', 25, 'I', 18, 'J', 18, 'K', 21, 'L', 16, 'M', 28, 'N', 25, 'O', 26, 'P', 23, 'Q', 31));
        map12.putAll(Map.of('S', 25, 'T', 16, 'U', 23, 'V', 19, 'W', 26, 'X', 18, 'Y', 14, 'Z', 22, '[', 18, '\\', 10));
        map12.putAll(Map.of('^', 7, '_', 8, '`', 3, 'a', 23, 'b', 25, 'c', 17, 'd', 25, 'e', 23, 'f', 18, 'g', 30));
        map12.putAll(Map.of('h', 21, 'R', 28 , ']', 18, 'i', 15, 'j', 20, 'k', 21, 'l', 16, 'm', 22, 'n', 18, 'o', 20));
        map12.putAll(Map.of('p', 25, 'q', 25, 'r', 13, 's', 21, 't', 17, 'u', 17, 'v', 13, 'w', 19, 'x', 13, 'y', 24));
        map12.putAll(Map.of('z', 19, '{', 18, '|', 12, '}', 18, '~', 9, '\'', 3));

        int len = Line.length();
        int sum = 0;

        for (int i = 0; i< len; i++){
            Integer s = map12.get(Line.charAt(i));

            if (s == null) {
                s = 23;
            }
            sum = sum + s;
        }
        return sum;
    }

    public static void main(String[] args) {

        String Ln = "mama'/";
        int count=  PrintingCosts(Ln);

        System.out.println(count);
    }
}
