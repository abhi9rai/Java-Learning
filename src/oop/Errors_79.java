package oop;

import java.util.Scanner;

public class Errors_79 {
    public static void main(String[] args) {
//        SYNTAX ERROR DEMO
//        int a = 0
//        b=9;

//        LOGICAL ERROR DEMO
//        write a prg to write all prime number from 1 to 10
        System.out.println(2);
        for(int i=1; i<5;i++){
            System.out.println(2*i+1);
        }

//            RUNTIME ERROR DEMO
            int k;
            Scanner sc = new Scanner(System.in);
            k=sc.nextInt();
            System.out.println("Integer part of 1000 divided bt k is " +1000/k);
    }
}
