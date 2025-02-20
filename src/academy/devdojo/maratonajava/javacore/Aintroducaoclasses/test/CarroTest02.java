package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro2 = new Carro();
        carro2.nome = "Porsche";
        carro2.modelo = "911";
        carro2.ano = 2023;

        System.out.println("Marca: "+ carro2.nome+", modelo: "+ carro2.modelo+", ano: "+ carro2.ano);
    }
}
