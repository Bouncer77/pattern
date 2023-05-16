package ru.pczver.pattern.strategy.strategy;

import java.io.File;

public class FileAuth implements AuthStrategy {

    private File file;

    public FileAuth(File file) {
        this.file = file;
    }

    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with file ...");
        return checkFile(name, password);
    }

    private boolean checkFile(String name, String password) {

        // считываем из файла данные
        return true;
    }


}
