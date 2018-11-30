public class Continue {
    public static void main(String[] args) {
       /* String[]array=new String[]{"白鹭","丹顶鹤 ","黄鹂","鹦鹉","乌鸦","喜鹊","老鹰","布谷鸟","老鹰","会文鸟","百灵鸟"};
        System.out.println("抓走老鹰");
        int eagleCount=0;
        for (String string:array){
            if (string.equals("老鹰")){
                System.out.println("发现老鹰，抓走");
                eagleCount++;
                continue;
            }
            System.out.println("发现了："+string);
        }
        System.out.println("捉到了"+eagleCount+"只老鹰");*/

     int[][]myScores=new int[][]{{67,78,63,22,66},{55,68,78,95,44,},{95,97,92,93,81}};
        System.out.println("宝宝这次考试成绩：\n数学\t语文\t英语\t美术\t历史");
        No1:for (int[] is:myScores){//带标签结束带到标签处的外层循环
            for (int i:is){
                System.out.print(i+"\t");
                if(i<60){
                    System.out.println("\n等等，"+i+"分的是什么？这个为什么不及格？");
                    break No1;
                }
            }
            System.out.println();
        }
    }
}
