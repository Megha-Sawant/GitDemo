package MainPackage.PractJavaProg;

import java.util.Scanner;
import java.util.*;

public class ArraySort
{
    public static void main(String [] args)
    {
        int a[]= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 numbers:");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp=0 ;
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if (a[i] > a[j])
                {
                 temp=a[j];
                 a[j]=a[i];
                 a[i]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

    }
}
