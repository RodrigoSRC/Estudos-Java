package academy.devdojo.maratonajava.javacore.kenum.test;

import academy.devdojo.maratonajava.javacore.kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
    }

}
