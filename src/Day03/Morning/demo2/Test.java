package Day03.Morning.demo2;

public class Test {
    public static void main(String[] args) {
        //抽象类无法实例化 但可以由子类重写抽象类的方法 创建子类对象赋值给声明的抽象类
        //Person p=new Person();//错误
        Person p= new Chinese();//正确 显示实现类的方法
        p.speak();
    }
}
