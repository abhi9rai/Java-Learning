package oop;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("I am a thread");
        }
    }
}

public class Thread_Constructor_73 {
    public static void main(String[] args) {
        MyThr t1 =new MyThr("Abhinav");
        MyThr t2=new MyThr("Abhishek");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is "+t1.getId());
        System.out.println("The id of the thread t is "+t1.getName());
        System.out.println("The id of the thread t is "+t2.getId());
        System.out.println("The id of the thread t is "+t2.getName());
    }
}
