package basics;
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Kilometers to convert : ");
        double a = sc.nextInt();
        double b = (a * 0.621371);
        System.out.println("In miles = " + b);

    }
}
