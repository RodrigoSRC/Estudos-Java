package academy.devdojo.maratonajava.javacore.introducaoclasses.test;''

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Gol bolinha, o mais sinistro de campo grande"
        carro.modelo = "Pra impressionar as 9nha"
        carro.ano = 2010;

        carro2.nome = "Chevette turbinado"
        carro2.modelo = "Drifiteiro da área"
        carro2.ano = 1985;

        System.out.println("\nCarro1");
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);

        System.out.println("\nCarro2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
