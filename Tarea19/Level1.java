import java.util.*;

public class Level1
{
    public static String[] SumPrecios (int N, String [] sitems) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < N; i++) {
            String sstr = sitems[i];

            int end = sstr.indexOf(" ");
            String ssub = sstr.substring(0, end);
            String ssub2 = sstr.substring (end);
            ssub2 = ssub2.replaceAll(" ","");

            int res = Integer.valueOf (ssub2);

            if (hashtable.containsKey (ssub)){
                int val = hashtable.get(ssub);
                res = val + res;
            }
            hashtable.put (ssub, res);
        }

        String [] sitems2 = new String [hashtable.size()];
        int i = 0;
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            sitems2[i] = (entry.getKey() + " " + entry.getValue());
            i++;
        }
       return sitems2;
    }


    public static String[] sortnum (String[] sitems2) {
        Integer [] nums = new Integer[sitems2.length];

        for (int i = 0; i < sitems2.length; i++) {
            String stmp = sitems2[i];
            int end = stmp.indexOf(" ");
            String sub = stmp.substring(end + 1);
            nums[i] = Integer.valueOf(sub);
        }

        String [] sitems3 = new String [sitems2.length];
        Arrays.sort(nums, Collections.reverseOrder());

        for (int i = 0; i < sitems2.length; i++) {
            String stmp = sitems2[i];
            int end = stmp.indexOf(" ");
            String sub = stmp.substring(end + 1);
            int curnum = Integer.valueOf(sub);

            for (int j = 0; j < nums.length; j++) {
                if (nums[j].intValue() == curnum)    {
                    nums[j] = -1;
                    sitems3[j] = sitems2[i];
                    break;
                }
            }
        }
        return sitems3;
    }


    public static String [] ShopOLAP(int N, String [] items)
    {
        String [] sitems = items.clone();

        String[] sitems2 = SumPrecios (N, sitems); // sum iguals str

        Arrays.sort(sitems2);

        String [] sitems5 =  sortnum (sitems2);

        return sitems5;
    }

 
} 



