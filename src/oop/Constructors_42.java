package oop;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(String myName, int myId){
        id=myId;
        name=myName;
    }
    public MyMainEmployee(String myName){
        id=1;
        name=myName;
    }
    public MyMainEmployee(){
        id=45;
        name="Abhishek";
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}

public class Constructors_42 {
    public static void main(String[] args) {
        MyMainEmployee abhinav= new MyMainEmployee("Abhi");
//        abhinav.setName("Abhinav Rai");
//        abhinav.setId(45);
        System.out.println(abhinav.getId());
        System.out.println(abhinav.getName());
    }
}
