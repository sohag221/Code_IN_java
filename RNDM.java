import java.util.Random;
import java.util.Scanner;

public class RNDM {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number:");
       //n=);
        System.out.println("your entered number is "+input.nextInt());
      int resut=random.nextInt(10);
        System.out.println("your random number is "+resut);

    }
}