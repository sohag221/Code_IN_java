public class recursion {
    int fact(int number){
        if (number==1 || number==0){
            return 1;
        }
        else {
            return number*fact(number-1);
        }
    }
    public static void main(String[] args) {
        recursion sohag=new recursion();
        sohag.fact(5);
    }

}
