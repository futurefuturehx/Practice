package Day03.Afternoon.Demo1;

import com.sun.deploy.security.MozillaMyKeyStore;

//线程
//两种实现线程的方式
//1-Thread(线程类)
//      a.自定义一个类，继承Thread类
//      b.重写run()方法（run方法是线程执行的方法)
//      c.启动线程，创建线程类对象.start()启动线程
//      d.调用start()启动线程,该线程就执行run方法的内容
//2_Runnable(接口)+Thread类
public class Test {
    public static void main(String[] args) {//main线程或者主线程
        System.out.println("=====");
        //获得运行main方法的线程名字
        String name=Thread.currentThread().getName();//获得当前线程的名字
        System.out.println(name);
        //c-
        MyThread mt=new MyThread();
        //d-
        //主线程中调用副线程 mt是副线程对象
        //相当于把MyThrad的while(true)也引入到这里
        //两者都是sleep(100) 所以两者看起来均匀交替执行
        mt.start();
        while(true){
            System.out.println(name+"......");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
