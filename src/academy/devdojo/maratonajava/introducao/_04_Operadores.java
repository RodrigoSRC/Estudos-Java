package academy.devdojo.maratonajava.introducao;

public class _04_Operadores {
    public static void main(String[] args) {

        // + - * /
        int numero1 = 10;
        double numero2 = 20;
        System.out.println(numero1 / numero2);

        // %
        int restoPar = 20 % 2;
        System.out.println(restoPar);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20.0;
        boolean isDezDiferenteDeVinte = 10 != 20.0;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte "+isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte "+isDezDiferenteDeVinte);

        // && (AND), || (OR), ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation5 = 5000F;

        boolean isPlaystation5Compravel = valorTotalContaCorrente + valorTotalContaPoupanca > valorPlaystation5 || valorTotalContaPoupanca > valorPlaystation5;
        System.out.println("isPlaystation5Compravel "+isPlaystation5Compravel);

    }
}
