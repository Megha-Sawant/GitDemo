package MainPackage.PractJavaProg;

import java.util.HashMap;

public class MakeAnagram
{

    public static void main(String args[])
    {
        String s="123421";
        int len=s.length();
        boolean flag =false;
        int flen=(len)/2;
        char c[] =s.substring(0,flen).toCharArray();
        char c1[]=s.substring(flen,len).toCharArray();
        System.out.println(c);
        System.out.println(c1);
        int op=0;

        for(int i=0;i<flen;i++)
        {
            flag=false;
            for(int j=0;j<flen;j++)
            {
                if(c[i]==c1[j])
                {
                    flag=true;
                }
            }
            if(flag==false)
            {
                op++;
            }

        }

        System.out.println("Number of operation Required "+op);
    }
}
