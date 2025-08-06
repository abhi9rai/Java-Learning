package basics;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;}
            }

            for (int a = 0; a <= 5; a++) {
                System.out.println(a);
                if (a == 2) {
                    continue;
                }System.out.println("Java is great");

        }
    }
}