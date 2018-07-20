package Day02.Afternoon.demo08;

public class Person {
    int sno;
    String name;
    String gender;
    String phone;
    //发现这些代码Employee也有 人是偷懒动物 所以我们抽取共性 Person
    public void eat(){
        System.out.println("eat...");
    }
    public void playGame(){
        System.out.println("game...");
    }
    public int add(int a,int b){
        return a+b;
    }
}
