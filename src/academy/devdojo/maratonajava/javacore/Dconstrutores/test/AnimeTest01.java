package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Monster", "TV", 12, "Ação");
        Anime anime2 = new Anime("Akudama Drive", "TV", 12, "Ação", "Production IG");
        anime.imprime();    
        anime2.imprime();
    }
    
}
