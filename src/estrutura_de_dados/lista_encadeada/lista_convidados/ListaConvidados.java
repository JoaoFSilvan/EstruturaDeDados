package estrutura_de_dados.lista_encadeada.lista_convidados;

import estrutura_de_dados.mapa.ListaEncadeada;

public class ListaConvidados {
    public static void main(String[] args) {
        ListaEncadeada<Convidado> convidados = new ListaEncadeada<>();

        // cadastrar 6 convidados;
        convidados.adiciona(new Convidado("Marcos", "12345678901"));
        convidados.adiciona(new Convidado("Beatriz", "23456789012"));
        convidados.adiciona(new Convidado("Felipe", "34567890123"));
        convidados.adiciona(new Convidado("Camila", "45678901234"));
        convidados.adiciona(new Convidado("Rafael", "56789012345"));
        convidados.adiciona(new Convidado("Isabela", "67890123456"));

        // adicionar um convidado no início da lista;
        convidados.adicionaInicio(
                new Convidado("Gabriela", "78901234567")
        );

        // adicionar um convidado em uma posição específica;
        Convidado daniel = new Convidado("Daniel", "89012345678");
        convidados.adiciona(5, daniel);

        // exibir a lista completa;
        System.out.println(convidados);

        // verificar se um convidado específico está cadastrado;
        int num = convidados.busca(daniel);

        if (num != -1) {
            System.out.println("Convidado encontrado");
        } else {
            System.out.println("Não encontrado");
        }

        // informar o número total de convidados;
        System.out.println("Total de convidados: " + convidados.getTamanho());
    }
}