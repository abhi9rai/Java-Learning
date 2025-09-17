package oop;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi2{
    String[] getNetworks();
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

//    void takeSnap() {
//        System.out.println("Taking snap");
//    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo() {
        System.out.println("Recording video");
    }
    public void record4KVideo() {
        System.out.println("Recording 4K video");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList={"Abhinav", "Abhi", "nav"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }

//    @Override
//    public String[] getNetworks(String Network) {
//        return new String[0];
//    }
}


public class Polymorphism_59 {
    public static void main(String[] args) {
        MyCamera2 cam1 =new MySmartPhone2();
//        cam1.getNetworks(); ----Not allowed
        cam1.record4KVideo();

        MySmartPhone2 s=new MySmartPhone2();
        s.recordVideo();
        s.takeSnap();
        s.getNetworks();
        s.callNumber(1234);
    }
}
