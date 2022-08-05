import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class sorting_bys_ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        int m;
        Scanner input=new Scanner(System.in);
        for (int i=1;i<=5;i++){
        number.add(m=input.nextInt());
        }
        System.out.println(number);
        Collections.sort(number);
        System.out.println("aferet sorting\n"+number);
        Collections.reverse(number);
        System.out.println(number);
    }
}
