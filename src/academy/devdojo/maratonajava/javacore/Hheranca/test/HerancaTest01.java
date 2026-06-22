package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Flores");
        endereco.setCep("1234567890");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setCpf("1234567890");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1000.00);
        funcionario.imprime();
    }
}
