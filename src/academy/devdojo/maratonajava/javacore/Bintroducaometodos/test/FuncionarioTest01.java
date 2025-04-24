package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Goku";
        funcionario.idade = 30;
        funcionario.salario = 2000;
        funcionario.salario2 = 3000;
        funcionario.salario3 = 4000;

        double media = (funcionario.salario + funcionario.salario2 + funcionario.salario3) / 3;
        System.out.println("A média salarial é: " + media);
    }
}
