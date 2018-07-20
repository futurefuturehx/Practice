package daydayrun.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoRegister {
    private int flag;//专一事

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public User RegisterUser(String name, String pwd)
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User u  =null;
        try{
            conn  = DBUtil.getConnection();
            //为了不干扰
            String Sql = "insert into user(name,password)values('"+name+"','"+pwd+"')"; // 预编译

            stmt = conn.prepareStatement(Sql);
            // 给问号赋值
            flag=stmt.executeUpdate(Sql);
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