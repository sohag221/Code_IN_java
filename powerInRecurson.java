import java.util.Scanner;

public class powerInRecurson {

    public  static  int  powRE(int a,int n){
        if (n==0){
            return 1;
        }
        if (a==0){
            return  0;
        }
        int apw=powRE(a, n-1);
        int apow=a*apw;
        return apow;
    }

    public static void main(String[] args) {
        int a,n;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        n=input.nextInt();
        int ans=powRE(a,n);
        System.out.println(ans);

    }
}
