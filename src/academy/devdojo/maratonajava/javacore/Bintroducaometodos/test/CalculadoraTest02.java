package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 10);
        System.out.println("Finalizando o metodo multiplicaDoisNumeros da calculadoraTest01");
        calculadora.divideDoisNumeros(10, 10);
        System.out.println("Finalizando o metodo divideDoisNumeros da calculadoraTest01");
    }
}
