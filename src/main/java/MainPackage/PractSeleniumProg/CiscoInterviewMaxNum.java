package MainPackage.PractSeleniumProg;

import java.util.Scanner;

public class CiscoInterviewMaxNum
{
    public void maxNumberInCol()
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
        int max=0;
        int maxCol=0;
        for (i = 0; i < arr.length; i++)
        {
            for (j=0; j<arr[i].length; j++)
            {
                if (min >= arr[i][j])
                {
                    min = arr[i][j];
                    maxCol=j;

                    }
                }


            }
        max=arr[0][maxCol];
        for(int x=0; x<arr.length;x++)
        {
            if (max< arr[x][maxCol])
            {
                max= arr[x][maxCol];
            }

        }

        System.out.println("Minimum Number of this matrix is "+min);
        System.out.println("Maximum Number of that Row is "+max);


    }

    public static void main(String[] args)
    {

        CiscoInterviewMaxNum ma = new CiscoInterviewMaxNum();
        ma.maxNumberInCol();

    }
}
