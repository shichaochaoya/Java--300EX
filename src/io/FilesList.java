package io;

import java.util.*;

public class FilesList {


    /* public static void main(String[] args) {
            // 1. 创建一个顶层容器（窗口）
            JFrame jf = new JFrame("测试窗口");          // 创建窗口
            jf.setSize(250, 250);                       // 设置窗口大小
            jf.setLocationRelativeTo(null);             // 把窗口位置设置到屏幕中心
            jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 当点击窗口的关闭按钮时退出程序（没有这一句，程序不会退出）

            // 2. 创建中间容器（面板容器）
            JPanel panel = new JPanel();                // 创建面板容器，使用默认的布局管理器

            // 3. 创建一个基本组件（按钮），并添加到 面板容器 中
            JButton btn = new JButton("测试按钮");
            panel.add(btn);


            // 4. 把 面板容器 作为窗口的内容面板 设置到 窗口
            jf.setContentPane(panel);

            // 5. 显示窗口，前面创建的信息都在内存中，通过 jf.setVisible(true) 把内存中的窗口显示在屏幕上。
            jf.setVisible(true);
        }*/
    /*public static void main(String[]args){
            StringBuilder stringBuilder=new StringBuilder("hello");
            *//*stringBuilder.append(1).append(2);*//*
            System.out.println(stringBuilder.toString());
            }
    }*/

   /* public static void main(String[] args) {
        *//**
         *HashMap 实现 无序储存
         *//*
        Map<String,String> map=new HashMap<>();
        map.put("005","wang");
        map.put("009","wang3");
        map.put("006","wang2");
        Set<String>it=map.keySet();
        Iterator<String> iterator=it.iterator();
        while (iterator.hasNext()){
            String str=(String)iterator.next();
            String name=(String)map.get(str);
            System.out.println(str+" "+name);
            //System.out.println((String)iterator.next()+" "+(String)map.get((String)iterator.next()));//线程异常
        }
        *//***
         *TreeMap 实现 自动排序
         *//*
        Map<String,String> treeMap=new TreeMap<>();
        treeMap.put("5","wang5");
        treeMap.put("4","wang4");
        Set<String>it2=treeMap.keySet();
        Iterator<String> iterator2=it2.iterator();
        while (iterator2.hasNext()) {
            String str2 = (String) iterator2.next();
            String name2 = (String) treeMap.get(str2);
            System.out.println(str2 + " " + name2);
        }




        }*/







   /* public static void main(String[] args) {
        Button cho=new Button();
        final Scanner fileType = new Scanner(System.in);
        if (fileType.next().isEmpty()){
            System.out.println("请输入文件类型");
            return;
        }
        JFileChooser chooser=new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//设置仅能选择文件夹
        chooser.setMultiSelectionEnabled(false);
        int result=chooser.showOpenDialog(cho);
        if (result == JFileChooser.APPROVE_OPTION) {
            File[]listFiles=chooser.getSelectedFile().listFiles(new java.io.FileFilter(){
                @Override
                public boolean accept(File pathname){
                    if (pathname.getName().endsWith(String.valueOf(fileType))){
                        return true;
                    }else {return false;}
                }
            });//获得符合条件的文件
            for (File file:listFiles){
                String name=file.getName();
                long size=file.length();
                String modifyDate= (String.valueOf(file.lastModified()));
                System.out.print("NAME:"+name+"\t"+"SIZE:"+size+"\t"+"MODIFDATE:"+modifyDate);
                System.out.println();
            }
        }


    }*/
     /*interface Constants{
    public static final int Constants_A=1;
    int Constants_B=12;
    }
    public enum Constsnts{
    Constants_A,Constants_B,Constants_C
    }
    767ukm,*/
    public static void main(String[] args) {
        Map<String,String> maps=new HashMap<String,String>();
        maps.put("123","456");
        int[][]a={{123},{234}};
    }




}
























