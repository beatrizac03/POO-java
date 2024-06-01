/* Crie uma classe Estudante com os atributos nome e nota. Adicione um método
estático para calcular a média das notas de um array de estudantes. */

package ex_18;

import java.util.ArrayList;

public class TestaEstudante {
    public static void main(String[] args) {
        ArrayList<Estudante> estudantes = new ArrayList<>();

        Estudante.adcEstudantes(estudantes);

        Estudante.calcularMedia(estudantes);

        Estudante.listarEstudante(estudantes);
    }
}
