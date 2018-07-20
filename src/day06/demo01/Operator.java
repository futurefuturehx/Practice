package day06.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Operator {
	public static int commom(String sql, Object[] objs) {
		int rows = 0;
		Connection con = null;
		PreparedStatement ps = null;

		try {
			Class.forName(Conf.DRIVER);
			con = DriverManager.getConnection(Conf.URL, Conf.USER, Conf.PWD);
			ps = con.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				ps.setObject(i + 1, objs[i]);
			}
			rows = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}

		return rows;
	}

	// ����
	public static void insert(Student s) {
		String sql = "insert into student values(?, ?, ?, ?)";
		Object[] objs = {s.getSno(), s.getName(), s.getAge(), s.getGender()};
		int rows = commom(sql, objs);
		if (rows != 0) {
			System.out.println("�ɹ�");
		} else {
			System.out.println("ʧ��");
		}
	}

	// ɾ��
	public static void delete(Student s) {
		String sql = "delete from student where sno = ?";
		Object[] objs = {s.getSno()};
		int rows = commom(sql, objs);
		if (rows != 0) {
			System.out.println("�ɹ�");
		} else {
			System.out.println("ʧ��");
		}
	}

	// �޸�
	public static void update(Student s) {
		String sql = "update student set age = ? where sno = ?";
		Object[] objs = {s.getAge(), s.getSno()};
		int rows = commom(sql, objs);
		if (rows != 0) {
			System.out.println("�ɹ�");
		} else {
			System.out.println("ʧ��");
		}
	}

	//��ԃͨ�ò���
	public static List<Student> query(String sql, Object[] objs) {
		List<Student> stus = new ArrayList<Student>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(Conf.DRIVER);
			con = DriverManager.getConnection(Conf.URL, Conf.USER, Conf.PWD);
			ps = con.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				ps.setObject(i + 1, objs[i]);
			}
			// ִ�в�ѯ�������ز�ѯ�Ľ��
			rs = ps.executeQuery();
			while (rs.next()) {
				int sno = rs.getInt("sno");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				Student s = new Student(sno, name, age, gender);
				stus.add(s);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}

		return stus;
	}

	// �رղ���
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
				rs = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (ps != null) {
			try {
				ps.close();
				ps = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void selectAll() {
		String sql = "select sno, name, age, gender from student";
		Object[] objs = {};
		List<Student> stus = query(sql, objs);
		for(Student s : stus){
			System.out.println(s);
		}
	}

	public static void selectBySno(Student s) {
		String sql = "select sno, name, age, gender from student where sno = ?";
		Object[] objs = {s.getSno()};
		List<Student> stus = query(sql, objs);
		for(Student ss : stus){
			System.out.println(ss);
		}
	}
	
	public static void selectByCondition(Student s){
		String sql = "select sno, name, age, gender from student where name like ?";
		Object[] objs = {"%" + s.getName() +"%"};
		List<Student> stus = query(sql, objs);
		for(Student ss : stus){
			System.out.println(ss);
		}
	}
	
	public static void selectSort(){
		String sql = "select sno, name, age, gender from student order by age desc limit 3";
		Object[] objs = {};
		List<Student> stus = query(sql, objs);
		for(Student ss : stus){
			System.out.println(ss);
		}
	}
}
