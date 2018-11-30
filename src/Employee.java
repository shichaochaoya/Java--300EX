/**
 * 假克隆
 * wang
 */
public class Employee {
    private String Name;
    private int age;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
@Override
    public String toString(){
        return "姓名"+Name+"年龄"+age;
}
}