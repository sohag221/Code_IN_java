import java.util.Scanner;

public class find_highiest_and_possition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,x,mi=0,posi=0;
        n=input.nextInt();
        for (int i=1;i<=n;i++){
            x=input.nextInt();
            if ( mi>x) {
                mi=x;
                posi=i;
            }
        else   if (i==1){
             mi=x;
             posi=1;
          }
        }
        System.out.println(posi);
    }
}