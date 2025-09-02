package academy.devdojo.maratonajava.introducao;

public class _06_EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 a 1000000

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int j = 0;
        while (j <= 1000000) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }

        int k = 0;
        do {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        } while (k <= 1000000);
    }
}
