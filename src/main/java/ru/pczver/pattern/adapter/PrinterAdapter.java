package ru.pczver.pattern.adapter;

import java.util.List;

public class PrinterAdapter implements PageListPrinter {

    private Printer printer = new Printer();
    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);
        }
    }
}
