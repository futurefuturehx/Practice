package Day04.demo4;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
public class LoginFrame extends JFrame {
    private  JLabel lblName=new JLabel("用户");
    private JTextField jtfName=new JTextField(20);
    private JLabel lblPwd =new JLabel("密码:");
    private JPasswordField jpfPwd=new JPasswordField(20);
    private JButton btnLogin=new JButton("登陆");
    private JButton btnCancel=new JButton("取消");
    public LoginFrame(String title){
        lblName.setBounds(65,55,50,25);
        jtfName.setBounds(125,55,100,25);
        lblPwd.setBounds(65,105,50,25);
        jpfPwd.setBounds(125,105,100,25);
        btnLogin.setBounds(65,220,100,25);
        btnCancel.setBounds(200,220,100,25);
        this.setLayout(null);
        this.add(lblName);
        this.add(jtfName);
        this.add(lblPwd);
        this.add(jpfPwd);
        this.add(btnLogin);
        this.add(btnCancel);
        this.setTitle(title);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
