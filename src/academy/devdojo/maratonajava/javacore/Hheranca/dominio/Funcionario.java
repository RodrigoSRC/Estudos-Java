package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

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
