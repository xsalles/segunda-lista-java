package src;
import java.util.Scanner;

public class exB_pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, toPositive;
        String answer;

        do {
            System.out.println("Digite o valor de N");
            n = sc.nextInt();
    
            toPositive = n * -1;
    
            if(n < 0){
                System.out.println("O valor de n é " + toPositive);
            } else {
                System.out.println("O valor de n é" + n);
            }

            System.out.println("Deseja continuar? sim/não");
            answer = sc.next();
        } while(answer.equalsIgnoreCase("sim"));
        
    }
}
