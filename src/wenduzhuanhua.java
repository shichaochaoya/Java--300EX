import java.util.Scanner;

public class wenduzhuanhua {
    public double gethuashidu(double wendu){
        double huashidu=1.8*wendu+32;
        return huashidu;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入当前温度");
        double w=scanner.nextDouble();
        System.out.println("您输入的温度是"+w+"摄氏度");
        wenduzhuanhua zhuanhua=new wenduzhuanhua();
        double h=zhuanhua.gethuashidu(w);
        System.out.println("当前华氏度为"+h+"度");
    }
}
