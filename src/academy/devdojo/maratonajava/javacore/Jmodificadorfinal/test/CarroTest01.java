package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("BMW");
        System.out.println(carro.getNome());
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.setNome("Ferrari");
        System.out.println(carro.getNome());
    }
}
