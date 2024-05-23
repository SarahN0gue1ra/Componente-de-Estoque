package componenteProduto;

import java.util.List;

public interface RepositorioProduto {
    void adicionarProduto(Produto produto);
    void removerProduto(Produto produto);
    int getQuantidadeProduto(Produto produto);
    List<Produto> listarProdutos();
}
