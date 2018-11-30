import java.util.Scanner;

public class sanyuanyunsuanfu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个整数");
        long number=scan.nextInt();
        String result=(number%2==0)?"这个数字是：偶数":"这个数字是奇数";
        System.out.println(result);
    }
}
