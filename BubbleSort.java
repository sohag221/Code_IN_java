import java.util.Scanner;

public class BubbleSort {
    public static void setinfo(int Array[]){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<Array.length;i++){
            Array[i]=input.nextInt();
        }
    }
    public static void Sortings(int Array[]){
        for(int i=0;i<Array.length-1;i++){
            for(int j=0;j<Array.length-i-1;j++){
                if (Array[j]>Array[j+1]) {
                    int temp=Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]=temp;

                }
            }
        }
    }
    public static void display(int Array[]){
        for(int i=0;i<5;i++){

            System.out.print(Array[i]+" ");
        }

    }
    public static void main(String[] args) {
        int []sohag=new int[5];
        setinfo(sohag);
        Sortings(sohag);
        display(sohag);

    }
}
