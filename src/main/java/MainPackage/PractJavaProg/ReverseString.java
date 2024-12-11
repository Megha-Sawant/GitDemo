package MainPackage.PractJavaProg;

public class ReverseString
{

    public static void main(String [] arg)

{
    String str =new String("Megha Sawant");
    System.out.println("Length"+str.length());
    System.out.println("Reverse String is:");
    for (int i=str.length()-1 ; i>=0; i--)
    {
        System.out.println(str.charAt(i));
    }

}
}
