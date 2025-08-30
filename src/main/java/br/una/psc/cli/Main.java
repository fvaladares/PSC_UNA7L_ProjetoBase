package br.una.psc.cli;

import br.una.psc.entities.ExemploCalcularSomaInteiros;

import java.util.Scanner;

/**
 * Esta classe deve ser utilizada exclusivamente como ‘interface’ com a pessoa utilizadora
 * toda a lógica deve ser inserida nas classes presentes no pacote (pasta para organização
 * de documentos conforme a responsabilidade dele).
 * <p>
 * Neste momento não utilizaremos o paradigma orientado a objetos à risca, então, a entrada
 * e saída de dados será feita direto nas classes do pacote entities.
 */
public class Main {
    public static void main(String[] args) {
        // Objeto responsável pela manipulação de dados de entrada
        // O identificador pode ser alterado para um nome que faça mais sentido para você.
        Scanner input = new Scanner(System.in);

        // Criando um objeto que será responsável por executar o nosso programa
        ExemploCalcularSomaInteiros exemploCalcularSomaInteiros = new ExemploCalcularSomaInteiros(input);

        //executando o programa exemploCalcularSomaInteiros
        exemploCalcularSomaInteiros.executar();
    }
}
