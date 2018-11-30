import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeNewTest {
    public static void main(String[] args) {
        List<EmployeeNew>employeeNews=new ArrayList<EmployeeNew>();//创建列表保存对象
        EmployeeNew employeeNew=new EmployeeNew("李XX",25);//创建Employee类的对象
        long currentTime=System.currentTimeMillis();//或的当前系统时间
        for (int i=0;i<100000;i++){
            employeeNews.add(employeeNew.clone());
        }
        System.out.println("克隆花费时间"+(System.currentTimeMillis()-currentTime)+"毫秒");
        currentTime=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            ObjectOutputStream out=null;
            try {
                out=new ObjectOutputStream(baos);
                out.writeObject(employeeNew);
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                //省略释放资源代码
            }
            //获得字节数组输出流内容
            ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream in=null;
            try {
                in=new ObjectInputStream(bais);//创建对象输入流
                employeeNews.add((EmployeeNew) in.readObject());
            }catch (IOException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }finally {
                //省略释放代码
            }
        }
        System.out.println("序列花费时间"+(System.currentTimeMillis()-currentTime)+"毫秒");
    }
}
