package basics;

public class CgpaCalculation {
    public static void main(String[] args) {
        int subject1 = 45;
        int subject2 = 95;
        int subject3 = 48;
        float cgpa = (float)(subject1 + subject2 + subject3) / 30;
        System.out.println("CGPA is : "+cgpa);
    }
}
