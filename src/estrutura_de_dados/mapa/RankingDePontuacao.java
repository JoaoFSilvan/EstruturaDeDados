package estrutura_de_dados.mapa;

public class RankingDePontuacao {
    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>();

        //Inserir pelo menos 4 jogadores
        mapa.inserir("João", 7);
        mapa.inserir("Anderson", 4);
        mapa.inserir("Wesley", 10);
        mapa.inserir("Kevin", 6);

        //Atualizar a pontuação de um jogador
        mapa.inserir("João", 10);

        //Exibir o jogador com maior pontuação
        System.out.println(mapa.toString());
    }
}
