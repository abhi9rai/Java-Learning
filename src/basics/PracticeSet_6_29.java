package basics;

public class PracticeSet_6_29 {
    public static void main(String[] args) {
//        Practice Problem 1
        /*float[] arr = new float[5];
        arr[0]=98.5f;
        arr[1]=99.5f;
        arr[2]=96.5f;
        arr[3]=93.5f;
        arr[4]=95.5f;
        float sum=0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Total = " + sum);
        */

//    Practice Problem 2
        /*float[] arr = new float[5];
        arr[0]=98.5f;
        arr[1]=99.5f;
        arr[2]=96.5f;
        arr[3]=93.5f;
        arr[4]=95.5f;
        float num =99.5f;
        boolean isInArray=false;
        for (float element:arr ){
            if (num==element){
                isInArray=true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is in array");
        }
        else{
            System.out.println("Not in array");
        }

//        Practice Problem 3
        float[] arr = new float[5];
        arr[0]=98.5f;
        arr[1]=99.5f;
        arr[2]=96.5f;
        arr[3]=93.5f;
        arr[4]=95.5f;
        float sum=0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Average is = " + sum/arr.length);


//      Practice Problem 4
        int[][] m1 =new int[2][3];
        int[][] m2 =new int[2][3];
        int[][] m3 =new int[2][3];
        m1 [0][0]=1;
        m1 [0][1]=2;
        m1 [0][2]=3;
        m1 [1][0]=4;
        m1 [1][1]=5;
        m1 [1][2]=6;

        m2 [0][0]=2;
        m2 [0][1]=6;
        m2 [0][2]=13;
        m2 [1][0]=3;
        m2 [1][1]=7;
        m2 [1][2]=1;

        m3 [0][0]=0;
        m3 [0][1]=0;
        m3 [0][2]=0;
        m3 [1][0]=0;
        m3 [1][1]=0;
        m3 [1][2]=1;
        for (int i=0;i<m1.length;i++){
            for (int j=0; j<m1[i].length;j++){
                m3[i][j]=m1[i][j]+m2[i][j];
                System.out.print(m3[i][j]+" ");
            }
            System.out.println(" ");
        }
        */

//        Practice Problem 5
        int [] arr={1,2,3,4,5,6};
        int n =Math.floorDiv(arr.length,2);
        for (int i=0;i<n;i++){

        }
    }
}
