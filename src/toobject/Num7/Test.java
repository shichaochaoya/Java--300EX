package toobject.Num7;

public class Test {
    public static void main(String[] args) {
        System.out.println("自定义普通汽车");
        Car car=new Car();
        car.setName("BMW");
        car.setSpeed(60);
        System.out.println(car);
        System.out.println("自定义GPS汽车");
        GPSCar gpsCar=new GPSCar();
        gpsCar.setName("BMW2.0");
        gpsCar.setSpeed(80);
        System.out.println(gpsCar);
    }

}
