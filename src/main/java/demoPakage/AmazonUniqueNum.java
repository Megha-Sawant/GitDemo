package demoPakage;

import java.util.ArrayList;
import java.util.HashMap;

public class AmazonUniqueNum
{
    public static void main(String [] args)
    {
        int a[] = {4,5,5,5,4,6,6,9,4};
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for (int i=0;i<a.length;i++)
        {
            int k=0;
            if (!arr.contains(a[i]))
            {

                arr.add(a[i]);
                k++;
                for (int j = i + 1; j < a.length; j++)
                {
                    if (a[i] == a[j])
                    {
                        k++;
                    }
                }
                 System.out.println(a[i]);
                System.out.println(k);

                if (k == 1)
                    System.out.println("Unique Number is :" + a[i]);
            }
        }
        System.out.println(arr);

    }
}
