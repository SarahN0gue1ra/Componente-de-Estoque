package componenteProduto;

public class ProdutoImpl implements Produto {
    private String nome;
    private String codigo;
    private double preco;

    public ProdutoImpl(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }
}
