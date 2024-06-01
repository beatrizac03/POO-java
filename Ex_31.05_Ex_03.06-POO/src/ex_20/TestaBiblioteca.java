package ex_20;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaBiblioteca {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        Scanner scn = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("           SISTEMA BIBLIOTECA        ");
            System.out.println("           1 - CADASTRAR LIVROS");
            System.out.println("           2 - EMPRESTAR LIVRO");
            System.out.println("           3 - VERIFICAR DISPONIBILIDADE DE LIVRO");
            System.out.println("           4 - LISTAR TODOS OS LIVROS");
            System.out.println("           0 - SAIR");
            System.out.print("--- Opção: ");
            opcao = scn.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    Biblioteca.cadastrarLivro(livros);
                    break;
                case 2:
                    Biblioteca.emprestarLivro(livros);
                    break;
                case 3:
                    Biblioteca.verificarDisponibilidade(livros);
                    break;
                case 4:
                    Biblioteca.listarLivros(livros);
                    break;
            }

        } while(opcao != 0);
    }
}
