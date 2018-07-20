package Day04.demo7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
    private JButton btn = new JButton("1");

    public MyFrame(String title){
        btn.addActionListener(this);
        this.add(btn);
        this.setTitle(title);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String strNum = btn.getText();
        int num = Integer.parseInt(strNum);
        num++;
        btn.setText(num + "");
        System.out.println("===========");
    }
}