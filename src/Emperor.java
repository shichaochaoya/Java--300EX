public class Emperor {
    private static  Emperor emperor=null;

    public Emperor() {
    }

    public static Emperor getEmperor() {
        if (emperor==null){
            emperor=new Emperor();
        }
        return emperor;
    }
    public void getName(){
        System.out.println("我是皇帝：wang");
    }
}
