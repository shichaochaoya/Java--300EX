package thread;

public class ThreadState implements Runnable {
    public synchronized void waitForASecond()throws InterruptedException{
        wait(500);//使当前线程等待五秒。，或其他线程调用notify（）方法
    }
    public synchronized void waitForYears() throws InterruptedException {
        wait();//使当前线程永久等待，知道其他线程调用notify方法
    }
    public synchronized void notifyNow(){
        notify();//唤醒由调用wait方法进入等待状态得线程
    }
    public void run() {
        try {
            waitForASecond();//在新线程中运行waitForSecond方法
            waitForYears();//在新线程中运行waitForYears方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Test{
    public static void main(String[] args) throws InterruptedException {
        ThreadState state=new ThreadState();
        Thread thread=new Thread(state);//创建线程
        System.out.println("新建线程："+thread.getState());//输出线程状态
        thread.start();//启动新线程r
        System.out.println("启动线程："+thread.getState());//输出线程状态
        Thread.sleep(100);//当前线程休眠0.1秒，使新线程运行waitForASecond方法
        System.out.println("计时等待"+thread.getState());//输出线程状态
        Thread.sleep(1000);//当前线程休眠一秒，使新线程运行waitForYears方法
        System.out.println("等待线程"+thread.getState());
        state.notifyNow();//调用stat的方法
        System.out.println("唤醒线程"+thread.getState());
        Thread.sleep(1000);//当前线程休眠一秒，使新的线程结束
        System.out.println("终止线程"+thread.getState());
    }

}
