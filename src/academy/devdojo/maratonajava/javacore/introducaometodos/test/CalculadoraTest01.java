package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando o metodo somaDoisNumeros da calculadoraTest01");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando o metodo subtraiDoisNumeros da calculadoraTest01");
        calculadora.multiplicaDoisNumeros(10, 10);
        System.out.println("Finalizando o metodo multiplicaDoisNumeros da calculadoraTest01");
        calculadora.divideDoisNumeros(10, 10);
        System.out.println("Finalizando o metodo divideDoisNumeros da calculadoraTest01");
    }
}
