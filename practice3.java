import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc=new Scanner(System.in);
        int n;
        int fact=1;
        n=sc.nextInt();
      for (int i=n;i>1;i--){
          fact=fact*i;

        }
        System.out.println(fact);

      method_value ob=new method_value();
      int result=ob.sqr(5);
        System.out.println("the result is"+result);

    }
}
