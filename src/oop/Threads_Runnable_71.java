package oop;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        for (int i=0; i<50;i++){
            System.out.println("I am a Thread1");
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    public void run() {
        for (int i=0; i<50;i++){
            System.out.println("I am a Thread2");
    }
    }
}

public class Threads_Runnable_71 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
