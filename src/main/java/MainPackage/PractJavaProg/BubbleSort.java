package MainPackage.PractJavaProg;

public class BubbleSort
{
    public static void main(String [] args)
    {

        int a[]={23,5,67,21,78};

        int temp=0;
        int size=a.length-1;

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }

            }


        }

        for(int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }

    }

}
