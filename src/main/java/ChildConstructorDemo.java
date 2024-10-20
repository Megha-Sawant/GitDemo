public class ChildConstructorDemo extends ParentConstructorDemo
{
    String clsname="Child";
    public int var=1234;

    ChildConstructorDemo()
    {
        super();
        System.out.println("I am Child class constructor :");
    }
    public void getData()
    {
        System.out.println("Hello I am  Child class method ");
        System.out.println(super.clsname);
    }


    public static void main(String [] args)
    {
        ChildConstructorDemo ch =new ChildConstructorDemo();
        ch.getData();
        System.out.println(ch.clsname);


    }
}
