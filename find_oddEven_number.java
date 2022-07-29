import java.util.Scanner;

public class find_oddEven_number {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }


            //find even number!
            //-----------------------------------------//
            n = input.nextInt();
            if (n >= 1 && n <= 100) {
                for (int j = 1; j <= n; j++) {
                    if (j % 2 == 0) {
                        System.out.println(j);
                    }
                }
            }
        }
    }
}