package oop;

class MyEmployee{
    private int id;
    private String name;

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

public class CH9_40 {
    public static void main(String[] args) {
        MyEmployee abhinav = new MyEmployee();
        //abhinav.id=45;
        //abhinav.name="Abhinav Rai"; --> throughs error due to private access modifier
        abhinav.setName("Abhinav Rai");
        abhinav.setId(45);
        System.out.println(abhinav.getName());
        System.out.println(abhinav.getId());
    }
}
