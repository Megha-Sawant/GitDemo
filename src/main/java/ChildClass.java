public class ChildClass extends BaseClass {
    int a = 20;
    public void getData(int b)
    {
        System.out.println("ChildClass :"+b);
    }

    public void getData(String s)
    {
        System.out.println("ChildClass :"+s);
    }
    public static void main(String[] args)
    {
        BaseClass B = new BaseClass();
        ChildClass C = new ChildClass();
        BaseClass B1 =  new ChildClass();

        B.getData(200);
        C.getData(300);

        System.out.println(B.a); //Parent Class Variable Value
        System.out.println(C.a); //Child Class variable value
        System.out.println(B1.a); // parent class variable value

        B.getData("OverloadingExample");//Parent Class Function executed
        C.getData("OverloadingExample");//Child Class function executed
        B1.getData("OverloadingExample");//Parent Class Function executed

    }
}
