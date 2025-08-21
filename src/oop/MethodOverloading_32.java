package oop;

public class MethodOverloading_32 {
    static void foo(){
        System.out.println("Good Morning bro !!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=98;
    }
    static void tellJoke() {
        System.out.println("Why don’t programmers like nature? \n" +
                "Because it has too many bugs!");
    }

    public static void main(String[] args) {
//        tellJoke();
//        int[] marks =new int[6];
//        marks[0]=52;
//        marks[1]=73;
//        marks[2]=77;
//        marks[3]=89;
//        marks[4]=98;
//        marks[5]=94;
//        Case 1 : Changing the integer
//        int x=45;
//        change(x);
//        System.out.println(x);
//        Case 2 : Changing the array
//        change2(marks);
//        System.out.println(marks[0]);

//        Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);



    }
}
