package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();

        try {
            fileReader.readFile();
        } catch (Exception e) {
            System.out.println("Problem while reading a file!");
        }

    }
}
