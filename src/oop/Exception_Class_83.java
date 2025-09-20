package oop;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return " I am toString()";
    }

    @Override
    public String getMessage() {
        return " I am getMessage()";
    }
}
class MyAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct ";
    }
}
public class Exception_Class_83 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if (a<99){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}
