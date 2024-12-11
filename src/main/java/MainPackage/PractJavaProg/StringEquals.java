package MainPackage.PractJavaProg;

public class StringEquals
{


    public static void main (String [] args)
    {
        String s1="Megha";
        String s2="Smile";
        boolean equal = false;

        if (s1.length()==s2.length())
        {

            for(int i=0;i<s1.length()-1;i++)
            {
                if (s1.charAt(i)==s2.charAt(i))
                {
                    equal =true ;
                }
                else
                {
                    equal =false ;
                    break;
                }

            }
            if(equal)
            {
                System.out.println("String is Equal");
            }
            else{
                System.out.println("String is not Equal");
            }
        }
        else
        {
            System.out.println("String is not Equal");
        }



    }
    }

