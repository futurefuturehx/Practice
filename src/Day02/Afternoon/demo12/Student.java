package Day02.Afternoon.demo12;

public class Student {
    String name;
    int age;
    @Override
    //重写Object的ToSting()方法
    //重构结构
    public String toString(){
        return this.name+","+this.age;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals(Object obj){
        boolean flag=false;
        if(obj instanceof Student){
            Student s=(Student) obj;
            if(this.name.equals(s.name)&&this.age==s.age){
                flag=true;
            }
        }
        return flag;
    }
}
