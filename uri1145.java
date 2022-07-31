import java.util.Scanner;
public class uri1145 {
    public static void main(String[] args) {
        int x, y, count =0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        for (int i=1;i<=y;i++){
            count++;
            if (count%x==0){
                System.out.print(i);
                System.out.println();
            }

            else{ System.out.print(i+" ");}

        }
    }

}

//Another solution
//--------------------------------------------------//

  /*  int N =100, X, highest = 0,position = 0;

        for (int i = 1; i <= N; i++) {
                X =input.nextInt();

                if (highest > X) {
                highest = highest;
                position = position;
                }else {
                highest = X;
                position = i;
                }


                }
                System.out.print(highest+"\n"+position+"\n");

                }

                }*/