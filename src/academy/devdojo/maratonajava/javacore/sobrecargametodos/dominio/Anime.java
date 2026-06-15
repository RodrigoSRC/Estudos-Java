package academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;

    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }
}