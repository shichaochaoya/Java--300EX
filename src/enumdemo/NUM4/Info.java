package enumdemo.NUM4;

public enum  Info {
    DRIVER,URL,USERNAME,PASSWORD;
    public  String getInfo(Info info){
        switch (info){
            case DRIVER:
                return "com.";
            case URL:
                return "jdbc";
            case USERNAME:
                return "mr";
            case PASSWORD:
                return "mingrisoft";
                default:
                    return null;
        }
    }

    public static void main(String[] args) {
        for (Info info:Info.values()){
            System.out.println(info+":"+info.getInfo(info));
        }
    }
}
