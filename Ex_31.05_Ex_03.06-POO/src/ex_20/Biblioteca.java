package ex_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    static int contador = 1;

    public static void cadastrarLivro(ArrayList<Livro> livros) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Quantidade de livros a cadastrar: ");
        int qtdeAdc = scn.nextInt();
        scn.nextLine();
        System.out.println("");

        for(int i = 0; i < qtdeAdc; i++) {
            System.out.println("LIVRO " + contador);
            System.out.print("Título: ");
            String titulo = scn.nextLine();
            System.out.print("Autor: ");
            String autor = scn.nextLine();
            System.out.print("Qtde disponível: ");
            int qtde = scn.nextInt();
            scn.nextLine();

            livros.add(new Livro(titulo, autor, qtde));
            System.out.println("");

            contador++;
        }

    }

    public static void listarLivros(ArrayList<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro.toString());
        }

        System.out.println("");
    }

    public static void emprestarLivro(ArrayList<Livro> livros) {
        Scanner scn = new Scanner(System.in);

        System.out.println("EMPRÉSTIMO DE LIVRO");
        System.out.print("Título: ");
        String tituloEscolhido = scn.nextLine();

        boolean livroEncontrado = false;

        for(int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(tituloEscolhido)) {
                livroEncontrado = true;
                if(livros.get(i).getQtdeDisponivel() > 0) {
                    livros.get(i).setQtdeDisponivel((livros.get(i).getQtdeDisponivel() - 1));
                    System.out.println("LIVRO " + livros.get(i).getTitulo() + " EMPRESTADO!");
                } else {
                    System.out.println("O LIVRO ESTÁ CADASTRADO, MAS NÃO POSSUI EXEMPLARES NO MOMENTO");
                }
                break;
            }
        }

        if (!livroEncontrado) {
            System.out.println("ESTE LIVRO NÃO ESTÁ CADASTRADO NO SISTEMA.");
        }
        System.out.println("");
    }

    public static void verificarDisponibilidade(ArrayList<Livro> livros) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Título: ");
        String tituloEscolhido = scn.nextLine();

        boolean livroEncontrado = false;

        for(int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(tituloEscolhido)) {
                livroEncontrado = true;
                if(livros.get(i).getQtdeDisponivel() > 0) {
                    System.out.println("LIVRO " + livros.get(i).getTitulo() + " DISPONÍVEL!");
                    System.out.println("TÍTULO: " + livros.get(i).getTitulo());
                    System.out.println("Qtde disponível: " + livros.get(i).getQtdeDisponivel());
                } else {
                    System.out.println("O LIVRO ESTÁ CADASTRADO, MAS NÃO POSSUI EXEMPLARES NO MOMENTO");
                }
                break;
            }
        }

        if (!livroEncontrado) {
            System.out.println("ESTE LIVRO NÃO ESTÁ CADASTRADO NO SISTEMA.");
        }

        System.out.println("");
    }
}
