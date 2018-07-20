package Day02.Afternoon.demo12;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("jack",25);
        String info=s1.toString();
        System.out.println(info);
        System.out.println(s1);
        //这边也是多态 以子类的重写方法为主
        Object obj1=new Student("rose",33);
        System.out.println(obj1);
        /////////////////////////////
        int a=10;
        int b=10;
        String ss1=new String("aaa");
        String ss2=new String("aaa");
        //引用数据类型要用equals进行比较
        //因为直接用”==“比较的话 绝对不同 是不同的对象 只是相同的内容
        //而equals()就是忽略了对象不同 只要内容相同就是相同
        //当然你可以重写equals()忽略更多 比如首字母相同就认为相同
        System.out.println(ss1.equals(ss2));
        System.out.println(ss1==ss2);
    }
}
