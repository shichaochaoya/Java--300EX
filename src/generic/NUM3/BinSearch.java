package generic.NUM3;

import java.util.Arrays;

public class BinSearch {
    public static <T extends Comparable<? super T>> int search(T[]array,T key){
        int low=0;
        int mid=0;
        int hight=array.length;
        System.out.println("查找中间值：");
        while (low <= hight) {
            mid=(low+hight)/2;
            System.out.println(mid+" ");
            if (key.compareTo(array[mid]) > 0) {
                low=mid+1;
            } else if (key.compareTo(array[mid]) < 0) {
                hight=mid-1;
            }else {
                System.out.println();
                return mid;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Integer[] intes={1,2,3,4,5,6,7,8,9,0};
        System.out.println("数组集合");
        System.out.println(Arrays.toString(intes));
        System.out.println("元素3对应得索引序号："+search(intes,3));

    }
}
