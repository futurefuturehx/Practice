package daydayrun.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoDenglu {

    public User findUser(String name,String pwd)
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User u  =null;
        try{
            conn  = DBUtil.getConnection();

            String Sql = "select * from user where name=? and password=?"; // 预编译

            stmt = conn.prepareStatement(Sql);
            // 给问号赋值
            stmt.setString(1,name);
            stmt.setString(2,pwd);
//			String sql ="select * from stu28 where Name = '"+name+"' AND PASsword = '"+pwd+"'";
            // 这样写会导致SQL注入问题    就是后面   or   '1'='1

            rs  = stmt.executeQuery();
            if(rs.next())
            {
                u  =  new User();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setPassword(rs.getString(3));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            DBUtil.closeAll(rs, stmt, conn);
        }
        return u;
    }
}