package toobject.Num7;

import java.awt.*;

public class GPSCar extends Car implements GPS {
@Override
public Point getLocation(){
    Point point=new Point();
    point.setLocation(super.getSpeed(),super.getSpeed());
    return point;
}
@Override
    public String toString(){
    StringBuilder sb=new StringBuilder();
    sb.append(super.toString()).append("坐标为"+getLocation().x+","+getLocation().y);
    return sb.toString();
}
}
