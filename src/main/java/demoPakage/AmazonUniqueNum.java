package demoPakage;

import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class AmazonUniqueNum
{
    public static void main(String [] args)
    {
        int a[] = {4,5,5,5,4,6,6,9,4};
        ArrayList<Integer> arr= new ArrayList<>();
      //  ArrayList<Integer> a1= Arrays.stream(a).collect(Collectors.toCollection(ArrayList::new));
        for (int i=0;i<a.length;i++)
        {
            int k=0;
            if (!arr.contains(a[i]))
            {

                arr.add(a[i]);
                k++;
//                for (int j = i + 1; j < a.length; j++)
//                {
//                    if (a[i] == a[j])
//                    {
//                        k++;
//                    }
//                }
//                 System.out.println(a[i]);
//                System.out.println(k);

//                if (k == 1)
//                    System.out.println("Unique Number is :" + a[i]);
            }
        }
        System.out.println(arr);

    }
}
