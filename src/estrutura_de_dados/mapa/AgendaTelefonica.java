package estrutura_de_dados.mapa;

public class AgendaTelefonica {
    public static void main(String[] args) {
        Mapa<String, String> mapa = new Mapa<>();

        //Adicionar pelo menos 4 contatos
        mapa.inserir("João", "83991234567");
        mapa.inserir("Nayanne", "83923456789");
        mapa.inserir("Sormany", "83945678910");
        mapa.inserir("José Matheus", "83945678910");

        //Buscar o telefone de um contato
        System.out.println(mapa.busca("Sormany"));

        //Remover um contato
        System.out.println(mapa.remover("João"));

        //Exibir todos os contatos
        System.out.println(mapa.toString());
    }
}
