package oop;

class Practice13 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Good Morning : "+this.getName());
        }
    }
}
class Practice13b extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome : "+this.getName());
        }
    }
}

public class PS_76 {
    public static void main(String[] args) {
        Practice13 p1 =new Practice13();
        Practice13b p2 = new Practice13b();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
