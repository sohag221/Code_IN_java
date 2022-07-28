import  java.util.Scanner;
public class Product_Price {
    public static void main(String[] args) {
        int prod1,number1,prod2,number2;
        float amount1,amount2,pay;
        Scanner input=new Scanner(System.in);

        prod1=input.nextInt();
        prod2=input.nextInt();
        number1=input.nextInt();
        number2=input.nextInt();
        amount1=input.nextFloat();
        amount2=input.nextFloat();

        pay=(number1*amount1)+(number2*amount2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", pay);
    }
}
