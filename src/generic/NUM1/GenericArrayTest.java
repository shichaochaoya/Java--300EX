package generic.NUM1;
public class GenericArrayTest {
    public static void main(String[] args) {
        System.out.println("创建String类行的数组并添加元素：maomao");
        GenericArray<String> stringArray=new GenericArray<>(String.class,10);
        stringArray.put(0,"maomao");
        System.out.println("String类型的数组元素："+stringArray.get(0));
        System.out.println("创建Integer类型的数组并添加元素：123456789");
        GenericArray<Integer>integerArray=new GenericArray<>(Integer.class,10);
        integerArray.put(0,123456789);
        System.out.println("Integer类型的数组元素："+integerArray.get(0));
    }
}
