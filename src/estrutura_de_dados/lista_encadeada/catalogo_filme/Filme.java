package estrutura_de_dados.lista_encadeada.catalogo_filme;

import java.util.Date;

public class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
