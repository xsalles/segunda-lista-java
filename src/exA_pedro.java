package src;
import java.util.Scanner;

public class exA_pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, r;
        String answer;

        do {
            System.out.println("Digite o valor de A");
            a = sc.nextInt();
    
            System.out.println("Digite o valor de B");
            b = sc.nextInt();
    
            if (a >= b){
                r = a - b;
            } else {
                r = b - a;
            }
    
            System.out.println("O valor da diferença entre A e B é " + r);
            
            System.out.println("Deseja continuar? sim/não");
            answer = sc.next();
        } while(answer.equalsIgnoreCase("sim"));

        
    }
}