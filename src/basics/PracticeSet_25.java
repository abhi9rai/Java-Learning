package basics;

public class PracticeSet_25 {
    public static void main(String[] args) {
//        int n=4;
//        for (int i=n; i>0; i--){
//            for (int j=0;j<i;j++){
//            System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        int n=5;
        int i=1;
        int sum=0;
        while(i<=5){
            System.out.println(2*i);
            sum=sum+(2*i);
            i++;
        }
        System.out.println("Addition is : " + sum);
    }
}
