package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        int dia = 1;

        switch (dia){
            case 1:
                System.out.println("Fim de semana.");
                break;
            case 2:
                System.out.println("Dia útil.");
                break;
            case 3:
                System.out.println("Dia útil.");
                break;
            case 4:
                System.out.println("Dia útil.");
                break;
            case 5:
                System.out.println("Dia útil.");
                break;
            case 6:
                System.out.println("Dia útil.");
                break;
            case 7:
                System.out.println("Fim de semana.");
                break;
            default:
                System.out.println("Dia invalido: "+dia);
                break;
        }
    }
}
