import java.util.Scanner;

public class fibonakki {

    public  static  void fibonakki(int a,int b,int n){
       if (n==0){
           return ;
       }


        int c=a+b;
        System.out.println(c);
        fibonakki(b,c,n-1);
    }



    public static void main(String[] args) {
        int a,b,n;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        n=in.nextInt();
        System.out.println(a);
        System.out.println(b);
        fibonakki(a,b,n);

    }
}
