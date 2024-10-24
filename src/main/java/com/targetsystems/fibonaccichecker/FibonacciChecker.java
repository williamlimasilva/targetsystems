package com.targetsystems.fibonaccichecker;

import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        // Criando um scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Chamando a função para verificar se o número pertence à sequência
        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Função que verifica se o número pertence à sequência de Fibonacci
    public static boolean pertenceAFibonacci(int numero) {
        // Inicializando os dois primeiros números da sequência de Fibonacci
        int a = 0, b = 1;

        // Se o número for 0 ou 1, ele pertence à sequência
        if (numero == a || numero == b) {
            return true;
        }

        // Calculando os próximos números da sequência até que um seja maior ou igual ao número informado
        int fibonacci = a + b;
        while (fibonacci <= numero) {
            if (fibonacci == numero) {
                return true;
            }
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }

        // Se não encontramos o número, ele não pertence à sequência
        return false;
    }
}
