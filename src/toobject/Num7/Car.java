package toobject.Num7;

public class Car {
    private String name;
    private double speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
       StringBuilder sb=new StringBuilder();
       sb.append("车名"+name+",").append("速读"+speed+"千米没小时");
       return sb.toString();
    }
}
