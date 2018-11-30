package enumdemo.NUM5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.EnumSet;

import static enumdemo.NUM5.Weeks.MONDAY;
import static enumdemo.NUM5.Weeks.TUESDAY;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<Weeks>week=EnumSet.noneOf(Weeks.class);//创建一个Weeks类型的EnumSet
        week.add(MONDAY);
        System.out.println("EnumSet中的元素："+week);
        week.remove(MONDAY);
        System.out.println("EnumSet中的元素："+week);
        week.addAll(EnumSet.complementOf(week));//向EnumSet中增加week中元素的补集
        System.out.println("EnumSet中的元素："+week);
        week.removeAll(EnumSet.range(MONDAY,TUESDAY));//删除week中的MONDAY到TUESDAY元素
        System.out.println("EnumSet中的元素："+week);
    }
}
