package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Mercedes";
        carro1.modelo = "G63";
        carro1.ano = 2022;
        System.out.println("Marca: " + carro1.nome + ", modelo: " + carro1.modelo + ", ano: " + carro1.ano);

        Carro carro2 = new Carro();
        carro2.nome = "Porsche";
        carro2.modelo = "911";
        carro2.ano = 2023;
     //   carro2 = carro1; //trocando a referencia do objeto
        System.out.println("Marca: " + carro2.nome + ", modelo: " + carro2.modelo + ", ano: " + carro2.ano);
    }


}
