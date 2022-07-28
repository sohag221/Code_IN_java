import  java.util.Scanner;
public class Any_character_possition {
    public static void main(String[] args) {
        char s;
        Scanner input=new Scanner(System.in);
        s=input.next().charAt(0);
        int i, k;
        for(i=0, k=65;i<26;i++,k++) {
            if (s == k) {
                break;}
        }

        System.out.printf("%d\n", ++i);

    }
}
