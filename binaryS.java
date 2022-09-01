import java.util.Scanner;

public class binaryS{
    public  static int   binaryS(int []ar,int a) {
        int high = ar.length - 1;
        int low = 0;
        
        while (low <= high) {
            int mid = (high + low) / 2;
            if (ar[mid] == a) {
                System.out.println("founded!");
                return mid;
            } else if (a < ar[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    } 


    public static int linearS(int []a,int b){

        for(int i=0;i<a.length;i++){
            if (a[i]==b) {
                System.out.println("founded!");
            }
            
        }


       return -1;
    } 
        public static void main (String[]args){
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
            System.out.println("Enter your demandable value!");
            int k;
            Scanner input = new Scanner(System.in);
            k = input.nextInt();
           binaryS(array, k);
            linearS(array, k);
        }
    }

