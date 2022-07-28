import java.util.Arrays;
import  java.util.Scanner;

public class Sorting_number {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your length!");
        n = input.nextInt();
        int[] sort = new int[n];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = input.nextInt();
        }
        System.out.print("Before sorting: ");
        for (int j = 0; j < sort.length; j++) {
            System.out.print(sort[j]);
            System.out.print("\t");
        }
        Arrays.sort(sort);
        System.out.println();
        System.out.print("After sorting: ");
        for (int j = 0; j < sort.length; j++) {
            System.out.print(sort[j]);
            System.out.print("\t");
        }
    }
}