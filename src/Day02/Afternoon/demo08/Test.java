package Day02.Afternoon.demo08;
/*
所有类都是Object类的直接子类或者间接子类
 */
public class Test{
    public static void main(String[] args) {
        Student st=new Student();
        st.setAge(15);
        System.out.println(st.age);
        System.out.println(st.toString());
    }
}

