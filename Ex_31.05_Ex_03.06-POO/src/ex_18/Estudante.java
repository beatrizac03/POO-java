package ex_18;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudante {
    private String nome;
    private double nota;

    public Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public double getNota() { return nota; }

    public void setNota(double nota) { this.nota = nota; }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
    static int contador = 0;
    public static void adcEstudantes(ArrayList<Estudante> estudantes){
        Scanner scn = new Scanner(System.in);

        System.out.print("Qtde de estudantes a serem cadastrados: ");
        int qtdeAdc = scn.nextInt();
        scn.nextLine();

        for(int i = 0; i < qtdeAdc; i++) {
            System.out.println("ALUNO " + (contador + 1));
            System.out.print("Nome: ");
            String nome = scn.nextLine();
            System.out.print("Nota: ");
            double nota = scn.nextDouble();

            scn.nextLine();

            estudantes.add(new Estudante(nome, nota));
            System.out.println("");
            contador++;
        }
    }

    public static void listarEstudante(ArrayList<Estudante> estudantes) {
            System.out.println(estudantes.toString());
    }

    public static void calcularMedia(ArrayList<Estudante> estudantes){
        double somaNotas = 0;
        double mediaNotas;

        for(int i = 0; i < estudantes.size(); i++) {
            somaNotas += estudantes.get(i).getNota();
        }
        mediaNotas = somaNotas / estudantes.size();
        System.out.println("MÉDIA DAS NOTAS: " + mediaNotas);
        System.out.println("");
    }
}
