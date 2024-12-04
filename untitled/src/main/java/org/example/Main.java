package org.example;

import org.example.service.DatabaseInitializer;
import org.example.service.MiliciaDataInserter;

public class Main {
    public static void main(String[] args) {
        // Inserir os dados da Milícia
        DatabaseInitializer.initialize();
        MiliciaDataInserter.inserirMilicia();
    }
}
