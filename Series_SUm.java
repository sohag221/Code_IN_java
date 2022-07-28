import  java.util.Scanner;
public class Series_SUm {
    public static void main(String[] args) {
        long a,b,sum=0;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        sum=(a+b)*(b-a+1)/2;
        System.out.println(sum);
    }
}
