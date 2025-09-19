package oop;

class MyThread3 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("I am a thread : "+this.getName());
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread4 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("I am a thread2 : "+this.getName());
        }
    }
}

public class ThreadMethods_75 {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread4 t2 = new MyThread4();
        t1.start();
//        try{
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        t2.start();
    }
}
