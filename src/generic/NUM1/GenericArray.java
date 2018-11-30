package generic.NUM1;

import java.lang.reflect.Array;

public class GenericArray<T> {
    private T[]array;
    private int size;
    @SuppressWarnings("unchecked")
    public GenericArray(Class<T>type,int size){
        this.size=size;
        array=(T[]) Array.newInstance(type,size);//利用反射根据指定的类型长度创建泛型数组
    }
    public void put(int index,T item){
        if (size>index){
            array[index]=item;
        }
    }
    public T get(int index){
        if (size>index){
            return array[index];
        }else {
            return null;
        }
    }
}
