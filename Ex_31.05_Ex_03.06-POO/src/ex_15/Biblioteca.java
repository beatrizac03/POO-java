package ex_15;

import java.util.Scanner;

public class Biblioteca {
    static final int CAPACIDADE = 100;
    static int qtdeLivros = 0;
    static Livro[] vetLivros = new Livro[CAPACIDADE];

    public static void adcLivro() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Qtde de livros a adicionar: ");
        int qtdeAdc = scn.nextInt();
        scn.nextLine();

        for(int i = 0; i < qtdeAdc; i++) {
            if(qtdeLivros < CAPACIDADE) {
                System.out.println("LIVRO " + (i + 1));
                System.out.print("Título: ");
                String titulo = scn.nextLine();
                System.out.print("Autor: ");
                String autor = scn.nextLine();
                System.out.print("Disponível (true ou false): ");
                boolean disponivel = scn.nextBoolean();
                scn.nextLine();

                vetLivros[qtdeLivros] = new Livro(titulo, autor, disponivel);
                System.out.println("");
                qtdeLivros++;
            } else {
                System.out.println("Não é possível adicionar mais livros. Capacidade máxima atingida.");
            }

        }
    }

    public static void emprestarLivro() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Título a ser emprestado: ");
        String livroEmprestimo = scn.nextLine();

        for(int i = 0; i < qtdeLivros; i++) {
            if(vetLivros[i].getTitulo().equalsIgnoreCase(livroEmprestimo)) {
                vetLivros[i].setDisponivel(false);
                System.out.println("Livro " + vetLivros[i].getTitulo() + " Emprestado!");
            }
        }
    }

    public static void devolverLivro() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Título a ser devolvido: ");
        String livroDevolvido = scn.nextLine();

        for(int i = 0; i < qtdeLivros; i++) {
            if(vetLivros[i].getTitulo().equalsIgnoreCase(livroDevolvido)) {
                vetLivros[i].setDisponivel(true);
                System.out.println("Livro " + vetLivros[i].getTitulo() + " Devolvido!");
            }
        }
    }

    public static void listarLivros() {
        System.out.println("");
        System.out.println("LISTAGEM DE LIVROS");
        for(int i = 0; i < qtdeLivros; i++) {
            System.out.println(vetLivros[i].toString());
        }
        System.out.println("");
    }

    public static void listarLivrosDisponiveis() {
        System.out.println("");
        System.out.println("LISTA DE LIVROS DISPONÍVEIS");
        for(int i = 0; i < qtdeLivros; i++) {
            if(vetLivros[i].isDisponivel()) {
                System.out.println(vetLivros[i].toString());
            }
        }
        System.out.println("");
    }

}
