package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 18;

        if (idade < 15){
            System.out.println("Infantil.");
        }
        else if (idade >= 15 && idade < 18) {
            System.out.println("Juvenil.");
        }
        else if (idade >=18){
            System.out.println("Adulto.");
        }
    }
}
