package toobject.Num4;

public class Custorner {
    public static void main(String[] args) {
        System.out.println("顾客要购买BMW");
        Car brnw=CarFactory.getCar("BMW");
        System.out.println("提取汽车"+brnw.getInfo());
        System.out.println("顾客要购买Benz");
        Car benz=CarFactory.getCar("Benz");
        System.out.println("提取汽车"+benz.getInfo());
    }
}
