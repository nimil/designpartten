package xin.nimil.design.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:16:37
 */
public class Test {

    public static void main(String[] args) throws Exception{
       // LazySingleton instance = LazySingleton.getInstance();

        //System.out.println(instance);

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();

        //序列化对象
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("sing_file"));
//        objectOutputStream.writeObject(hungrySingleton);
//
//        File file = new File("sing_file");
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("sing_file"));
//
//        HungrySingleton o = (HungrySingleton)objectInputStream.readObject();
//
//        System.out.println(o);
//        System.out.println(hungrySingleton);


//        Class objectclass = HungrySingleton.class;
//        Constructor constructor = objectclass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        HungrySingleton hungrySingleton1 = (HungrySingleton) constructor.newInstance();
//
//        System.out.println(hungrySingleton);
//        System.out.println(hungrySingleton1);



    }

}
