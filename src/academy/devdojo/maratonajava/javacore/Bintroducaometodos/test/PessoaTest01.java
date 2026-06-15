package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

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
