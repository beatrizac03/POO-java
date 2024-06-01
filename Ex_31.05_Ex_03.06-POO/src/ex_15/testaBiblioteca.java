/* Crie um sistema de gerenciamento de uma biblioteca. Para isso, crie as classes Livro e
Biblioteca. A classe Livro deve ter os atributos titulo, autor e disponivel (um booleano
indicando se o livro está disponível para empréstimo). A classe Biblioteca deve ter um
vetor de objetos Livro. Implemente métodos na classe Biblioteca para:
1. Adicionar um novo livro.
2. Emprestar um livro (marcando-o como indisponível).
3. Devolver um livro (marcando-o como disponível).
4. Listar todos os livros com suas informações.
5. Listar apenas os livros disponíveis.
 */

package ex_15;

import java.util.Scanner;

public class testaBiblioteca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("        BIBLIOTECA CULTURALIVROS         ");
            System.out.println("          1 - Adicionar livros ");
            System.out.println("          2 - Emprestar livros ");
            System.out.println("          3 - Devolver livros ");
            System.out.println("          4 - Listar todos os livros ");
            System.out.println("          5 - Listar apenas livros disponíveis");
            System.out.println("          0 - SAIR ");
            System.out.println("-----------------------------------------------");
            System.out.print("-- Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    Biblioteca.adcLivro();
                    break;
                case 2:
                    Biblioteca.emprestarLivro();
                    break;
                case 3:
                    Biblioteca.devolverLivro();
                    break;
                case 4:
                    Biblioteca.listarLivros();
                    break;
                case 5:
                    Biblioteca.listarLivrosDisponiveis();
                    break;
                default:
                    System.out.println("Finalizado.");
                    break;
            }
        } while(opcao != 0);
    }
}
