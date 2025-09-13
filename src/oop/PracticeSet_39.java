package oop;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
class CellPhone{
    public void ring() {
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }

}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing at the enemy");
    }
}

public class PracticeSet_39 {
    public static void main(String[] args) {
        /*
        Employee1 abhinav = new Employee1();
        abhinav.setName("Abhinav Rai");
        abhinav.salary=10;
        System.out.println(abhinav.getName());
        System.out.println(abhinav.getSalary());


//       problem 2
        CellPhone asus = new CellPhone();
        asus.vibrate();
        asus.ring();

//        problem 3
        Square sq = new Square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

         */
//        problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.hit();
        player1.run();
    }
}
