package basics;
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name +  " have a good day !");
    }
}
