import  java.util.Scanner;
public class Consumption {
    public static void main(String[] args) {
        int X;
        float Y,consumption;
        Scanner input=new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextFloat();
        consumption=(X/Y);
        System.out.printf("%.3f km/l",consumption);
    }
}