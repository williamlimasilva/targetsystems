package com.targetsystems.dailyrevenueanalyzer.service;

import com.targetsystems.dailyrevenueanalyzer.model.Faturamento;

import java.util.List;

public class AnaliseFaturamento {
    public double calcularMenorValor(List<Faturamento> faturamentos) {
        double menorValor = Double.MAX_VALUE; // Inicializa com o maior valor possível para garantir que qualquer valor será menor

        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() < menorValor) {
                menorValor = faturamento.getValor();
            }
        }

        return menorValor;
    }

    public double calcularMaiorValor(List<Faturamento> faturamentos) {
        double maiorValor = Double.MIN_VALUE; // Inicializa com o menor valor possível para garantir que qualquer valor será maior

        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > maiorValor) {
                maiorValor = faturamento.getValor();
            }
        }

        return maiorValor;
    }

    public int calcularDiasAcimaDaMedia(List<Faturamento> faturamentos) {
        if (faturamentos.isEmpty()) {
            return 0; // Se não houver dados, retorna 0
        }

        double soma = 0;
        int diasComFaturamento = 0;

        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > 0) {
                soma += faturamento.getValor();
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > media) {
                diasAcimaDaMedia++;
            }
        }

        return diasAcimaDaMedia;
    }
}