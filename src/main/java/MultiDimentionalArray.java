import java.util.Scanner;

public class MultiDimentionalArray
{
    public void minNumber()
    {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3*3 Matrix : ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j=0; j<arr[i].length; j++)
            {
                System.out.println("Enter the Value of"+ arr[i][j]);
                arr[i][j]=sc.nextInt();

                }

            }

        int i=0, j = 0;
        int min=arr[i][j];
        for (i = 0; i < arr.length; i++)
        {
            for (j=0; j<arr[i].length; j++)
            {
              if (min >= arr[i][j])
              {
                  min = arr[i][j];
              }

            }

        }

        System.out.println("Minimum Number of this matrix is "+min);


    }

    public static void main(String[] args)
    {

        MultiDimentionalArray ma = new MultiDimentionalArray();
        ma.minNumber();

    }
}