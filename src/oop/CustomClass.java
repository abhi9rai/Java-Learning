package oop;
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and My name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Abhinav = new Employee();
        Employee Abhishek = new Employee();
//        setting attributes
        Abhinav.id=7;
        Abhinav.name="Abhinav Rai";
        Abhinav.salary=10;
        Abhishek.id=8;
        Abhishek.name ="Abhishek Yadav";
        Abhishek.salary=10;
//        System.out.println(Abhinav.id);
//        System.out.println(Abhinav.name);
        Abhinav.printDetails();
        Abhishek.printDetails();
        int salary = Abhishek.getSalary();
        System.out.println(salary);

    }
}
