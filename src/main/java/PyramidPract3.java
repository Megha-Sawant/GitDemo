public class PyramidPract3
{
    public static void  main(String [] arg)
    {
       int p=3;
        for (int i=1; i<=3; i++)
        {

            for(int j=1;j<=i;j++)
            {

                System.out.print(p+" ");
                p=p+3;



            }
            System.out.print("\n");

        }
    }
}
