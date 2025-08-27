package academy.devdojo.maratonajava.introducao;

public class _02_TiposPrimitivos {
    public static void main(String[] args) {
    // int: número inteiro
    int idade = 25; // idade de uma pessoa
    System.out.println("Idade: " + idade);

    // double: número decimal de dupla precisão
    double salario = 3500.75; // salário mensal
    System.out.println("Salário: " + salario);

    // float: número decimal de precisão simples (precisa do 'f' no final)
    float altura = 1.80f; // altura em metros
    System.out.println("Altura: " + altura);

    // char: um único caractere
    char genero = 'M'; // gênero: M para masculino, F para feminino
    System.out.println("Gênero: " + genero);

    // byte: número inteiro pequeno (-128 a 127)
    byte nivel = 10; // nível de experiência
    System.out.println("Nível: " + nivel);

    // short: número inteiro curto (-32768 a 32767)
    short anoNascimento = 2000; // ano de nascimento
    System.out.println("Ano de nascimento: " + anoNascimento);

    // long: número inteiro longo (precisa do 'L' no final)
    long populacao = 215000000L; // população do Brasil
    System.out.println("População: " + populacao);

    // boolean: verdadeiro ou falso
    boolean ativo = true; // indica se está ativo
    System.out.println("Está ativo? " + ativo);


    String nome = "João"; // nome de uma pessoa
    System.out.println("Nome: " + nome);
    }
}
