package academy.devdojo.maratonajava.javacore.kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // public double calcularDesconto(double valor) {
    // return switch (this) {
    // case DEBITO -> valor * 0.1;
    // case CREDITO -> valor * 0.05;
    // };
    // }
    public abstract double calcularDesconto(double valor);
}
