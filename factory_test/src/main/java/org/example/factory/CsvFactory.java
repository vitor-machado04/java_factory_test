package org.example.factory;

import org.example.RelatorioCsv;
import org.example.iRelatorio;

public class CsvFactory extends RelatorioFactory{
    @Override
    public iRelatorio converterRelatorio() {
        return new RelatorioCsv();
    }
}
