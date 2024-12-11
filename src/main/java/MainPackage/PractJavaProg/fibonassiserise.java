package MainPackage.PractJavaProg;

public class fibonassiserise
{
    public static void main(String arg[])
    {
        int first=0;
        int second=1;
        int sum =0;

         for(int i=1; i<7;i++)
         {
             sum=first+second;
             System.out.println(sum);
             first=second;
             second=i;

         }

    }
}
