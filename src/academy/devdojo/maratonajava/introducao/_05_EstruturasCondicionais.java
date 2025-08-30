package academy.devdojo.maratonajava.introducao;

public class _05_EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoBebidaAlcolica = idade >= 18;

        if (isAutorizadoBebidaAlcolica) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        }
        else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if (true) System.out.println("If sem {}");

        String categoria;
        if(idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } 
        else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);


        double salario = 6000.00;

        String mensagemDoar = "Doarei 500";
        String mensagemNaoDoar = "Não tenho condições de doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        // if(salario > 5000.00) {
        //     resultado = mensagemDoar;
        // } else {
        //     resultado = mensagemNaoDoar;
        // }

        System.out.println(resultado);
    }
}
