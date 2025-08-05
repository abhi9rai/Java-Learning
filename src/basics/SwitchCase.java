package basics;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();

        switch (age){
            case 18:
                System.out.println("Going to be an adult ");
                break;
            case 23:
                System.out.println("Going to get a job");
                break;
            case 60:
                System.out.println("Getting retired");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }

    }
}
