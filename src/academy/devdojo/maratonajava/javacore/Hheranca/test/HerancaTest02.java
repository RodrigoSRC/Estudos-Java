package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM
    // carregar a classe pai (Pessoa).
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM
    // carregar a classe filha (Funcionario).
    // 2 - Alocado espaço em memória para o objeto da classe pai (Pessoa).
    // 3 - Cada atributo de super classe é criado e inicializado com valores default
    // ou o que for passado da super classe
    // 4 - Bloco de inicialização de instância da super classe é executado na ordem
    // que aparece
    // 5 - Construtor da super classe é executado

    // 6 - Alocado espaço em memória para o objeto da classe filha (Funcionario).
    // 7 - Cada atributo de filha é criado e inicializado com valores default ou o
    // que for passado da filha
    // 8 - Bloco de inicialização de instância da filha é executado na ordem que
    // aparece
    // 9 - Construtor da filha é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Eu mesmo");
        funcionario.imprime();
    }
}
