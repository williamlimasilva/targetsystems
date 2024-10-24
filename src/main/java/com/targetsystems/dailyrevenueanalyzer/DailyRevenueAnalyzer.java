package com.targetsystems.dailyrevenueanalyzer;

import com.targetsystems.dailyrevenueanalyzer.model.Faturamento;
import com.targetsystems.dailyrevenueanalyzer.service.AnaliseFaturamento;
import com.targetsystems.dailyrevenueanalyzer.service.LeitorDeDados;

import java.util.List;

public class DailyRevenueAnalyzer {
    public static void main(String[] args) {
        LeitorDeDados leitor = new LeitorDeDados();
        List<Faturamento> faturamentos = leitor.lerDados("src/main/resources/faturamento.json"); // Substitua pelo caminho do seu arquivo

        AnaliseFaturamento analise = new AnaliseFaturamento();
        double menorValor = analise.calcularMenorValor(faturamentos);
        double maiorValor = analise.calcularMaiorValor(faturamentos);
        int diasAcimaDaMedia = analise.calcularDiasAcimaDaMedia(faturamentos);

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
    }
}