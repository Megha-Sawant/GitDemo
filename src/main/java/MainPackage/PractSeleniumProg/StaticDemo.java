package MainPackage.PractSeleniumProg;

public class StaticDemo
{
    static String city ="Bengluru";
    String name ;
    String address;
    static int i =0;
     StaticDemo(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public void getData()
    {
        System.out.println(name+"  "+address+" "+city);
        i++;
    }

    public static void main(String [] arg)
    {
        StaticDemo dm = new StaticDemo("Megha","Kharadi");
        StaticDemo dm1 = new StaticDemo("Prajakta","Kharadi");
        dm.getData();
        dm1.getData();
        System.out.println(StaticDemo.i);

    }

}
