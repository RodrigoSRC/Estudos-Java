package academy.devdojo.maratonajava.introducao;

public class _05_EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoBebidaAlcolica = idade >= 18;

        if (isAutorizadoBebidaAlcolica) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        }
        if (!isAutorizadoBebidaAlcolica) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if (true) System.out.println("If sem {}");

        System.out.println("This line is always executed");
    }
}
