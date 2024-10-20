import java.util.ArrayList;

public class JavaInroduction
{

    public static void main(String arg [] )
    {
        String [] arr= new String[4];

        arr[0] ="Hello World";
        arr[1] ="Brushing up Java Concepts";
        arr[2] ="Array";
        arr[3]="All The Best";

       // System.out.println(arr[0] + "\n" + arr [1] + "\n"+ arr[2] + "\n"+ arr[3]);

        /***********For Loop ***************/

        for (int i=0 ; i<arr.length; i++)
            System.out.println(arr[i]);

        /***********For Loop ***************/
        for(String a:arr)
            System.out.println(a);

        /***********Even Number***************/

        int a [] = {3,7,5,6,8,9,1,12,4,0,11};

        System.out.println(a.length);
        System.out.println("Even Number Program");
        int count =0;
       for (int s=0 ; s<a.length;s++)
       {
           if (a[s]%2==0)
           {
               System.out.println(a[s]);
               count++;

           }

       }

       System.out.println(count +" Even Number found in array");


        /*********** Lowest Number ***************/
        int lowest = a[0];
        for (int s=1 ; s< a.length ; s++)
        {
            if (lowest>a[s])
                lowest=a[s];
        }

        System.out.println("Lowest Number of Array is : "+ lowest);

            /*********** Greatest Number ***************/
        int greatest = a[0];
        for (int s=1 ; s< a.length ; s++)
        {
            if (greatest<a[s])
                greatest=a[s];
        }

        System.out.println("Greatest Number of Array is : "+ greatest);


        /*********** array list ***************/

        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("b");

        ArrayList<Integer> il= new ArrayList<Integer>();
        il.add(1);
        il.add(2);
        il.add(4);

        for (int i:il)
            System.out.println("Printing from arraylist "+ i);



        /*********** String Operations ***************/

        String s = "Learning Selenium is Fun";
        String s1 =new String ("Selenium");
        System.out.println(s);
        s.split("selenium");
        System.out.println(s);
        JavaInroduction obj = new JavaInroduction();
        obj.func(); //Non static method inside the static method can be called using object of the class .
        JavaInroduction.func1(); // Static method inside the static method can be called directly or using the class name .
        int r= func1();
        System.out.println(r);


    }

    public void func()
    {
        System.out.println("Hello From inside Function");
    }
    public static int func1()
    {

        int a , b;
        a=100;
        b=200;
        if (a<b)
            System.out.println("a is less than b");
        else if (a==b)
             System.out.println("a is Equal to b");
        else
            System.out.println("a is greater than b");

        return 1;

    }
}
