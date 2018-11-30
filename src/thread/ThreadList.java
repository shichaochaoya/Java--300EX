package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadList {
    private static ThreadGroup getRootThreadGroups(){//获得线程根组，ThreadGroup表示一个线程的集合
        ThreadGroup rootGroup=Thread.currentThread().getThreadGroup();//获得当前线程
        while (true){
            if (rootGroup.getParent() != null) {//如果返回值不为null则不是根线程组
                rootGroup=rootGroup.getParent();//获得父线程组
            }else {
                break;//如果到达跟线程组则退出循环
            }
        }
        return rootGroup;//返回线程根组
    }
    public static List<String>getThreads(ThreadGroup group){//获得给定线程中所有线程名
        List<String> threadList=new ArrayList<>();//创建保存线程名称的列表
        Thread[]threads=new Thread[group.activeCount()];//根据或活动线程数创建线程数组
        int count=group.enumerate(threads,false);//复制线程到线程数组
        for (int i = 0; i <count ; i++) {//遍历线程数组将贤线程名及其所在数组保存到列表中
            threadList.add(group.getName()+"线程组："+threads[i].getName());
        }
        return threadList;//返回列表
    }
    public static List<String>getThreadGroupe(ThreadGroup group){//获得线程组中子线程组
        List<String>threadList=getThreads(group);//获得给定线程组中线程名
        ThreadGroup[]groups=new ThreadGroup[group.activeGroupCount()];//创建线程组数组
        int count=group.enumerate(groups,false);//复制子线程组到线程组数据
        for (int i = 0; i < count; i++) {//遍历所有子线程组
            threadList.addAll(getThreads(groups[i]));//利用方法获得线程名列表
        }
        return threadList;//返回所有线程名
    }

    public static void main(String[] args) {
        for (String string:getThreadGroupe(getRootThreadGroups())){
            System.out.println(string);//遍历输出列表中的字符串
        }
    }
}
