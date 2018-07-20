package Day03.Afternoon.Demo2;

public class Test {
    //非调用按顺序的线程实现
    public static void main(String[] args) {
        //通过对象调用start()实现线程
        Thread th=new Thread(){
            //run()里面是主要的代码
            //功能代码包装在run()里面
        public void run(){
            while(true){
                System.out.println("======");
                try{
                    //该线程睡了 就找下一个线程执行
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
    };
    th.start();
    //通过内部类调用start()实现线程
        new Thread(){
        public void run(){
            while(true){
                System.out.println("****************");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
    }.start();
    while(true){
        System.out.println("main$$$$$$$$$$$$$$$$$$$$");
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
             }
         }
    }
}
