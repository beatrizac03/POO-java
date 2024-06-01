/* Crie uma classe Produto com os atributos nome e preco. Em seguida, crie um
vetor de objetos Produto para armazenar 10 produtos. Implemente um método
que calcula e imprime a média dos preços dos produtos.
*/

package ex_13;

import java.util.Scanner;

public class testaProduto {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            final int QTDE_PRODUTOS = 10;

            Produto[] vetProdutos = new Produto[QTDE_PRODUTOS];

            System.out.println("CADASTRO DE PRODUTOS");
            System.out.println("");

            int i = 0;
            for(Produto produto : vetProdutos) {
                produto = new Produto();
                System.out.println("PRODUTO " + (i + 1));
                System.out.print("Nome: ");
                produto.setNome(scn.nextLine());
                System.out.print("Preço: R$ ");
                produto.setPreco(scn.nextDouble());

                vetProdutos[i] = produto;
                System.out.println("");

                scn.nextLine();
                i++;
            }

            double somaValoresTotais = 0;
            for(int j = 0; j < QTDE_PRODUTOS; j++) {
                somaValoresTotais += vetProdutos[j].getPreco();
            }

            System.out.println("MÉDIA DOS PREÇOS DOS PRODUTOS: R$" + (somaValoresTotais / QTDE_PRODUTOS));
        }
}
