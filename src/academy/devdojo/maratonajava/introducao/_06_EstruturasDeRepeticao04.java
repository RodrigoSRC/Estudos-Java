package academy.devdojo.maratonajava.introducao;

public class _06_EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // descubra em quantas vezes ele pode ser parcelado
        // condição valor da parcela maior ou igual a mil
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela > 1000) break;
        }
    }
}
