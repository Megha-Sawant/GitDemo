package MainPackage.PractJavaProg;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram
{
    public static void main(String [] args )
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Two Strings ");
        String s1 = sc.next();
        String s2 = sc.next();

        char a[] =s1.toCharArray();
        char b[] =s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
       if (Arrays.equals(a,b))
       {
           System.out.println("String is Anagram");
       }
       else
       {
           System.out.println("String is not Anagram");
       }

       /* Another Way to do it using tearnery Expression */

        System.out.println(Arrays.equals(a,b)? "String is Anagram" : "String is not Anagram");


    }
}
