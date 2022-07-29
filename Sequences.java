import java.util.Scanner;

public class Sequences {
    public static void main(String[] args) {

        int n,b=1;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        if (n==0){
            System.exit(0);
        }
else {
            System.out.print(b);
    for (int i=2;i<=n;i++){

        System.out.print(" "+i);
    }System.out.print("\n");
        }

    }
}
