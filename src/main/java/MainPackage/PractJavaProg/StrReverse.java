package MainPackage.PractJavaProg;

public class StrReverse
{

    public static void main(String [] args )
    {
         String str="MeghaSawant";
         String reverse = "";
         char temp;
         boolean flag =false ;


        StringBuffer rs= new StringBuffer(str);

        System.out.println(rs.reverse());

        for(int i=str.length()-1; i>=0; i--)
        {
             reverse =reverse+str.charAt(i);
        }
        System.out.println(reverse);
        for(int i=str.length()-1; i>=0; i--)
        {
            temp =str.charAt(i);


        }

    }
}
