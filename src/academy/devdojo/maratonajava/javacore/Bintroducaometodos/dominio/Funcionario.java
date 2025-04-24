package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) {
            System.out.println("Salario: null");
            return;
        }
        int i = 0;
        for (double salario : this.salarios) {
            System.out.println((i + 1) + "o Salario: " + salario);
            i++;
        }
        calculaMediaSalario();
    }

    public void calculaMediaSalario() {
        if (salarios == null) {
            System.out.println("Salario: null");
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media: " + media);
    }
}
