package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 40000;

        for (int qtParcelas = 1; qtParcelas <= valorCarro; qtParcelas++) {
            double valorParcela = valorCarro / qtParcelas;
            if (valorParcela <= 1000) {
                break;
            }
            System.out.println(qtParcelas + "a parcela: "+valorParcela);

        }
    }
}
