import java.util.Scanner;
public class DateFormate {
    public static void main(String[] args) {
        int d,m,y;
        Scanner input=new Scanner(System.in);
        d=input.nextInt();
        m=input.nextInt();
        y=input.nextInt();

        System.out.println("0"+m+"/"+"0"+d+"/"+y);
        System.out.println(y+"/"+"0"+m+"/"+d);
        System.out.println("0"+d+"/"+"0"+m+"/"+y);
    }
}
