package estrutura_de_dados.lista_encadeada.catalogo_filme;

import estrutura_de_dados.mapa.ListaEncadeada;

public class Catalogo {
    public static void main(String[] args) {
        ListaEncadeada<Filme> filmes = new ListaEncadeada<>();

        // adicionar 5 filmes;
        filmes.adiciona(new Filme("Carros", "Aventura", 2006));
        filmes.adiciona(new Filme("Toy Story", "Animação", 1995));
        filmes.adiciona(new Filme("O Rei Leão", "Musical", 1994));
        filmes.adiciona(new Filme("Shrek", "Comédia", 2001));
        filmes.adiciona(new Filme("Procurando Nemo", "Aventura", 2003));


        // exibir todos os filmes;
        System.out.println(filmes);

        // adicionar um novo filme em uma posição específica;
        Filme titanic = new Filme("Titanic", "Romance", 1997);
        filmes.adiciona(3, titanic);

        // verificar se um determinado filme está cadastrado;
        int num = filmes.busca(titanic);
        if (num != -1) {
            System.out.println("Filme encontrado");
        } else {
            System.out.println("Não encontrado");
        }

        // remover um filme de uma posição informada;
        filmes.remove(1);

        // exibir a lista após a remoção;
        System.out.println(filmes);

        // limpar completamente a lista;
        filmes.limpa();

        // informar o tamanho da lista após a limpeza;
        System.out.println(filmes.getTamanho());
    }
}