import java.io.Serializable;

public class EmployeeNew implements Cloneable, Serializable {
    private String name;
    private int age;
    private static final long serialVersinonUID=5022956767440380940L;
    public EmployeeNew(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
    StringBuilder sb=new StringBuilder();
    sb.append("姓名"+name+",").append("年龄"+age+",");
    return sb.toString();
    }
    @Override
    protected EmployeeNew clone(){
        EmployeeNew employeeNew=null;
        try {
            employeeNew=(EmployeeNew)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return employeeNew;
    }
}
