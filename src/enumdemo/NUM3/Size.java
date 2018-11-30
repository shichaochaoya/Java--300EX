package enumdemo.NUM3;

public enum Size {
    SMALL("我是小号披萨"),MEDIUM("我是中号披萨"),LARGE("我是大号披萨");
    String description;
    Size(String description) {
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (Size size:Size.values()){
            System.out.println(size+":"+size.getDescription());
        }
    }
}
