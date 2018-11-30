import java.awt.*;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1=new Cat("Java",12,21, Color.BLACK);
        Cat cat2=new Cat("C++",12,21,Color.WHITE);
        Cat cat3=new Cat("Java",12,21,Color.BLACK);
        System.out.println("猫咪一号"+cat1);
        System.out.println("猫咪二号"+cat2);
        System.out.println("猫咪三号"+cat3);
        System.out.println("猫咪一号是否与猫咪二号相同"+cat1.equals(cat2));
        System.out.println("猫咪一号是否与猫咪三号相同"+cat1.equals(cat3));

    }
}
