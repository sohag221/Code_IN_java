import java.util.Scanner;

public class uri1397 {
    public static void main(String[] args) {
        float a,b,c;
        double s,peram,o;
        Scanner input=new Scanner(System.in);
        a=input.nextFloat();
        b=input.nextFloat();
        c=input.nextFloat();
        if( a+b>c && b+c>a && c+a>b){
            s=(a+b+c)/2;
            double x=s*(s-a)*(s-b)*(s-c);
            peram=  Math.sqrt(x);
            System.out.printf("Area = %.1f",peram);
        }
        else {
            o = a + b + c;
            System.out.printf("perimetro = %.1f",o);
        }

    }



}
