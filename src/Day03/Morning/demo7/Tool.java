package Day03.Morning.demo7;

import sun.util.locale.ParseStatus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//2.5个处理异常的方式
public class Tool {
    public void test1(){
        //出现红波浪线不是说错了 而是可能出现异常 需要写try catch
        try {
            Class.forName("java.lang.String");
            SimpleDateFormat sdf =new SimpleDateFormat("uuuuu");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void test2()throws ClassNotFoundException,ParseException{
        Class.forName("java.lang.String");
        SimpleDateFormat sdf =new SimpleDateFormat();
    }
    public void test3(){
        FileInputStream fis=null;
        try{
            fis =new FileInputStream("xxxx");
            fis.read();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
