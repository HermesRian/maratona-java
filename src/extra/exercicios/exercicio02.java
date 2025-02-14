package extra.exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        // dado um input n, faça um triangulo de tamanho n

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = scanner.nextInt();
     //   String asterisco = "*";
        for (int i = 1; i <= n ; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
