package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o salário: ");
        double salario = scanner.nextDouble();
        double valorPlay5 = 2500;
        String isPlay5Compravel = salario >= valorPlay5 ? "Dá pra comprar!" : "Junta mais um pouco.";
        System.out.println(isPlay5Compravel);
    }
}
