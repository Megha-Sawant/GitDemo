package MainPackage.PractJavaProg;

import java.util.Scanner;

public class DuplicatesArray {


        public static void main(String [] args)
        {
            int a[]= new int[5];
            int b[]=new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 5 numbers:");
            for(int i=0;i<5;i++)
            {
                a[i]=sc.nextInt();
            }
            int x=0 ;

            boolean unique =true;
            System.out.println("Duplicate Element:");
            for(int i=0;i<5;i++)
            {
                unique=true;
                for(int j=0;j<x;j++)
                {
                    if (a[i] == b[j])
                    {
                        System.out.println(a[i]);
                        unique=false;
                        break;
                    }
                }
                if(unique)
                {
                    b[x]=a[i];
                    x++;
                }
            }
            System.out.println("Unique");
            for(int i=0;i<x;i++)
            {
                System.out.println(b[i]);

            }


            }


        }



