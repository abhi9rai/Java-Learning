package basics;
import java.util.Scanner;

public class TakingInput_05 {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum of these numbers is : ");
        System.out.println(sum);
    }

}
