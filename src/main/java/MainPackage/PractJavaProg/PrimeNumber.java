package MainPackage.PractJavaProg;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String [] args)
    {
        int num ;
        boolean prime=true;
        System.out.println("Enter the number:");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        System.out.println(prime==true?"prime number":"Not prime");

    }
}
