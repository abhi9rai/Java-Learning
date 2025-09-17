package oop;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K...");
    }
}
interface MyWifi{
    String[] getNetworks();
}

class MyCellPhone{
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

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
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

public class DefaultsMethods_57 {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] ar=ms.getNetworks();
        for (String item:ar){
            System.out.println(item);
        }
    }
}
