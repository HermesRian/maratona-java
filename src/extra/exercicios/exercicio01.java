package extra.exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int dobro = numero * 2;
        System.out.println("O dobro desse número é: "+dobro);
    }
}
