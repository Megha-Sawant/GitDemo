package MainPackage.PractJavaProg;

import java.util.Scanner;

public class LongestWordString
{
    public static String LongestWord(String sen)
    {
        String longestWord="";
        int maxlen=0;
        String currentWord="";
        for(int i=0;i<sen.length();i++)
        {
            char ch = sen.charAt(i);
            if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
            {
                currentWord=currentWord+ch;
            }
            else {
                if(currentWord.length()>maxlen)
                {
                    longestWord=currentWord;
                    maxlen=currentWord.length();
                }
                currentWord="";
            }
        }

        return longestWord;
    }

    /*
    Another approch

    String maxWord="";
    int maxLen=0;
    String s[]=sen.replaceAll("[^a-zA-Z0-9 ]","").split("\\s+");
    for(String word : s)
    {
     if (w.length()>maxLen)
     {
     maxWord=w;
     maxLen=w.length();
     }
    }
     */

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(LongestWord(s.nextLine()));
    }
}
