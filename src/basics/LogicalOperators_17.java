package basics;

public class LogicalOperators_17 {
    public static void main(String[] args) {
        boolean a =true;
        boolean b =false;
        System.out.println("For Logical AND...");
        if (a && b ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println("For Logical OR...");
        if (a || b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
