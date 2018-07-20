package Day03.Morning.demo3;

public class Test {
    public static void main(String[] args) {
        Flyer f1=new Bird();
        Flyer f2=new Ironman();
        //接口不能实例化 但是可以创建实现类对象赋值给声明的接口
        //调用结果以实现类为主
        f1.fly();
        f2.fly();
    }
}
