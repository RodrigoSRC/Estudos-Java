package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Killua Zoldyck", 5000.00);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gon Freecss", 12000.00);
        System.out.println(desenvolvedor);
    }
}
