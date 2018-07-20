package Day03.Morning.demo6;

import java.io.File;

//异常
//编译时异常(Checked Exception)
//运行时异常(Unchecked Exception)
//异常的层次结构
//Throwable
//     Exception
//          编译时异常（Checked Exception)
//                  其他异常类都是编译时异常
//                  IOException
//                  SQLException
//                  ...
//          运行时异常(Unchecked Exception)
//                  所有运行时异常都是RuntimeExceptionl类及其子类
//                  NullPointerException
//                  ArithmeticException
//                  ArrayIndexOutOfBoundsException
//                  ...
//      Error
//
public class Test {
    public static void main(String[] args) {
        //class.forName("xxxx");
        //数学的运行时异常
        int c=10/0;
        //但凡你写错就报错了 就是编译异常
        File f=new File("xxx");
        //下面两行 写的时候不报错 运行时报错 越界
        int[] arr={1,2,3};
        int num=arr[arr.length];

    }
}
