package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        // System.out.println("Salário: " + this.salario);

        if (this.salario == null || this.salario.length == 0) {
            System.out.println("Nenhum salário encontrado");
            return;
        }
        // if (this.salario != null)
            for (double salario : this.salario) {
                System.out.println("Salário: " + salario);
            }
    }

    public void imprimeMediaSalarial(){
        if (this.salario == null || this.salario.length == 0) {
            System.out.println("Nenhum salário encontrado");
            return;
        }
        // double soma = 0;
        // double media = 0;
    // if (this.salario != null)
        for (double salario : this.salario) {
            // soma += salario;
                media += salario;
            }
            media /= this.salario.length;
        
        // double media = soma / this.salario.length;

        System.out.println("Média salarial: " + media);
        System.out.println("----------------");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalario(double[] salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double[] getSalario() {
        return salario;
    }
    public double getMedia() {
        return media;
    }
}
