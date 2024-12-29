package demoPakage;

import java.util.Scanner;

public class SnakeCase
{
    public static String snakecaseOp(String s)
    {
        String output =s.replaceAll("[^a-zA-Z ]","").replaceAll("[\\s]","_");

      return output;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s= sc.nextLine();

        System.out.println(snakecaseOp(s));



    }
}
