package MainPackage.PractJavaProg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TargetPairsFIS
{
   public static void main(String [] args) {
       int arr[] = {1, 2, 3, 4, 5, 6};
       int target=8;
      HashSet<Integer> b = new HashSet<>();
       for (int i = 0; i < arr.length; i++)
       {
            int rem=target-arr[i];
            if(b.contains(rem))
            {
                System.out.println(arr[i]+","+rem);
            }
            else
            {
                b.add(arr[i]);
            }
       }
   }
}
