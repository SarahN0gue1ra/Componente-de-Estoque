package componeteEstoque;

import java.util.List;

import componenteProduto.Produto;
import componenteProduto.RepositorioProduto;

public class Estoque {

    private RepositorioProduto repositorioProduto;

    public Estoque(RepositorioProduto repositorioProduto) {
        this.repositorioProduto = repositorioProduto;
    }

    public void adicionarProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        repositorioProduto.adicionarProduto(produto);
    }

    public void removerProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        repositorioProduto.removerProduto(produto);
    }

    public int getQuantidadeProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        return repositorioProduto.getQuantidadeProduto(produto);
    }

    public List<Produto> listarProdutos() {
        return repositorioProduto.listarProdutos();
    }
}
