package academy.devdojo.maratonajava.introducao;

public class _07_Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Rodrigo";
        nomes[1] = "Maria";
        nomes[2] = "João";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[4];

        int[] numeros = new int[3];
        int[] numeros2 = { 1, 2, 3, 4, 5 };
        int[] numeros3 = new int[] { 5, 4, 3, 2, 1 };

        // for (int i = 0; i < numeros2.length; i++) {
        // System.out.println(numeros2[i]);
        // }

        for (int num : numeros3) {
            System.out.println(num);
        }
    }
}
