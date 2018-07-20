package Day04.demo6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyHandler implements ActionListener {
    public void actionPerformed(ActionEvent e){
        //1.先获得事件源对象
        JButton btn=(JButton)e.getSource();
        String strNum=btn.getText();
        int num=Integer.parseInt(strNum);
        num++;
        btn.setText(num+"");
        System.out.println("调用了一次Handler");
    }
}
