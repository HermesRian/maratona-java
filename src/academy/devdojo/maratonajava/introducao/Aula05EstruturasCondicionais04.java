package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 35000;
        double totalImposto = 0;
        double salarioDescontado = 0;
        double imposto = 0;
        if(salario <= 34712){
            imposto = 0.097;
            totalImposto = (salario * imposto) ;
            salarioDescontado = (salario - totalImposto);
        } else if (salario > 34712 && salario <= 68507) {
            imposto = 0.3735;
            totalImposto = (salario * imposto) ;
            salarioDescontado = (salario - totalImposto);
        }
        else if (salario > 68507) {
            imposto = 0.495;
            totalImposto = (salario * imposto) ;
            salarioDescontado = (salario - totalImposto);
        }
        System.out.println("Com o salario de: "+salario+" o imposto é de: "+totalImposto+" e o salario restante é: "+salarioDescontado);

    }
}
