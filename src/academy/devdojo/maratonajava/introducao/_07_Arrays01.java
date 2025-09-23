package academy.devdojo.maratonajava.introducao;

public class _07_Arrays01 {
    public static void main(String[] args) {
        int idade01 = 15;
        int idade02 = 20;
        int idade03 = 21;

        int[] idades = new int[3];
        idades[0] = idade01;
        idades[1] = idade02;
        idades[2] = idade03;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
