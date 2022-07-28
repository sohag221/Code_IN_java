import  java.util.Scanner;
public class Avarage_float_number {
    public static void main(String[] args) {
        double a,b;
        Scanner input=new Scanner(System.in);
        a=input.nextDouble();
        b=input. nextDouble();
        double M=(a+b)/2;
        System.out.printf("MEDIA = %.5f",M);
    }
}
