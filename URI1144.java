import java.util.Scanner;

public class URI1144 {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        for (int i=1;i<=a;i++){
            System.out.print(i+" ");
            System.out.print(i*i+" ");
            System.out.print(i*i*i+" ");
            System.out.println();
            System.out.print(i+" ");
            System.out.print(i*i+1+" ");
            System.out.print(i*i*i+1+" ");
            System.out.println();
        }

        //Another solution;
        //----------------------------------------//



       /* int N;
        //Scanner input =new Scanner(System.in);
        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = i, k = (j* j), l = (j*j * j);j == i ;j++) {
                System.out.print(j+" "+k+" "+l+"\n");
                System.out.print(j+" "+(k+1)+" "+(l+1)+"\n");
            }
        }
*/
    }

}

