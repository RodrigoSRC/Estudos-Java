package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // public static final por padrão
    int MAX_DATA_SIZE = 10;

    // public abstract por padrão
    void load();

    default void checkPermission() {
        System.out.println("Checando permissões");
    };

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do static method: " + MAX_DATA_SIZE);
    }
}
