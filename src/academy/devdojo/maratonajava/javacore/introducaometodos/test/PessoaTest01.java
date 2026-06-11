package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // pessoa.nome = "Gon Freecss";
        // pessoa.idade = 15;
        pessoa.setNome("Gon Freecss");
        pessoa.setIdade(15);
        pessoa.imprime();
    }
}
