package ex_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int qtdeEmEstoque;

    public Produto(String nome, double preco, int qtdeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdeEmEstoque = qtdeEmEstoque;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}
    public int getQtdeEmEstoque() {return qtdeEmEstoque;}
    public void setQtdeEmEstoque(int qtdeEmEstoque) {this.qtdeEmEstoque = qtdeEmEstoque;}

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=R$" + preco +
                ", qtdeEmEstoque=" + qtdeEmEstoque +
                '}';
    }

    static int contador = 0;
    public static void adcProdutos(ArrayList<Produto> produtos) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Qtde de produtos a serem cadastrados: ");
        int qtdeAdc = scn.nextInt();
        scn.nextLine();

        for(int i = 0; i < qtdeAdc; i++) {
            System.out.println("PRODUTO " + (contador + 1));
            System.out.print("Nome: ");
            String nome = scn.nextLine();
            System.out.print("Preço: R$ ");
            double preco = scn.nextDouble();
            System.out.print("Qtde em estoque: ");
            int qtdeEmEstoque = scn.nextInt();

            scn.nextLine();

            produtos.add(new Produto(nome, preco, qtdeEmEstoque));
            System.out.println("");
            contador++;
        }
    }

    public static void calcularValorTotalEmEstoque(ArrayList<Produto> produtos) {
        double valorTotalEstoque = 0;

        for(int i = 0; i < produtos.size(); i++) {
            valorTotalEstoque += (produtos.get(i).getPreco() * produtos.get(i).getQtdeEmEstoque());
        }

        System.out.println("VALOR TOTAL EM ESTOQUE: R$ " + valorTotalEstoque);
        System.out.println("");
    }

    public static void encontrarProdutoMaisCaro(ArrayList<Produto> produtos) {
        Produto produtoMaisCaro = produtos.get(0);

        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = produtos.get(i);
            }
        }

        System.out.println("PRODUTO MAIS CARO: " + produtoMaisCaro.toString());

        System.out.println("");
    }


}
