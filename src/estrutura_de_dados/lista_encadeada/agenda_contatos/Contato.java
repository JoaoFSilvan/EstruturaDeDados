package estrutura_de_dados.lista_encadeada.agenda_contatos;

public class Contato {
    private String nome;
    private int matricula = 0;

    public Contato(String nome) {
        this.nome = nome;
        this.matricula += 1;
    }

    @Override
    public String toString() {
        return nome;
    }
}
