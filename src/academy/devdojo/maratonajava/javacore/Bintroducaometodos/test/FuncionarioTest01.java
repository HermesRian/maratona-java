package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fulano";
        funcionario.idade = 20;
        funcionario.salario = new double[]{2000, 1900, 2300};


        double media = (funcionario.salario[0] + funcionario.salario[1] + funcionario.salario[2]) / 3;
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("A média salarial é: " + media);
    }
}
