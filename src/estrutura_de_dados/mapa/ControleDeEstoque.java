package estrutura_de_dados.mapa;

public class ControleDeEstoque {
    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>();

        //Inserir produtos no estoque
        mapa.inserir("Arroz", 50);
        mapa.inserir("Feijão", 50);
        mapa.inserir("Açúcar", 30);
        mapa.inserir("Macarrão", 7);
        mapa.inserir("Café", 15);
        mapa.inserir("Cuscuz", 10);

        //Simular a venda de um produto (diminuir quantidade)
        mapa.inserir("Café", 7);
        mapa.inserir("Açúcar", 12);
        mapa.inserir("Cuscuz", 3);

        System.out.println("Estoque: " + mapa.toString());
    }
}
