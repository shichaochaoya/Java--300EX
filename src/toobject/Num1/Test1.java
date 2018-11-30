package toobject.Num1;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        yuangong yuangong=new yuangong();
        yuangong.setName("JAVA");
        yuangong.setSalary(100);
        yuangong.setBirthday(new Date());
        Manager manager=new Manager();
        manager.setName("Father");
        manager.setBirthday(new Date());
        manager.setSalary(3000);
        manager.setBonus(2000);
        //输出员工和经理的属性值
        System.out.println("员工姓名"+yuangong.getName());
        System.out.println("员工工资"+ yuangong.getSalary());
        System.out.println("员工生日"+ yuangong.getBirthday());
        System.out.println("经理姓名"+manager.getName());
        System.out.println("经理生日"+ manager.getBirthday());
        System.out.println("经理工资"+ manager.getSalary());
        System.out.println("经理奖金"+ manager.getBonus());
    }
}
