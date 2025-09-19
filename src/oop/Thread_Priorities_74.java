package oop;

class MyThre extends Thread{
    public MyThre(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("I am a thread : "+this.getName());
        }
    }
}

public class Thread_Priorities_74 {
    public static void main(String[] args) {
        MyThre t1 =new MyThre("Abhinav1");
        MyThre t2=new MyThre("Abhinav2");
        MyThre t3=new MyThre("Abhinav3");
        MyThre t4=new MyThre("Abhinav4");
        MyThre t5=new MyThre("Abhinav5 (Most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
