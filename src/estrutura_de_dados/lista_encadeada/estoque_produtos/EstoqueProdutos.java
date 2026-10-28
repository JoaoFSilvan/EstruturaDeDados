package estrutura_de_dados.lista_encadeada.estoque_produtos;

import estrutura_de_dados.mapa.ListaEncadeada;

public class EstoqueProdutos {
    public static void main(String[] args) {
        ListaEncadeada<Produto> produtos = new ListaEncadeada<>();

        // adicionar 5 produtos;
        produtos.adiciona(new Produto("Arroz", 25.90, 20));
        produtos.adiciona(new Produto("Café", 18.50, 15));
        produtos.adiciona(new Produto("Açúcar", 4.75, 30));
        produtos.adiciona(new Produto("Leite", 5.99, 25));
        produtos.adiciona(new Produto("Limão", 3.50, 40));

        // exibir todos os produtos;
        System.out.println(produtos);

        // mostrar o produto que está em uma determinada posição;
        System.out.println(produtos.buscaPorPosicao(3));

        // adicionar um novo produto em uma posição específica;
        Produto sabao = new Produto("Sabão", 2.99, 50);
        produtos.adiciona(2, sabao);

        // verificar se um produto existe no estoque;
        int num = produtos.busca(sabao);
        if (num != -1) {
            System.out.println("Produto encontrado");
        } else {
            System.out.println("Não encontrado");
        }

        // mostrar o primeiro e o último produto cadastrados;
        System.out.println(produtos.buscaPorPosicao(0));
        System.out.println(produtos.buscaPorPosicao(produtos.getTamanho() - 1));
    }
}