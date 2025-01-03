package MainPackage.PractSeleniumProg;

public class ChildClass extends BaseClass {
    int a = 20;
    public void getData(int b)
    {
        System.out.println("MainPackage.PractSeleniumProg.ChildClass :"+b);
    }

    public void getData(String s)
    {
        System.out.println("MainPackage.PractSeleniumProg.ChildClass :"+s+a);
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
        System.out.println(B1.a); // parent class variable value -This is because Java uses the reference type for accessing members (not the object type)

        B.getData("OverloadingExample");//Parent Class Function executed
        C.getData("OverloadingExample");//Child Class function executed
        B1.getData("OverloadingExample");//Child Class Function executed

    }
}
