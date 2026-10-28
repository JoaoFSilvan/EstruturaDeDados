package estrutura_de_dados.lista_encadeada.estoque_produtos;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return nome;
    }
}
