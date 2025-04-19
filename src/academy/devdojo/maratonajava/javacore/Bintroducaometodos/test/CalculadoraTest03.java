package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       // calculadora.divideDoisNumeros(10, 2);
        System.out.println("o resultado da divisão é: "+calculadora.divideDoisNumeros(10, 2));
    }
}
