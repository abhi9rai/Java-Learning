package oop;

import java.util.Scanner;

public class PS_86 {
    public static void main(String[] args) {
//        Problem 1
//        int a=7 --> Syntac error
//        int age =78;
//        int year_born=2000-78; --->   Logical error
//        System.out.println(6/0); ---> ArithmeticException

//        Problem 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = sc.nextInt();
//        System.out.println("Enter a number");
//        int b = sc.nextInt();
//        try{
//            int c=a/b;
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Haha");
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println("HeHe");

//        Problem 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is  " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
