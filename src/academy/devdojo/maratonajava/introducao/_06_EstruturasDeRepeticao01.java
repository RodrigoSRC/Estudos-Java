package academy.devdojo.maratonajava.introducao;

public class _06_EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int i = 0;
        while (i < 10) {
            System.out.println("While loop: " + i);
            i++;
        }

        int j = 12;
        do {
            System.out.println("Do while loop: " + j);
            j++;
        } while (j < 10);

        for (int k = 0; k < 10; k++) {
            System.out.println("For loop: " + k);
        }
    }
}
