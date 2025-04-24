package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fulano";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{2000, 1900, 2200};

        funcionario.imprime();
    }
}
