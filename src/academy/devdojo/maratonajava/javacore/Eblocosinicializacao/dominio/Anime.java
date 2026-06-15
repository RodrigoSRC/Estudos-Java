package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

// import java.util.Arrays;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memória pro array
    // 2 - Cada atributo der classe é inicializado com o valor default
    // 3 - Bloco de inicialização de instância é executado quando o objeto é criado.
    // 4 - Construtor executa após o bloco de inicialização

    {
        System.out.println("Dentro do bloco de inicialização");

        // System.out.println(Arrays.toString(episodios));

        // ou pode ser feito assim:

        // for (int episodio : episodios) {
        // System.out.print(episodio + " ");
        // }

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
