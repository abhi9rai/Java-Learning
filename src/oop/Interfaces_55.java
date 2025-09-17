package oop;

interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int b =45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pe pe pe");
    }
    @Override
    public void applyBrake(int decrement){
        System.out.println("Aplying brake");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying Speedup");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum");
    }
    public void blowHornmhn(){
        System.out.println("Mai hu na");
    }
}
public class Interfaces_55 {
    public static void main(String[] args) {
        AvonCycle cycleabhinav = new AvonCycle();
        cycleabhinav.applyBrake(1);
//        You can create properties in Iterfaces
//        System.out.println(cycleabhinav.a);
//        We cannot modify properties in interfaces as they are final

        cycleabhinav.blowHornmhn();
        cycleabhinav.blowHornK3g();
    }
}
