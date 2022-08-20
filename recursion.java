public class recursion {
  
   public static void recursionAdd(int n){
        if(n==0){
            return;
        }
      
        recursionAdd(n-1);
          System.out.println(n);
    } 
    public static int  recursionFac( int n ){
       
        if (n==1 || n==0 ) {
            return 1;
        }
        int  fac=recursionFac(n-1);
        int factn=n*fac;
        return factn;

     
    }
    public static void main(String[] args) {
        
    recursionAdd(7);
   System.out.println(recursionFac(5));

    }
}
