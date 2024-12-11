package demoPakage;

import com.google.common.cache.AbstractCache;

import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap
{


    public static void main(String [] args)
    {

        HashMap<String,Integer> hm= new HashMap<String,Integer>();
        hm.put("apple",3);
        hm.put("orange",1);
        hm.put("mango",2);
        hm.put("melon",4);

        HashMap<String,Integer>sortedMap=hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap
                        (Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        HashMap::new)
        );

        System.out.println("Map Sorted by Values: " + sortedMap);







    }

}
