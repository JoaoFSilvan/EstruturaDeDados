package estrutura_de_dados.lista_encadeada.playlist;

import estrutura_de_dados.mapa.ListaEncadeada;

public class PlayList {
    public static void main(String[] args) {
        ListaEncadeada<Musica> musicas = new ListaEncadeada<>();

        //adicionar 6 músicas
        musicas.adiciona(new Musica("Gimme That", "Chris Brown"));
        musicas.adiciona(new Musica("Never Say Never", "Justin Bieber"));
    musicas.adiciona(new Musica("The Reason","Hoobastank"));
        musicas.adiciona(new Musica("Let it Happen", "Tame Impala"));
        musicas.adiciona(new Musica("My Immortal", "Evanescence"));

        Musica Chicago = new Musica("Chicago", "Michael Jackson");
        musicas.adiciona(Chicago);

        //exibir a playlist completa;
        System.out.println(musicas);

        //verificar se uma música específica está na lista;
        int num = musicas.busca(Chicago);
        if (num >= 0) {
            System.out.println("Música encontrada");
        }else {
            System.out.println("Não encontrada");
        }

        //mostrar quantas músicas existem ao todo
        System.out.println(musicas.getTamanho());
    }
}
