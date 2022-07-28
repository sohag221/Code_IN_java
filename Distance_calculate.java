import  java.util.Scanner;
public class Distance_calculate {
    public static void main(String[] args) {
        double x1,y1,x2,y2,Distance;
        Scanner input=new Scanner(System.in);
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextDouble();
        y2=input.nextDouble();
        double m=(x2-x1)*(x2-x1)-(y2-y1)*(y2-y1);
        Distance=Math.sqrt(m);
        System.out.printf("%.4f\n",Distance);
    }
}
