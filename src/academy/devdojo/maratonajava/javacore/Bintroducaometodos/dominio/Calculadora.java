package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {

        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println("o resultado de "+num1+ " * "+num2+" é: "+(num1 * num2));
    }

    public int divideDoisNumeros(int num1, int num2) {
      return num1 / num2;
    }
}
