package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // public abstract por padrão
    void load();

    default void checkPermission() {
        System.out.println("Checando permissões");
    };
}
