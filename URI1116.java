import java.util.Scanner;

public class URI1116 {
    public static void main(String[] args) {
        int n,x,y;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for (int i=1;i<=n;i++){
            x= input.nextInt();
            y= input.nextInt();
          if (y==0){
              System.out.println("divisao impossivel");
          }
 else {
  float r=(float) x/y;
              System.out.printf("%.1f\n",r);
          }
        }
    }
}
