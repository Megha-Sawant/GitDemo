package MainPackage.PractJavaProg;

import java.util.HashMap;
import java.util.Map;

public class StringCountAssign
{
    public static void main(String [] args ) {
        String s = "sadhanas";
        int count =1;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0; i<s.length();i++) {
            char c = s.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, count);

            } else {
                map.put(c, map.get(c) + 1);
            }
        }

            for(char ch :map.keySet())
            {
            System.out.println(ch+" Occuring :"+ map.get(ch));
        }

//        Map<String, Integer> map = new HashMap<String, Integer>();
//        String arr[] = s.split(" ");
//        int count=1;
//        for (int i = 0; i < arr.length; i++)
//        {
//            if(!map.containsKey(arr[i]))
//            {
//                map.put(arr[i],count);
//            }
//            else
//            {
//             map.put(arr[i],map.get(arr[i])+1);
//            }
//          }
//         for(String key: map.keySet())
//         {
//             System.out.println(key+" Occuring : "+map.get(key));
//         }




    }
}
