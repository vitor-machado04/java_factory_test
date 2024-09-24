package org.example;

import org.example.factory.CsvFactory;
import org.example.factory.ExcelFactory;
import org.example.factory.PdfFactory;

public class Main {
    public static void main(String[] args) {
        RelatorioService service = new RelatorioService();

        service.processarRelatorio(new PdfFactory(), "PDF");

        service.processarRelatorio(new CsvFactory(), "CSV");

        service.processarRelatorio(new ExcelFactory(), "EXCEL");
    }
}