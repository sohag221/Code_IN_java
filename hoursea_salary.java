import  java.util.Scanner;
public class hoursea_salary {
    public static void main(String[] args) {
        int NUMBER, HOURS;
        float AMOUNT, SALARY;
        Scanner input = new Scanner(System.in);
        NUMBER = input.nextInt();
        HOURS = input.nextInt();
        AMOUNT = input.nextFloat();

        SALARY = (AMOUNT*HOURS);
        System.out.println("NUMBER = "+NUMBER);
        System.out.printf("SALARY = %.2f",SALARY);
    }
}
