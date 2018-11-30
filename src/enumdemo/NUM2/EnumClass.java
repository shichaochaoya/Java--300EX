package enumdemo.NUM2;

public class EnumClass {
    public static void main(String[] args) {
        for (Size size:Size.values()){
            System.out.println(size+"的序数是"+size.ordinal());//查看元素得顺序
            System.out.println(size.compareTo(Size.SAMLL)+" ");
            System.out.println(size.equals(Size.SAMLL));
            System.out.println(size==Size.SAMLL);
            System.out.println(size.name());//获得枚举元素的名称
            System.out.println("**************");
        }
    }
}
