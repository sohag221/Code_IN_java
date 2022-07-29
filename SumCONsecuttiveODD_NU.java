import java.util.Scanner;

public class SumCONsecuttiveODD_NU {
    public static void main(String[] args) {
        int a,b,sum=0;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
    b=input.nextInt();
        if(a>b) {
            for (int i =b+1;i<a;i++){
                if (i%2!=0){
                    sum=sum+i;
                }
            }
            System.out.println(sum); }


    if(b>a) {
            for (int j =a;j<b;j++){
                if (j%2!=0){
                    sum=sum+j;
                }
            } System.out.println(sum);
        }


    }
}
