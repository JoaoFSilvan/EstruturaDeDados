package estrutura_de_dados.lista_encadeada.catalogo_livro;

import estrutura_de_dados.mapa.ListaEncadeada;

public class Catalagos {
    public static void main(String[] args) {
        ListaEncadeada<Livro> livros = new ListaEncadeada<>();

        // cadastrar 5 livros;
        livros.adiciona(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.adiciona(new Livro("1984", "George Orwell", 1949));
        livros.adiciona(new Livro("O Hobbit", "J. R. R. Tolkien", 1937));
        livros.adiciona(new Livro("A Metamorfose", "Franz Kafka", 1915));
        livros.adiciona(new Livro("O Alienista", "Machado de Assis", 1882));

        // mostrar todos os livros;
        System.out.println(livros);

        // adicionar um novo livro no início da lista;
        livros.adicionaInicio(new Livro("A Revolução dos Bichos", "George Orwell", 1945));

        // adicionar um novo livro no final da lista;
        livros.adiciona(new Livro("O Nome do Vento", "Patrick Rothfuss", 2007));

        // exibir o primeiro e o último livro cadastrados;
        System.out.println(livros.buscaPorPosicao(0));
        System.out.println(livros.buscaPorPosicao(livros.getTamanho() - 1));
    }
}