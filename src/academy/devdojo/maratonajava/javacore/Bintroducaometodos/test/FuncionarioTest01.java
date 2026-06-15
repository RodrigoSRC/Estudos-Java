package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gon Freecss");
        funcionario.setIdade(15);
        funcionario.setSalario(new double[] {1000.00, 2000.00, 3000.00});
        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
        System.out.println("Média salarial: " + funcionario.getMedia());
    }

}
