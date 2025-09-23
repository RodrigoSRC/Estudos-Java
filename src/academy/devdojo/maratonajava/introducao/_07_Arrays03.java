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
    }
}
