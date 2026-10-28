package estrutura_de_dados.lista_encadeada.playlist;

public class Musica {
    private String titulo;
    private String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo; this.artista = artista;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
