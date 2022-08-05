import java.util.Scanner;

public class array_exchange {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        int[] N = new int[20];
        for (int i=19;i >=0;i--){
            N[i]=input.nextInt();
        }
for (int j=0;j< N.length;j++){
    System.out.println("N["+j+"]"+"="+N[j]);
}

        }
    }

