package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de instância de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de instância de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioDePagamento() {
        // System.out.println("Relatório de pagamento do funcionário: " +
        // this.getNome());
        System.out.println("Relatório de pagamento do funcionário: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
