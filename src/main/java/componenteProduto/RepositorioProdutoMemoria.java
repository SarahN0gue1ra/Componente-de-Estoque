package componenteProduto;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProdutoMemoria implements RepositorioProduto {
    private List<Produto> produtos;

    public RepositorioProdutoMemoria() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public int getQuantidadeProduto(Produto produto) {
        int count = 0;
        for (Produto p : produtos) {
            if (p.equals(produto)) {
                count++;
            }
        }
        return count;
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<Produto>(produtos);
    }
}

