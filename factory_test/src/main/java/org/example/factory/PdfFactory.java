package org.example.factory;

import org.example.RelatorioPdf;
import org.example.iRelatorio;

public class PdfFactory extends RelatorioFactory{
    @Override
    public iRelatorio converterRelatorio() {
        return new RelatorioPdf();
    }
}
