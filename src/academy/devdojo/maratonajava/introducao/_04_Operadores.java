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

        // = += -= *= /= %=
    // Operações com o operador de atribuição
    double bonus = 1800;           // Inicializa a variável bonus com 1800
    bonus += 200;                  // Soma 200 ao valor atual de bonus (bonus = bonus + 200)
    System.out.println("bonus += 200: " + bonus);
    bonus -= 100;                  // Subtrai 100 do valor atual de bonus (bonus = bonus - 100)
    System.out.println("bonus -= 100: " + bonus);
    bonus *= 2;                    // Multiplica o valor atual de bonus por 2 (bonus = bonus * 2)
    System.out.println("bonus *= 2: " + bonus);
    bonus /= 4;                    // Divide o valor atual de bonus por 4 (bonus = bonus / 4)
    System.out.println("bonus /= 4: " + bonus);
    bonus %= 3;                    // Calcula o resto da divisão de bonus por 3 (bonus = bonus % 3)
    System.out.println("bonus %= 3: " + bonus);

    // Operações de incremento e decremento
    int contador = 0;              // Inicializa a variável contador com 0
    contador += 1;                 // Soma 1 ao contador (contador = contador + 1)
    contador++;                    // Incrementa o contador em 1 (pós-incremento)
    contador--;                    // Decrementa o contador em 1 (pós-decremento)
    ++contador;                    // Incrementa o contador em 1 (pré-incremento)
    --contador;                    // Decrementa o contador em 1 (pré-decremento)
    System.out.println(contador);  // Exibe o valor final de contador

    }
}
