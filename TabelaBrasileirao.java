package com.pudim;

import java.util.Scanner;

public class TabelaBrasileirao {

    private static final int[] vitorias = new int[20];

    public static void main(String[] args) {
        // Lista de times do Brasileirão
        String[] times = {
            "América Mineiro", "Athletico-PR", "Atlético Mineiro", "Bahia", "Botafogo",
            "Corinthians", "Coritiba", "Cruzeiro", "Cuiabá", "Flamengo",
            "Fluminense", "Fortaleza", "Goiás", "Grêmio", "Internacional",
            "Palmeiras", "Red Bull Bragantino", "Santos", "São Paulo", "Vasco"
        };

        int[] pontuacoes = new int[times.length];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Exibe o menu principal
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Visualizar Tabela");
             System.out.println("2 - Ver Vitorias ");
            System.out.println("3 - Editar Pontuação");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    exibirTabela(times, pontuacoes);
                    break;
                    case 2:
                    exibirTabelacomvitorias(times, pontuacoes, vitorias);
                    break;
                case 3:
                    editarPontuacao(times, pontuacoes, vitorias, scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirTabelacomvitorias(String[] times, int[] pontuacoes, int[] vitorias2) {
    }

    // Módulo para exibir a tabela
    public static void exibirTabela(String[] times, int[] pontuacoes) {
        System.out.println("\nPosição | Time | Pontuação | vitorias");
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + " | " + times[i] + " | " + pontuacoes[i] + " | " + vitorias[i]);
        }
    }

    // Módulo para exibir os times disponíveis para edição
    public static void exibirTimes(String[] times, int[] pontuacoes) {
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + " - " + times[i] + " | Pontuação: " + pontuacoes[i] + " | vitorias: " + vitorias[i]);
        }
    }

    // Módulo para editar a pontuação dos times
    /**
     * @param times
     * @param pontuacoes
     * @param vitorias2
     * @param scanner
     */
    public static void editarPontuacao(String[] times, int[] pontuacoes, int[] vitorias2, Scanner scanner) {
        while (true) {
            // Exibe os times disponíveis para edição
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacoes);
            System.out.println("Escolha o número do time para editar a pontuação (ou 0 para voltar):");
            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }

            // Valida a pontuação

            int novaPontuacao;
if (novaPontuacao >= 0) {
    pontuacoes[posicao - 1] = novaPontuacao;
    System.out.println("Digite o novo número de vitórias para " + times[posicao - 1] + ":");
    int novasVitorias = scanner.nextInt();
    if (novasVitorias >= 0) {
        vitorias[posicao - 1] = novasVitorias; // Atualiza o número de vitórias
    } else {
        System.out.println("O número de vitórias não pode ser negativo.");
    }
} else {
    System.out.println("A pontuação não pode ser negativa.");
}

if (posicao >= 1 && posicao <= times.length) { // Se a posição estiver dentro do intervalo válido
System.out.println("Digite a nova pontuação para " + times[posicao - 1] + ":"); // Imprime uma mensagem

final int novaPontuacao = scanner.nextInt(); // Recebe a nova pontuação

if (novaPontuacao >= 0) { // Se a nova pontuação for não-negativa
pontuacoes[posicao - 1] = novaPontuacao; // Atualiza a pontuação
} else { // Se a nova pontuação for negativa
System.out.println("A pontuação não pode ser negativa."); // Mensagem de erro
}
} else { // Se a posição escolhida for inválida
System.out.println("Posição inválida. Tente novamente."); // Mensagem de erro
}

scanner.nextLine(); // Limpa o buffer do scanner
} // Fim do loop while
ordenarPorPontuacao(times, pontuacoes); // Chama o módulo para ordenar por pontuação
} // Fim do método editarPontuacao

if (novapontuaçao>= 0)

// Módulo para ordenar os times por pontuação
public static void ordenarPorPontuacao(String[] times, int[] pontuacoes) { // Início do método ordenarPorPontuacao
for (int i = 0; i < pontuacoes.length - 1; i++) { // Início do primeiro loop for
for (int j = i + 1; j < pontuacoes.length; j++) { // Início do segundo loop for
if (pontuacoes[i] < pontuacoes[j]) { // Se a pontuação do time i for menor que a do time j
// Troca as pontuações
int tempPontuacao = pontuacoes[i]; // Variável temporária para a pontuação
pontuacoes[i] = pontuacoes[j]; // Atualiza a pontuação do time i
pontuacoes[j] = tempPontuacao; // Atualiza a pontuação do time j

int novaPontuacao;
if (novaPontuacao >= 0) {
    pontuacoes[posicao - 1] = novaPontuacao;
    System.out.println("Digite o novo número de vitórias para " + times[posicao - 1] + ":");
    Scanner scanner;
    int novasVitorias = scanner.nextInt();
    if (novasVitorias >= 0) {
        vitorias[posicao - 1] = novasVitorias; // Atualiza o número de vitórias
    } else {
        System.out.println("O número de vitórias não pode ser negativo.");
    }
} else {
    System.out.println("A pontuação não pode ser negativa.");
}

// Troca os times
String tempTime = times[i]; // Variável temporária para o time
times[i] = times[j]; // Atualiza o time i
times[j] = tempTime; // Atualiza o time j
}
} // Fim do segundo loop for
} // Fim do primeiro loop for
} // Fim do método ordenarPorPontuacao
} // Fim da definição da classe TabelaBrasileirao