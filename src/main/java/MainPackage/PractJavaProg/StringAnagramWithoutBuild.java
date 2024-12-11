package MainPackage.PractJavaProg;

public class StringAnagramWithoutBuild
{
    public static void main(String[] args)
    {

        String s1 = "Mother In Law";
        String s2="Hitler Woman";
        char []c1 =s1.replaceAll("\\s","").toLowerCase().toCharArray();
        char []c2 =s2.replaceAll("\\s","").toLowerCase().toCharArray();
        int len=c1.length;
        int len2 =c2.length;
        boolean anagram =false;
       // System.out.println(len+""+len2);

if (len==len2)
{
    anagram=false ;
}

        for(int i=0;i<len;i++)
        {

            for(int j=0;j<len2;j++)
            {

                if(c1[i]==c2[j])
                {
                    anagram =true;
                }

            }

            if(anagram==false)
                break;
        }

        if(anagram==true)
        {
            System.out.println("String is  Anagaram");
        }
        if(anagram==false)
        {
            System.out.println("String is not Anagaram");
        }

    }

}
