package oop;

class Circle{
    Circle(){
        System.out.println("I am non parameterized constructor");
    }
    Circle(int r){
        System.out.println("I am circle parametrized constructor");
        this.radius=r;
    }
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parametrized constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class CH10_PS_52 {
    public static void main(String[] args) {
        //Problem 1
//        Circle objc= new Circle(12);
        Cylinder1 obj = new Cylinder1(12,4);
    }
}
