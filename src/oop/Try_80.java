package oop;

public class Try_80 {
    public static void main(String[] args) {
        int a=600;
        int b=0;

//        Without Try

//        int c=a/b;
//        System.out.println("The result is : " +c);

//        With Try:

        try{
            int c=a/b;
        } catch (RuntimeException e) {

            System.out.println("We failed to divide. Reason ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
