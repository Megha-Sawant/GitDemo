package demoPakage;
import java.util.*;

public class NonRepeatingCharacter
{

    public static void main(String [] args)
    {
        String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        s= sc.next();

       System.out.println(firstNonreaptingCharacter(s));

    }

    private static char firstNonreaptingCharacter(String s)
    {
        char c []=s.toLowerCase().toCharArray();
        char ch='\u0000';
        HashMap<Character,Integer> hmp=new LinkedHashMap<>();
        for(int i=0;i<c.length;i++)
        {
            if(hmp.containsKey(c[i]))
            {
                hmp.put(c[i],hmp.get(c[i])+1);
            }
            else {
                hmp.put(c[i],1);
            }
        }

        for(int i=0;i<c.length;i++)
        {
            if(hmp.get(c[i])==1)
            {
                ch=c[i];
                return ch ;

            }
        }


        return ch;
    }
}
