public class PyramidsPract
{
    public static void main(String str [])
    {
        int p=1;
        for (int i=4; i>=1; i--)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(p);
                p++;
            }
            System.out.print('\n');
        }
    }
}
