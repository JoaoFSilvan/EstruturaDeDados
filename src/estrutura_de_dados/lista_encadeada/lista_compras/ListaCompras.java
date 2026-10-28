package estrutura_de_dados.lista_encadeada.lista_compras;

import estrutura_de_dados.mapa.ListaEncadeada;

public class ListaCompras {
    public static void main(String[] args) {
        ListaEncadeada<Item> lista = new ListaEncadeada<>();

        //adicionar 7 itens;
        lista.adiciona(new Item("Sal", 10));
        lista.adiciona(new Item("Arroz", 12));
        lista.adiciona(new Item("Cuscuz", 20));
        lista.adiciona(new Item("Sabão", 56));
        lista.adiciona(new Item("Sabonete", 2));
        Item calabresa = new Item("Chá de Boldo", 12);
        lista.adiciona(new Item("Feijão", 15));


        //exibir todos os itens da lista;
        System.out.println(lista);

        //mostrar o item que está em uma posição informada;
        System.out.println(lista.buscaPorPosicao(5));

        //verificar se um determinado produto foi adicionado;
        int num = lista.busca(calabresa);
        if (num >= 0) {
            System.out.println("Produto encontrado");
        }else {
            System.out.println("Não encontrado");
        }

        //contar quantos itens foram cadastrados.
        int total = 0;

        for (int i = 0; i < lista.getTamanho(); i++) {
            total += lista.buscaPorPosicao(i).getQuantidade();
        }

        System.out.println("Total de itens: " + total);
        System.out.println("Total de variedade de itens: " + (lista.getTamanho()+1));
    }
}
