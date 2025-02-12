package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //imprimir todos os nmrs pares de 0 ate 1.000.000

        int i = 0;
        while (i <= 1000000) {
            int resto = i % 2;
            if (resto == 0) {
                System.out.println(i + " é par.");
            } else {
                System.out.println(i + " é impar.");
            }
            i++;
        }
    }
}
