package day06.demo01;

public class Test {
	public static void main(String[] args) {
//		Operator.selectBySno();
//		Operator.selectByCondition();
		Student s1 = new Student(22, "andy", 45, "��");
//		Operator.insert(s1);
		
		s1.setAge(77);
//		Operator.update(s1);
		
		s1.setSno(50);
//		Operator.delete(s1);
		
//		s1.setName("oi");
//		Operator.selectByCondition(s1);
		
//		Operator.selectAll();
		
		Operator.selectSort();
		
	}
}
