package basics;

public class Operators_08 {
    public static void main(String[] args) {
        //Arithmetic Operators & Assignment Operators
        int a = 4;
        int b = 6 + a;
        int c = 6-a;
        int d = 6*a;
        int e = 6%a;
        int f = 6/a;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //Comparison Operators
        System.out.println(b>a);
        System.out.println(a>b);
        System.out.println(a==b);

        //Logical Operators
        System.out.println(4<6 && 4<5);
        System.out.println(4<6 || 5<4);

        //Bitwise Operators
        System.out.println(2&3);
    }
}
