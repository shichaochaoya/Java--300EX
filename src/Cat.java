import java.awt.*;

public class Cat {
//定义猫咪
    private String name;
    private int age;
    private double weight;
    private Color color;
//初始化猫咪的属性
    public Cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) {//利用属性判断
        if (this == obj) {//如果是同一个对象
            return true;
        }
        if (obj == null) {//如果两猫咪有一个为null则不同
            return false;
        }
        if (getClass() != obj.getClass()) {//如果两猫咪类型不同则不同
            return false;
        }
        //比较
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && (age == cat.age) && (weight == cat.weight) && (color.equals(cat.color));
    }
    //重写tostring方法
        @Override
                public String toString(){
                    StringBuilder sb=new StringBuilder();
                    sb.append("名字"+name+"\n").append("n年龄"+age+"\n").append("重量"+weight+"\n").append("颜色"+color+"\n");
                    return sb.toString();
    }
}
