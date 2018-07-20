package Day03.Afternoon.Demo1;

public class MyThread extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("mythread......");
            //让线程休眠
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
