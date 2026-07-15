package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 9", 10000);
        Tomate tomate = new Tomate("Tomate", 10);
        Televisao televisao = new Televisao("Televisão 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(televisao);
    }
}