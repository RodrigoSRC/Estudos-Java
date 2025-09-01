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



        byte dia = 5;
        // char, int byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Dia inválido");
                break;
        }


        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;

            case 'F':
                System.out.println("Feminino");
                break;

            default:
                System.out.println("Só existem 2 gêneros e só Cristo salva");
                break;
        }



        byte day = 1;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
                
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");
                break;

            default:
                System.out.println("Esse dia nem existe kkkkkkkkkkkk");
                break;
        }

    }
}
