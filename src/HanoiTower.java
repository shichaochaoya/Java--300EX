public class HanoiTower {
    public static void moveDish(int leavel,char from,char inter,char to){
        if (leavel==1){
            System.out.println("从"+from+"移动盘子1号到"+to);
        }else {
            moveDish(leavel-1,from,to,inter);
            System.out.println("从"+from+"移动盘子"+leavel+"号到"+to);
            moveDish(leavel-1,inter,from,to);
        }
    }

    public static void main(String[] args) {
        int nDisk=3;
        moveDish(nDisk,'A','B','C');
    }
}
