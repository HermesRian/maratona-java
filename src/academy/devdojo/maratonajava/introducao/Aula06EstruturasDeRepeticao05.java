package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorCarro = 40000;
        for (int qtParcelas = (int) valorCarro; qtParcelas >= 1; qtParcelas--) {
            double valorParcela = valorCarro / qtParcelas;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(qtParcelas + "a parcela: "+valorParcela);

        }
    }
}
