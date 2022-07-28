import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        System.out.println("Enter your number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        int temp=number;
    /*   while (temp!=0){
            int r=temp%10;
            sum=sum*10+r;
            temp=temp/10;

        }*/
        System.out.println("The reverse number is:"+sum);
        while (temp!=0){
           int r=temp%10;
           sum=sum+r;
           temp=temp/10;

        }
        System.out.println("The sum of endered number:"+sum);
    }
}
