public class PyramidPract2
{
    public static void  main(String [] arg)
    {
        int p=1;
        for (int i=1; i<=4; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p);
                p++;

            }
            System.out.print("\n");

        }
    }
}
