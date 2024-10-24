package com.targetsystems.dailyrevenueanalyzer.service;

import com.google.gson.Gson; // Para usar JSON
import com.google.gson.reflect.TypeToken;
import com.targetsystems.dailyrevenueanalyzer.model.Faturamento;
import org.w3c.dom.*; // Para usar XML

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LeitorDeDados {
    public List<Faturamento> lerDados(String caminhoArquivo) {
        // Verificar a extensão do arquivo para escolher o método de leitura
        if (caminhoArquivo.endsWith(".json")) {
            return lerDadosJson(caminhoArquivo);
        } else if (caminhoArquivo.endsWith(".xml")) {
            return lerDadosXml(caminhoArquivo);
        } else {
            throw new IllegalArgumentException("Formato de arquivo inválido");
        }
    }

    private List<Faturamento> lerDadosJson(String caminhoArquivo) {
        try {
            // Cria um objeto Gson para realizar a conversão
            Gson gson = new Gson();

            // Lê o arquivo JSON e converte para uma lista de objetos Faturamento
            // O TypeToken é utilizado para especificar o tipo da lista que será criada
            List<Faturamento> faturamentos = gson.fromJson(new FileReader(caminhoArquivo),
                    new TypeToken<List<Faturamento>>(){}.getType());

            return faturamentos;
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
            return List.of(); // Retorna uma lista vazia em caso de erro
        }
    }

    private List<Faturamento> lerDadosXml(String caminhoArquivo) {
        // Lógica para ler o arquivo XML e converter para uma lista de objetos Faturamento
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File(caminhoArquivo));
            // ...
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
