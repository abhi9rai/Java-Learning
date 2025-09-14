package oop;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int aradius, int aheight ){
        radius=aradius;
        height=aheight;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int r) {
        radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height=h;
    }
    public double surfaceArea(){
        return 2* Math.PI*radius*radius+2* Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

class Reactangle{
    private int length;
    private int breadth;

    public Reactangle(){
        this.length=4;
        this.breadth=5;
    }
    public Reactangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class Ch9_PS_44 {
    public static void main(String[] args) {
        /*
//        Problem 1
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(12);
        cylinder.setRadius(9);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
//        Problem 2
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());

//        Problem 3
        Cylinder cylinder = new Cylinder(9,12);
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());

         */
//        problem 4
        Reactangle r= new Reactangle(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}
