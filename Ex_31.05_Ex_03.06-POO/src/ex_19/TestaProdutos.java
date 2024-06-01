/* Crie uma classe Produto com os atributos nome, preco e quantidadeEmEstoque.
Adicione métodos estáticos para calcular o valor total em estoque de um array de
produtos e para encontrar o produto mais caro. */

package ex_19;

import java.util.ArrayList;

public class TestaProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto.adcProdutos(produtos);

        Produto.calcularValorTotalEmEstoque(produtos);

        Produto.encontrarProdutoMaisCaro(produtos);

    }
}
