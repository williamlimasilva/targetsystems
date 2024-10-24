package com.targetsystems.cumulativesum;

public class CumulativeSum {

    public static void main(String[] args) {
        // Definindo as variáveis iniciais
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        // Executando o loop até que K seja menor que INDICE
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        // Exibindo o valor final da variável SOMA
        System.out.println("O valor final da SOMA é: " + SOMA);
    }
}
