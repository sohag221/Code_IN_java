import java.util.Scanner;

public class array_fill2 {
    public static void main(String[] args) {
        int n[]=new int[1000];
        Scanner input=new Scanner(System.in);
       int a= input.nextInt();
       if (a>=2 && a<=50);
       int count=0;
       for (int j=0;j< n.length;j++){
           if(count<a)
           {  n[j]=count;
           count++;}
           else {
             //  j=count-1;
           count=1;}
       }
       for (int i=0;i<n.length;i++){
           System.out.println("N["+i+"]"+"="+n[i]);

        }
    }
}
