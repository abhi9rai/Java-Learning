package basics;
import java.util.Scanner;

public class ElseIf_18 {
    public static void main(String[] args) {
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();
        if (age>56){
            System.out.println("Experienced");
        }
        else if (age>46){
            System.out.println("Semi-Experienced");
        }
        else if (age>36) {
            System.out.println("Semi-semi-Experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
    }
}
