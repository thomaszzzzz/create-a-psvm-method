package com.github.hcsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    // Create a public static void main(String[] args) method here.
    // 在这里创建一个public static void main(String[] args)方法。
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\AcerAcerAcerAcer\\Desktop\\jirengujava\\create-a-psvm-method\\src\\main\\java\\com\\github\\hcsp\\Main.java");
        while (true){
            int b = is.read();
            if (b==-1)
                break;//读取完毕时会返回-1
            System.out.print((char) b);
        }//打印is
    }

}
