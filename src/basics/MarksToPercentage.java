package basics;

import java.util.Scanner;

public class MarksToPercentage {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1st subject");
        int a = sc.nextInt();
        System.out.println("Enter the marks of 2nd subject");
        int b = sc.nextInt();
        System.out.println("Enter the marks of 3rd subject");
        int c = sc.nextInt();
        System.out.println("Enter the marks of 4th subject");
        int d = sc.nextInt();
        System.out.println("Enter the marks of 5th subject");
        int e = sc.nextInt();
        int Total = a+b+c+d+e;
        System.out.println("Total marks obatined : " +Total);
        float Percentage = (float) Total/5;
        System.out.println("Percentage : "+Percentage + "%");
        sc.close();

    }
}
