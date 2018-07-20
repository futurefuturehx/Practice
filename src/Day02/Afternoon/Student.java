package Day02.Afternoon;
/*
根据实际情况 私有化属性 并提供共有的getter和setter方法
 */
public class Student {
    String name;
    int age;
    //为啥要这些setter getter方法呢
    //为了更加安全灵活
    //比如在setAge()里面写个if限制名字只能设置在100岁之内
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
