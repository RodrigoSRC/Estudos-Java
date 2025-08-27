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

    }
}
