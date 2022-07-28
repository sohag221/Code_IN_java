import java.util.Scanner;
public class AddMultiple {

    public static void main(String[] args) {

        //Add
        int A,B,X;
        Scanner input=new Scanner(System.in);
        A=input.nextInt();
        B=input.nextInt();
        X=A+B;
        System.out.println("X = "+X);

        //Multiple;
        int a,b,PROD;
        a=input.nextInt();
        b=input.nextInt();
        PROD=a*b;
        System.out.println("PROD = "+PROD);
    }
}
