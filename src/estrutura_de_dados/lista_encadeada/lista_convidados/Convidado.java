package estrutura_de_dados.lista_encadeada.lista_convidados;

public class Convidado {
    private String nome;
    private String cpf;

    public Convidado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome;
    }
}
