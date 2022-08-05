import java.util.Scanner;

public class array_fill4 {
    public static void main(String[] args) {
        int i,j=0,k=0,l,m,n;
        int []E=new int[5];
        int []O=new int[5];
        Scanner input=new Scanner(System.in);
        for(i = 0;i < 15;i++){
           n=input.nextInt();
            if(n%2==0){
                E[j]=n;
                j++;
                if(j==5){
                    for(l = 0;l < 5;l++){
                 System.out.printf("par[%d] = %d\n",l,E[l]);
                        E[l]=0;
                        j=0;
                    }
                }
            }
            else {
                O[k]=n;
                k++;
                if(k==5){
                    for(l = 0;l < 5;l++){
               System.out.  printf("impar[%d] = %d\n",l,O[l]);
                        O[l]=0;
                        k=0;
                    }
                }
            }
        }
        for(i = 0;i < 5;i++){
            if(O[i]==0)break;
          System.out. printf("impar[%d] = %d\n",i,O[i]);
        }
        for(i = 0;i < 5;i++){
            if(E[i]==0)break;
          System.out.  printf("par[%d] = %d\n",i,E[i]);
        }

    }}


