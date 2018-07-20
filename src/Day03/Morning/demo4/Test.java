package Day03.Morning.demo4;

public class Test {
    public static void main(String[] args) {
        //普通类
        Father f1=new Father(){
            @Override
            public void love(){
            System.out.println("内部类实现");
            }
        };
        f1.love();
        //多数使用这种方式 匿名内部类
        Flyer f2=new Flyer(){
            @Override
            public void fly(){
                System.out.println("匿名内部类");
            }
        };
        f2.fly();
    }
}
