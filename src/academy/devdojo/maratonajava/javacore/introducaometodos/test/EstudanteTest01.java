package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        
        estudante1.nome = "Gon Freecss";
        estudante1.idade = 15;
        estudante1.sexo = 'M';
        estudante2.nome = "Killua Zoldyck";
        estudante2.idade = 15;
        estudante2.sexo = 'M';

        impressora.imprimeEstudante(estudante1);
        impressora.imprimeEstudante(estudante2);
    }
}
