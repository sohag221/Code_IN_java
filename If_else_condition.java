import  java.util.Scanner;
public class If_else_condition {
    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        if (a < b && b < c && c < d && d < e) {
            System.out.println("C");
        } else if (a > b && b > c && c > d && d > e) {
            System.out.println("D");
        } else {
            System.out.println("N");

        }
    }
}