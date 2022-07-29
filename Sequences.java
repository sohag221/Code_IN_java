import java.util.Scanner;

public class Sequences {
    public static void main(String[] args) {

        int n1,i;
        Scanner input=new Scanner(System.in);
       while ((n1=input.nextInt())!=0){

           for ( i=1;i<=n1;i++){
               if (i==n1){
               System.out.print(n1+"\n");
           }
               else {
                   System.out.print(i+" ");
               }

           }
       }
    }
}
