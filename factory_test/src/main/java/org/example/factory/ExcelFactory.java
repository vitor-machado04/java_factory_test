package org.example.factory;

import org.example.RelatorioExcel;
import org.example.iRelatorio;

public class ExcelFactory extends RelatorioFactory{
    @Override
    public iRelatorio converterRelatorio() {
        return new RelatorioExcel();
    }
}
