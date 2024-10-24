package com.targetsystems.staterevenuepercent;

public class StateRevenuePercent {

    public static void main(String[] args) {
        // Valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calculando o faturamento total
        double faturamentoTotal = sp + rj + mg + es + outros;

        // Calculando e exibindo o percentual de cada estado
        System.out.printf("Percentual de representação por estado:%n");
        System.out.printf("SP: %.2f%%%n", calcularPercentual(sp, faturamentoTotal));
        System.out.printf("RJ: %.2f%%%n", calcularPercentual(rj, faturamentoTotal));
        System.out.printf("MG: %.2f%%%n", calcularPercentual(mg, faturamentoTotal));
        System.out.printf("ES: %.2f%%%n", calcularPercentual(es, faturamentoTotal));
        System.out.printf("Outros: %.2f%%%n", calcularPercentual(outros, faturamentoTotal));
    }

    // Função para calcular o percentual de cada estado em relação ao total
    public static double calcularPercentual(double valorEstado, double faturamentoTotal) {
        return (valorEstado / faturamentoTotal) * 100;
    }
}