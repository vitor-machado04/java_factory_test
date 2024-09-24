package org.example;

public class RelatorioCsv implements iRelatorio{
    @Override
    public void gerar(String model_ralatorio) {
        System.out.println("Relatorio " + model_ralatorio + " gerado com sucesso!");
    }
}
