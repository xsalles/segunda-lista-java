package src;
import java.util.Scanner;

public class exC_pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, ne, md1, md2;
        String answer;

        
          System.out.println("Digite o valor da nota do primeiro bimestre");
          n1 = sc.nextDouble();

          System.out.println("Digite o valor da nota do segundo bimestre");
          n2 = sc.nextDouble();

          System.out.println("Digite o valor da nota do terceiro bimestre");
          n3 = sc.nextDouble();

          System.out.println("Digite o valor da nota do quarto bimestre");
          n4 = sc.nextDouble();

          md1 = (n1 + n2 + n3 + n4) / 4;

         if(md1 >= 7){
            System.out.println("Está aprovado com a média anual de " + md1);
         } else {
            System.out.println("Digite o valor da nota de exame final");
            ne = sc.nextDouble();

            md2 = (n1 + n2 + n3 + n4 + ne) / 5;

            if (md2 >= 5){
                System.out.println("Aprovado com o exame final com nota final de " + md2);
            } else {
                System.out.println("Reprovado com nota final de " + md2);
            }
            
         }
    }
}
