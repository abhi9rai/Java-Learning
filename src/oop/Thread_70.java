package oop;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40) {
            System.out.println("My Cooking thread is running");
            System.out.println("I am happy");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40) {
            System.out.println("Thread 2 for chatting");
            System.out.println("I am sad");
        }
    }
}

public class Thread_70 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }
}
