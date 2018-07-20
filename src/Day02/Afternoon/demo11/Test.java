package Day02.Afternoon.demo11;
/*
多态
1.继承结构
2.子类重写父类的方法
3.创建子类对象赋值给声明父类对象
4.使用声明的父类对象 调用被重写的方法 真正执行的是子类重写后的方法
 */
public class Test {
    public static void main(String[] args) {
        //向父类转化
        Father f1=new SonA();
        Father f2=new SonB();
        Father f3=new SonC();
     //   f1.show();//显示的是SonA的show方法
     //   f2.show();//显示的是SonB的show方法
     //   f3.show();//显示的是SonC的show方法
        //这就是多态啊
        //创造了很多形态（SonA() SonB() SonC()) 就可以不断切换形态(通过new 某种形态 就是切换到某种形态)
        //haha(new SonA());//f=new SonA()
        //haha(new SonB());//f=new SonB()
        //haha(new SonC());//f=new SonC()
        //子类与父类相互转换
        //子类向上转型
        Father ff=new SonA();
        //父类
    }
}
