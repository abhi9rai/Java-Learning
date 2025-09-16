package oop;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("You are Welcome");
    }
    public void on(){
        System.out.println("Turning ON smartphone..");
    }
}

public class Dynamic_Method_Dispatch_49 {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        Smartphone sobj = new Smartphone();
//        obj.name();

        Phone obj = new Smartphone(); //It is allowed
//        Smartphone obj1=new Phone(); //Not Allowed
        obj.greet();
        obj.on();
    }
}
