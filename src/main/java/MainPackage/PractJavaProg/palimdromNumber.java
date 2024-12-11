package MainPackage.PractJavaProg;

import java.util.Scanner;

public class palimdromNumber
{
    public static void main(String [] args)
    {
        System.out.println("Enter Any Number");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        palimdromNumber p =new palimdromNumber();
        p.findPalidrom(num);

    }

    public void findPalidrom(int num)
    {
        int digit , pal=0;
        int temp=num;
        do
        {
            digit=num%10;
            pal=(pal*10)+digit;
            num=num/10;


        }while(num>0);

        if(temp==pal)
        {
            System.out.println(temp +" is  Palidrom");
        }
        else
        {
            System.out.println(temp+" is not Palidrom");
        }
    }
}
