package MainPackage.PractJavaProg;

import java.util.Scanner;

public class FactorialOfNumber
{
    public static void main (String [] args)
    {
        int num;
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Factor of"+num);
        for (int i=1; i<= num/2; i++)
        {
            if (num%i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
