import  java.util.Scanner;
public class Find_type_of_Triangle {
    public static void main(String[] args) {
        double A, B, C;
        Scanner input = new Scanner(System.in);
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        double tempA = Math.max(A, Math.max(B, C));
        double tempB = 0;
        double tempC = 0;

        if (tempA == A) {
            tempB = Math.max(B, C);
            tempC = Math.min(B, C);
        }
        if (tempA == B) {
            tempB = Math.max(A, C);
            tempC = Math.min(A, C);
        }
        if (tempA == C) {
            tempB = Math.max(B, A);
            tempC = Math.min(B, A);
        }
        //------------------------------
        if (tempA >= (tempB + tempC)) {
            System.out.print("NAO FORMA TRIANGULOn");

        } else if (tempA * tempA > ((tempB * tempB) + (tempC * tempC))) {
            System.out.print("TRIANGULO OBTUSANGULOn");
        }
        if (tempA * tempA == ((tempB * tempB) + (tempC * tempC))) {
            System.out.print("TRIANGULO RETANGULOn");
        }

        if (tempA * tempA < ((tempB * tempB) + (tempC * tempC))) {
            System.out.print("TRIANGULO ACUTANGULOn");
        }
        if ((tempA == tempB) && (tempA == tempC)) {
            System.out.print("TRIANGULO EQUILATEROn");
        }
        if (((tempA == tempB) && (tempA != tempC)) || ((tempA == tempC) && (tempA != tempB)) || ((tempB == tempC) && (tempB != tempA))) {
            System.out.print("TRIANGULO ISOSCELESn");
        }
    }
}