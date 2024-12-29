package MainPackage.PractJavaProg;

class Practice {

    public static void main(String[] args) {
        try
        {
            int x=10;
            System.out.println("Hello"+""+x/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("World");
        }
    }
}