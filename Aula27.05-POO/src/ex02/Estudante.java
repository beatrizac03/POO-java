package ex02;

import java.util.ArrayList;

public class Estudante {
    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }

    private String nome;
    private double nota;

    public Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public static void calculaMedia(ArrayList<Estudante> estudantes) {
        for()
    }

}
