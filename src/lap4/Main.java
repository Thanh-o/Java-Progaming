package lap4;

public class Main
{
    public static void main(){
        new SportCar();
        LuxuryCar c = new LuxuryCar();
        //We can not use c.service()
        //But we can use downcasing to use
        ((LuxuryCar) c).service();
    }
}