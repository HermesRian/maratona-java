package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Mercedes";
        carro1.modelo = "G63";
        carro1.ano = 2022;

        System.out.println("Marca: "+ carro1.nome+", modelo: "+ carro1.modelo+", ano: "+ carro1.ano);
    }


}
