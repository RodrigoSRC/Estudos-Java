package academy.devdojo.maratonajava.introducao;

public class _06_EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 números inteiros de um dado valor
        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
