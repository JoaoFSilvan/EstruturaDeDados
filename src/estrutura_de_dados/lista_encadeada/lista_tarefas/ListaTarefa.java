package estrutura_de_dados.lista_encadeada.lista_tarefas;

import estrutura_de_dados.mapa.ListaEncadeada;

public class ListaTarefa {
    public static void main(String[] args) {
        ListaEncadeada<Tarefa> lista = new ListaEncadeada();

        //adicionar 8 tarefas;
        lista.adiciona(new Tarefa("Estudar Java", 5));
        lista.adiciona(new Tarefa("Organizar o quarto", 2));
        lista.adiciona(new Tarefa("Entregar atividade", 5));
        lista.adiciona(new Tarefa("Fazer exercícios", 3));
        lista.adiciona(new Tarefa("Preparar almoço", 4));
        lista.adiciona(new Tarefa("Regar as plantas", 1));
        lista.adiciona(new Tarefa("Revisar anotações", 4));

        Tarefa ler = new Tarefa("Ler um livro", 2);
        lista.adiciona(ler);

        //exibir todas as tarefas;
        System.out.println(lista);

        //verificar se uma tarefa específica está na lista;
        int num = lista.busca(ler);
        if (num == -1) {
            System.out.println("Não encontrado");
        }else {
            System.out.println("Tarefa encontrada");
        }

        //mostrar a última tarefa cadastrada;
        System.out.println(lista.buscaPorPosicao(lista.getTamanho()-1));

        //informar a quantidade total de tarefas.
        System.out.println(lista.getTamanho());
    }
}
