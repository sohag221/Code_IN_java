import  java.util.Scanner;
public class Salary_Increase {
    public static void main(String[] args) {
        double s;
        Scanner input=new Scanner(System.in);
        s=input.nextDouble();
        if (s>=0 && s<=400.00){

            double add=(15*s/100);
            double salary=s+add;
            System.out.printf("Novo salario: %.2f\n",salary);
            System.out.printf("Reajuste ganho: %.2f\n",add);
            System.out.println("Em percentual: 15 %");
        } else if (s>=400.01 && s<=800.00){

            double add=(12*s/100);
            double salary=s+add;
            System.out.printf("Novo salario: %.2f\n",salary);
            System.out.printf("Reajuste ganho: %.2f\n",add);
            System.out.println("Em percentual: 12 %");
        }
        else if   (s>=800.0 && s<=1200.00){

            double add=(10*s/100);
            double salary=s+add;
            System.out.printf("Novo salario: %.2f\n",salary);
            System.out.printf("Reajuste ganho: %.2f\n",add);
            System.out.println("Em percentual: 10 %");
        }
        else if   (s>=1200.01  && s<=2000.00){

            double add=(7*s/100);
            double salary=s+add;
            System.out.printf("Novo salario: %.2f\n",salary);
            System.out.printf("Reajuste ganho: %.2f\n",add);
            System.out.println("Em percentual: 7 %");
        }

        else if(s>2000.00){
            double add=(4*s/100);
            double salary=s+add;
            System.out.printf("Novo salario: %.2f\n",salary);
            System.out.printf("Reajuste ganho: %.2f\n",add);
            System.out.println("Em percentual: 4 %");
        }
    }
}
