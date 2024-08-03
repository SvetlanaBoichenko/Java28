import java.util.*;

public class Level1
{
   public static boolean SherlockValidString(String s) {
       if (s.length() == 2)
           return true;
       HashMap <Character, Integer> hmap = new HashMap<>();

       int val = 0;
       for (int i = 0; i < s.length(); i++ ){
           if (hmap.containsKey(s.charAt(i))) {
               val = hmap.get(s.charAt(i)) + 1;
           }
           else val = 1;
           hmap.put(s.charAt(i), val);
       }

       ArrayList<Integer> L = new ArrayList();
        for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            val = entry.getValue();
            L.add(val);
        }

        if (L.size() == 1)
            return true;
       Collections.sort(L);

       ArrayList<Integer> L1 = new ArrayList();// L
        boolean rem = false;
       if (L.get(0) == 1 & L.get(1)!= 1){
           L.remove(0);
           rem = true;
       }
       if (L.size() == 1)
           return true;

       int old_val = L.get(0);
       int count1 = 1;
       L1.add(old_val);

       for (int i = 1; i < L.size(); i++) {
           val = L.get(i);
           if (val == old_val) {
               if(count1 > 1)
                   return false;
               continue;
           }
           L1.add(val);
           old_val = val;
           count1++;
       }

       if (L1.size() == 1) return true;

       if (L1.size() > 2)
           return false;

       int X1 = (int)L1.get(0);
       int X2 = (int)L1.get(1);

      if ((X2 - X1) == 1 & rem == false)//Math.abs
         return true;

      return false;
    }
        public static void main (String[]args)
        {
            String str = "xyz";

            boolean b = SherlockValidString(str);

            System.out.println(b);

        }

}


    /*

          Arrays.sort(arr);
        List L = new ArrayList();   // Arrays.asList(arr);

      char val = 0, oldval =      oldval = arr[0];;
       for (int i = 1; i < arr.length; i++) {

           val = arr[i];
           if (val != oldval) {
               L.add(val);
               oldval = val;
           }
       }

*/

       /*
      for (int i = 1; i < L.size(); i++){ //L.size()
       val = L.get(i);

           if (val == old_val & camb == 0) {
               count1++;
                L1.remove(i);
            }

            if  (val == old_val & camb > 0) {
               count2++;
               L1.remove(i);
            }

            if (val != old_val) {
             camb++;
            }

        if ((camb ==1 & count1 > 1 & count2 >1) | camb >1)
                return false;
        }


*/
