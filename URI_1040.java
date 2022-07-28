import java.util.Scanner;

public class URI_1040 {
    public static void main(String[] args) {

      float n1,n2,n3,n4,n5,avarage;
      Scanner input= new Scanner(System.in);
      n1=input.nextFloat();
        n2=input.nextFloat();
        n3=input.nextFloat();
        n4=input.nextFloat();

        avarage=(n1*2+n2*3+n3*4+n4)/10;
        System.out.printf("Media: %.1f\n",avarage);

        if (avarage>=7.0){
            System.out.println("Aluno aprovado.");
        }
       else if (avarage<5.0){
            System.out.println("Aluno reprovado.");
        }
       else if (avarage>=5.0 && avarage<=6.9) {

            System.out.println("Aluno em exame.");

            n5=input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",n5);
            float MF=( avarage+n5)/2;

     if (MF>=5.0){
         System.out.println("Aluno aprovado.");
     }
     else if ( MF<=4.9){
         System.out.println("Aluno reprovado.");
     }
            System.out.printf("Media final: %.1f\n",MF);

        }
    }
}
