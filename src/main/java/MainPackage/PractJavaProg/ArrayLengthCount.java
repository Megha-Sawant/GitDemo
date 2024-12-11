package MainPackage.PractJavaProg;

public class ArrayLengthCount
{

    public static void main(String [] arg)
    {

        int [] arr = {1,2,3,4,5};
        int i =0;
        while (true)
        {
          try{
              i++;
             int temp=arr[i]; // this will trigger the ArrayIndexOutOfBoundsException

          }
          catch(ArrayIndexOutOfBoundsException ex)
          {
              break;
          }
          }
        System.out.println("Array Length is " + i);




        String[] str = {"megha", "Amrut", "Sawant"};
        int count = 0;

        for (String s : str) {
            count++;
        }

        System.out.println("String Length is " + count);

    }
}
