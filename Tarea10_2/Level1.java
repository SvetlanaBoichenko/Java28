import java.util.*;

    public class Level1 {

        public static int PrintingCosts(String Line) {

           List<Map> ls = new ArrayList<>();
           List<Map> ls2 = new ArrayList<>();

            Map<Character, Integer> map12 = Map.of('!', 9, ' ', 0, '"', 6, '#', 24, '$', 29, '%', 22, '&', 24, '(', 12, ')', 12);
            Map<Character, Integer> map13 = Map.of( '+', 13, ',', 7, '-', 7, '.', 4, '/', 10, '0', 22, '1', 19, '2', 22, '3', 23);
            Map<Character, Integer> map14 = Map.of('*', 17, '+', 13, ',', 7, '-', 7, '.', 4, '/', 10, '0', 22, '1', 19, '2', 22, '3', 23);
            Map<Character, Integer> map15 = Map.of('4', 21, '5', 27, '6', 26, '7', 16, '8', 23, '9', 26, ':', 8, ';', 11, '<', 10, '=', 14);
            Map<Character, Integer> map16 = Map.of('>', 10, '?', 15, '@', 32, 'A', 24, 'B', 29, 'C', 20, 'D', 26, 'E', 26, 'F', 20, 'G', 25);
            Map<Character, Integer> map17 = Map.of('H', 25, 'I', 18, 'J', 18, 'K', 21, 'L', 16, 'M', 28, 'N', 25, 'O', 26, 'P', 23, 'Q', 31);
            Map<Character, Integer> map18 = Map.of('S', 25, 'T', 16, 'U', 23, 'V', 19, 'W', 26, 'X', 18, 'Y', 14, 'Z', 22, '[', 18, '\\', 10);
            Map<Character, Integer> map19 = Map.of('^', 7, '_', 8, '`', 3, 'a', 23, 'b', 25, 'c', 17, 'd', 25, 'e', 23, 'f', 18, 'g', 30);
            Map<Character, Integer> map20 = Map.of('h', 21, 'R', 28, ']', 18, 'i', 15, 'j', 20, 'k', 21, 'l', 16, 'm', 22, 'n', 18, 'o', 20);
            Map<Character, Integer> map21 = Map.of('p', 25, 'q', 25, 'r', 13, 's', 21, 't', 17, 'u', 17, 'v', 13, 'w', 19, 'x', 13, 'y', 24);
            Map<Character, Integer> map22 = Map.of('z', 19, '{', 18, '|', 12, '}', 18, '~', 9, '\'', 3);

            ls2 = List.of (map12, map13, map14,map15, map16, map17, map18, map19,map20,map21,map22);

            ls = List.of( Map.of('!', 9, ' ', 0, '"', 6, '#', 24, '$', 29, '%', 22, '&', 24, '(', 12, ')', 12),
                           Map.of( '+', 13, ',', 7, '-', 7, '.', 4, '/', 10, '0', 22, '1', 19, '2', 22, '3', 23),
                           Map.of('*', 17, '+', 13, ',', 7, '-', 7, '.', 4, '/', 10, '0', 22, '1', 19, '2', 22, '3', 23),
                           Map.of('4', 21, '5', 27, '6', 26, '7', 16, '8', 23, '9', 26, ':', 8, ';', 11, '<', 10, '=', 14),
                           Map.of('>', 10, '?', 15, '@', 32, 'A', 24, 'B', 29, 'C', 20, 'D', 26, 'E', 26, 'F', 20, 'G', 25),
                           Map.of('H', 25, 'I', 18, 'J', 18, 'K', 21, 'L', 16, 'M', 28, 'N', 25, 'O', 26, 'P', 23, 'Q', 31),
                           Map.of('S', 25, 'T', 16, 'U', 23, 'V', 19, 'W', 26, 'X', 18, 'Y', 14, 'Z', 22, '[', 18, '\\', 10),
                           Map.of('^', 7, '_', 8, '`', 3, 'a', 23, 'b', 25, 'c', 17, 'd', 25, 'e', 23, 'f', 18, 'g', 30),
                           Map.of('h', 21, 'R', 28, ']', 18, 'i', 15, 'j', 20, 'k', 21, 'l', 16, 'm', 22, 'n', 18, 'o', 20),
                           Map.of('p', 25, 'q', 25, 'r', 13, 's', 21, 't', 17, 'u', 17, 'v', 13, 'w', 19, 'x', 13, 'y', 24),
                            Map.of('z', 19, '{', 18, '|', 12, '}', 18, '~', 9, '\'', 3)  );

            int len = Line.length();
            Integer s1 = null;

            int sum = 0;
            Map <Character, Integer> m = new HashMap<>();

            for (int i = 0; i < len; i++) {

                for (int j = 0; j < ls.size(); j++){

                   m = (Map)ls.get(j);

                    s1  = m.get(Line.charAt(i));
                    if (s1!= null)
                        break;
                }

                if (s1 == null) {
                    s1 = 23;
                }
                sum = sum + s1.intValue();
            }
            return sum;
        }



    public static void main(String[] args) {

        String Ln = "mama\'*";
        int count=  PrintingCosts(Ln);

        System.out.println(count);
    }
}
