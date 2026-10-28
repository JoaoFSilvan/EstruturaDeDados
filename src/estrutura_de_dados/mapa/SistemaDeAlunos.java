package estrutura_de_dados.mapa;

public class SistemaDeAlunos {
    public static void main(String[] args) {
        Mapa<Integer, String> studus = new Mapa<>();

        //Inserir pelo menos 5 alunos
        studus.inserir(1, "João");
        studus.inserir(2, "Anderson");
        studus.inserir(3, "Welsey");
        studus.inserir(4, "Marcos");
        studus.inserir(5, "Antônio");

        //Buscar um aluno pela matrícula
        System.out.println(studus.busca(4));

        //Remover um aluno
        System.out.println(studus.remover(3));

        //Exibir todas as chaves e valores
        System.out.println(studus);
    }
}
