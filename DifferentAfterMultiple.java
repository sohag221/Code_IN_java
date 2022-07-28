import  java.util.Scanner;
public class DifferentAfterMultiple {
    public static void main(String[] args) {
        int a,b,c,d,DIFERENCA;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();

        DIFERENCA=(a*b)-(c*d);
        System.out.println("DIFERENCA = "+DIFERENCA);
    }
}
