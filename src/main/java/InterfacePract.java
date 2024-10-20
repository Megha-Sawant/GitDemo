public class InterfacePract implements JavaOopInterface, JavaOopInterface2
{
    @Override
    public void trafficRedSignal() {

    }

    @Override
    public void trafficYellowSignal() {

    }

    @Override
    public void trafficGreenSignal() {

    }
    public static void main(String [] arg)
    {
        JavaOopInterface obj= new InterfacePract();
        JavaOopInterface2 obj1= new InterfacePract();
        InterfacePract obj3= new InterfacePract();
        obj.trafficGreenSignal();
        obj.trafficRedSignal();
        obj.trafficYellowSignal();
        System.out.println(obj.a);
        obj1.TrainSignal();
        obj3.TrafficeRule();
    }

    @Override
    public void TrainSignal() {

    }
    public void TrafficeRule()
    {

    }
}
