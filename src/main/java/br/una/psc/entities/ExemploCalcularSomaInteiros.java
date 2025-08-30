package br.una.psc.entities;

import java.util.Scanner;

/**
 * Você precisa desenvolver um algoritmo que realize a soma de dois números inteiros, e, em seguida
 * exiba o resultado da soma.
 * <p>
 * A saída deve seguir o formato: A SOMA DE `VALOR_VARIAVEL_A` COM `VALOR_VARIAVEL_B`
 * É IGUAL A: RESULTADO_DA_SOMA;
 * <p>
 * O resultado da soma deve ser salvo numa terceira variável.
 */
public class ExemploCalcularSomaInteiros {

    /*  Declaração de atributos ("variáveis utilizadas no nosso problema")
        a palavra *private* impede que ela seja modificada externamente (por enquanto apenas declare assim)
        a palavra *final* impede que a variável marcada com este modificador seja alterada posteriormente
     */

    private final Scanner input;

    public ExemploCalcularSomaInteiros(Scanner input) {
        this.input = input;
    }


    // Método responsável pela execução do seu programa;
    public void executar() {
        int primeiraParcela;
        int segundaParcela;
        int resultado;

        System.out.println("***| EXECUTANDO O EXERCÍCIO X |***");
        System.out.println("Cálculo da soma de dois inteiros");
        System.out.println();

        System.out.print("Informe o valor da primeira parcela");
        primeiraParcela = input.nextInt();
        System.out.println();

        System.out.print("Informe o valor da segunda parcela");
        segundaParcela = input.nextInt();
        System.out.println();

        resultado = primeiraParcela + segundaParcela;

        System.out.println();
        System.out.println("A SOMA DE " + primeiraParcela
                + " COM " + segundaParcela
                + " É IGUAL A " + resultado
        );
    }

}
