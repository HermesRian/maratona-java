package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        int resto = 21 % 7;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        int idade = 22;
        double salario = 2500;

        boolean isDentroDaLei1 = idade >= 30 && salario >= 4612;
        boolean isDentrodaLei2 = idade < 30 && salario >= 2423;

        System.out.println(isDentroDaLei1);
        System.out.println(isDentrodaLei2);

        double saldoContaCorrente = 800;
        double saldoContaPoupanca = 7000;
        double valorPlay5 = 2500;

        boolean isPlay5Compravel = saldoContaPoupanca > valorPlay5 || saldoContaCorrente > valorPlay5;
        System.out.println("isPlay5Compravel? "+isPlay5Compravel);

        double valor1 = 100;
        valor1 += 50;
        System.out.println("Valor1: "+valor1);

        double valor2 = 200;
        valor2 -=100;
        System.out.println("Valor2: "+valor2);

        double valor3 = 300;
        valor3 *= 2;
        System.out.println("Valor3: "+valor3);

        double valor4 = 400;
        valor4 /= 2;
        System.out.println("Valor4: "+valor4);

        int contador = 0;
        while (contador <5){
            contador++;
            System.out.println(contador);
        }
    }
}
