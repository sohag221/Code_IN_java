//import java.lang.reflect.Array;
//import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void setinfo(int Array[]){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<Array.length;i++){
            Array[i]=input.nextInt();
        }
    }

//Bubble sorting;
 public static void Sortings(int Array[]){
    for(int i=0;i<Array.length;i++){
        for(int j=0;j<Array.length-i-1;j++){
            if (Array[j]>Array[j+1]) {
                int temp=Array[j];
               Array[j]=Array[j+1];
                Array[j+1]=temp; 
               
            }
        }
    }
} 
//seceltion sorting;
public static void SecSortig(int Array[]){
   
    for(int i=0;i<Array.length;i++){ 
        int smlst=Array[i];
        for(int j=i+1;j<Array.length;j++){
            if(Array[i]>Array[j]){
                smlst=Array[j]; 
                 int tmem=smlst;
                  smlst=Array[i];
                  Array[i]=tmem;
            }
        }

                
    }
}

public static void display(int Array[]){
    for(int i=0;i<Array.length;i++){

    System.out.print(Array[i]+" ");
 }

}
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int []sohag=new int[s];
        setinfo(sohag);
        Sortings(sohag);
         display(sohag);
         System.out.println();
         SecSortig(sohag);
         display(sohag);
       
    }
}
