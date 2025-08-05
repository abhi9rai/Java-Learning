package basics;
import java.util.Scanner;

public class PracticeSet_19 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the subject 1 marks");
//        int sub1=sc.nextInt();
//        System.out.println("Enter the subject 2 marks");
//        int sub2=sc.nextInt();
//        System.out.println("Enter the subject 3 marks");
//        int sub3=sc.nextInt();
//        float total=sub1+sub2+sub3;
//        float percentage =(total/300)*100;
//
//        if(percentage>40 && sub1>33){
//            System.out.println("Pass");
//        }
//        else if (percentage>40 && sub2>33){
//            System.out.println("Pass");
//        }
//        else if (percentage>40 && sub3>33){
//            System.out.println("Pass");
//        }
//        else
//            System.out.println("Fail");
//        System.out.println(percentage + " % is obtained");


        Scanner sc = new Scanner (System.in);
        float tax=0;
        System.out.println("Enter your Income in lakh");
        float income=sc.nextFloat();

        if (income<=2.5f){
            System.out.println("NO TAX");
        }

        else if(2.5<income && income<=5.0){
            tax = tax + 0.05f * (income-2.5f);
            System.out.println("Your tax amount is "+tax);
        }
        else if(5.0<income && income<=10.0){
            tax= tax + 0.05f *(5.0f - 2.5f);
            tax= tax + 0.2f *(income - 5.0f);

            System.out.println("Your tax amount is "+tax);
        }
        else if(10.0<income){
            tax= tax + 0.05f *(5.0f - 2.5f);
            tax= tax + 0.20f *(10.0f - 5.0f);
            tax= tax + 0.30f *(income - 10.0f);
            System.out.println("Your tax amount is "+tax);
        }
    }
}
