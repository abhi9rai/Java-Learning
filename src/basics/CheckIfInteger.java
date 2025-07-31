package basics;
import java.util.Scanner;

public class CheckIfInteger {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner (System.in);
        System.out.println(sc.hasNextInt());

    }
}
