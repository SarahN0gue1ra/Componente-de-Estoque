package main;

import java.util.List;

import componenteProduto.Produto;
import componenteProduto.ProdutoImpl;
import componenteProduto.RepositorioProduto;
import componenteProduto.RepositorioProdutoMemoria;
import componeteEstoque.Estoque;

public class Main {

    public static void main(String[] args) {
        // Criar um repositório de produtos em memória
        RepositorioProduto repositorioProduto = new RepositorioProdutoMemoria();

        // Criar um objeto Estoque
        Estoque estoque = new Estoque(repositorioProduto);

        // Adicionar alguns produtos ao estoque
        Produto produto1 = new ProdutoImpl("Camisa", "12345", 20.00);
        Produto produto2 = new ProdutoImpl("Calça", "67890", 35.00);
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);

        // Consultar a quantidade de um produto
        int quantidadeProduto1 = estoque.getQuantidadeProduto(produto1);
        System.out.println("Quantidade de " + produto1.getNome() + ": " + quantidadeProduto1);

        // Listar todos os produtos
        List<Produto> produtos = estoque.listarProdutos();
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Código: " + produto.getCodigo() + ", Preço: " + produto.getPreco());
        }

        // Remover um produto do estoque
        estoque.removerProduto(produto2);

        // Verificar se o produto foi removido
        int quantidadeProduto2 = estoque.getQuantidadeProduto(produto2);
        System.out.println("Quantidade de " + produto2.getNome() + " após remoção: " + quantidadeProduto2);
    }
}
