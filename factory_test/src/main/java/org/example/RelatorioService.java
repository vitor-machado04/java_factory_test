package org.example;

import org.example.factory.RelatorioFactory;

public class RelatorioService {
    public void processarRelatorio(RelatorioFactory factory, String model_relatorio) {
        iRelatorio relatorio = factory.converterRelatorio();
        relatorio.gerar(model_relatorio);
    }
}
