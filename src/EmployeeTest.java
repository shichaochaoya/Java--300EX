public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("克隆之前");
        Employee employee1=new Employee();
        employee1.setName("王xx");
        employee1.setAge(20);
        System.out.println("员工1的信息"+employee1);
        System.out.println("克隆之后");
        Employee employee2=employee1;
        employee2.setName("李xx");
        employee2.setAge(21);
        System.out.println("员工1的信息"+employee1);
        System.out.println("员工2的信息"+employee2);
    }
}
