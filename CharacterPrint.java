import java.util.Scanner;

public class CharacterPrint {
    public static void main(String[] args) {
        System.out.println("Enter your letter:");
        char A;
        char B;
        char C;
        Scanner in=new Scanner(System.in);
        A= in.next().charAt(0);
        B= in.next().charAt(0);
        C= in.next().charAt(0);
        System.out.printf("A = %c,B = %c,C = %c\n",A,B,C);
        System.out.printf("A = %c,B = %c,C = %c\n",B,C,A);
        System.out.printf("A = %c,B = %c,C = %c\n",C,A,B);
    }
}
