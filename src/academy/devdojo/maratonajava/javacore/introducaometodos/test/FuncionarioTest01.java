package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Gon Freecss";
        funcionario.idade = 15;
        funcionario.salario = new double[] {1000.00, 2000.00, 3000.00};
        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }

}
