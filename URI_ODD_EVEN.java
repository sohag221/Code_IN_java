import java.util.Scanner;

public class URI_ODD_EVEN {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n < 10000) {
            for (int i = 1; i <=n; i++) {
                int x = input.nextInt();


                if (x > -10000000 && x < 10000000) {
                    if (x == 0) {
                        System.out.println("NULL");
                    }
                    if (x > 0) {
                        if (x % 2 == 0) {
                            System.out.println("EVEN POSITIVE");
                        } else System.out.println("ODD POSITIVE");
                    }
                    if (x < 0) {
                        if (x % 2 == 0) {
                            System.out.println("EVEN NEGATIVE");
                        } else System.out.println("ODD NEGATIVE");

                    }
                }
            }
        }

    }
}