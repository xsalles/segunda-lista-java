package src;
import java.util.Arrays;
import java.util.Scanner;

public class exE_pedro {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        a = sc.nextInt();

        System.out.println("Digite o valor de B");
        b = sc.nextInt();

        System.out.println("Digite o valor de C");
        c = sc.nextInt();

        int [] numeros = new int[]{a, b, c};

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));
}}
