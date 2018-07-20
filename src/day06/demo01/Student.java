package day06.demo01;

public class Student {
	private int sno;
	private String name;
	private int age;
	private String gender;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(int sno, String name, int age, String gender) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + "]";
	}
}
