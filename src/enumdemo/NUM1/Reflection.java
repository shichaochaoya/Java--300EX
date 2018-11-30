package enumdemo.NUM1;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String[] args) {
        Class<Position>enumClass=Position.class;//获得表示枚举类型的Class对象
        String modifiers= Modifier.toString(enumClass.getModifiers());//获得表示枚举类的Class对象
        System.out.println("enum类的修饰符："+modifiers);
        System.out.println("enum类的父类："+enumClass.getSuperclass());
        System.out.println("enum类型的自定义方法：");
        Method[] methods=enumClass.getDeclaredMethods();//获取枚举类型的自定义方法
        for (Method method:methods){
            System.out.println(method);//输出方法的完整名称
        }
    }
}
