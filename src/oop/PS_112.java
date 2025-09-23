package oop;
//class MyDeprecated{
//    @Deprecated
//    void meth1(){
//        System.out.println("I am method 1");
//    }
//}
//
//interface MyInt{
//    void display();
//}

import java.io.FileWriter;
import java.io.IOException;

public class PS_112 {
    public static void main(String[] args) {
//        MyDeprecated d = new MyDeprecated();
//        d.meth1();
//        MyInt i = () -> System.out.println("I am display");

        int i=5;
        String table = "";
        for (int j =0 ;j <10 ;j++){
            table += i + "X" + (j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
