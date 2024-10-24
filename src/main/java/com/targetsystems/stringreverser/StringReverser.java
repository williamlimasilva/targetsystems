package com.targetsystems.stringreverser;

import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        // Criando um scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para inverter: ");
        String original = scanner.nextLine();

        // Chamando a função que inverte a string
        String invertida = inverterString(original);

        // Exibindo a string invertida
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    // Função que inverte a string sem usar funções prontas
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray(); // Converte a string para um array de caracteres
        StringBuilder invertida = new StringBuilder();

        // Percorrendo o array de caracteres de trás para frente
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida.append(caracteres[i]); // Construindo a string invertida
        }

        return invertida.toString();
    }
}