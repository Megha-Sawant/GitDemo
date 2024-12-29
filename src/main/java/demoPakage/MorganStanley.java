package demoPakage;

import java.util.Scanner;

public class MorganStanley
{


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String s1=sc.next();
        System.out.println("Enter the second String: ");
        String s2=sc.next();
        String password = String.valueOf(passwordCreation(s1,s2));
        System.out.println("Password is :"+password);
    }

    private static StringBuffer passwordCreation(String s1, String s2)
    {
        StringBuffer pwd=new StringBuffer();
        int i=0,j=0;
        int len1=s1.length();
        int len2=s2.length();
      //  char [] c1=s1.toCharArray();
        //char [] c2=s2.toCharArray();
        while(i<len1 && j<len2)
        {
            pwd.append(s1.charAt(i++));
            pwd.append(s2.charAt(j++));

        }
        while(i<len1)
        {
            pwd.append(s1.charAt(i++));
        }
        while(j<len2)
        {
            pwd.append(s2.charAt(j++));
        }
        return pwd;
    }
}
