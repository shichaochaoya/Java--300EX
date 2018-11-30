public class EmperorTest {
    public static void main(String[] args) {
        System.out.println("创建皇帝1");
        Emperor emperor1=Emperor.getEmperor();
        emperor1.getName();
        System.out.println("创建皇帝");
        Emperor emperor2=Emperor.getEmperor();
        emperor1.getName();
    }
}
