package Day02.Afternoon.demo9;
//从父亲那里继承过来 但是看不上父亲的那个方法 可以重写
//注意：
//1.方法的返回值 方法名及方法的参数类型与父类中方法完全相同
//2.子类中方法的访问修饰符>=父类中方法的修饰符
//private<default<protected<public
//3.子类重写的方法不能抛出比父类多个编译时异常
public class Son extends Father{
    @Override
    public void love(){
        super.love();//偶尔想象父亲的方法有时还行 所以把它包括进来两个都有
        System.out.println("微信");
    }
}
