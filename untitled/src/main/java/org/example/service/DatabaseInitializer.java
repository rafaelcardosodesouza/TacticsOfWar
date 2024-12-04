package org.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInitializer {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/callOfWarSystemInfo";
    private static final String USER = "root"; // Usuário padrão
    private static final String PASSWORD = ""; // Sem senha

    public static void initialize() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement statement = connection.createStatement();

            // Criação da tabela TiposDeTropas
            String createTiposDeTropas = """
                CREATE TABLE IF NOT EXISTS TiposDeTropas (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    nome VARCHAR(50) NOT NULL
                );
            """;
            statement.executeUpdate(createTiposDeTropas);

            // Criação da tabela Tropas
            String createTropas = """
                CREATE TABLE IF NOT EXISTS Tropas (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    nome VARCHAR(50) NOT NULL,
                    tipo_id INT NOT NULL,
                    nivel_maximo INT NOT NULL,
                    dano_medio DOUBLE,
                    pontos_vida DOUBLE,
                    velocidade DOUBLE,
                    FOREIGN KEY (tipo_id) REFERENCES TiposDeTropas(id)
                );
            """;
            statement.executeUpdate(createTropas);

            // Criação da tabela RecursosNecessarios
            String createRecursosNecessarios = """
                CREATE TABLE IF NOT EXISTS RecursosNecessarios (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    tropa_id INT NOT NULL,
                    nivel INT NOT NULL,
                    dinheiro DOUBLE,
                    alimento DOUBLE,
                    mao_de_obra DOUBLE,
                    combustivel DOUBLE,
                    FOREIGN KEY (tropa_id) REFERENCES Tropas(id)
                );
            """;
            statement.executeUpdate(createRecursosNecessarios);

            // Criação da tabela DanosDefesas
            String createDanosDefesas = """
                CREATE TABLE IF NOT EXISTS DanosDefesas (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    tropa_id INT NOT NULL,
                    nivel INT NOT NULL,
                    contra_sem_blindagem DOUBLE,
                    contra_blindagem_leve DOUBLE,
                    contra_blindagem_pesada DOUBLE,
                    contra_aviao DOUBLE,
                    contra_navio DOUBLE,
                    contra_submarino DOUBLE,
                    contra_edificio DOUBLE,
                    FOREIGN KEY (tropa_id) REFERENCES Tropas(id)
                );
            """;
            statement.executeUpdate(createDanosDefesas);

            // Criação da tabela Terrenos
            String createTerrenos = """
                CREATE TABLE IF NOT EXISTS Terrenos (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    nome VARCHAR(50) NOT NULL,
                    buff_forca DOUBLE,
                    debuff_forca DOUBLE,
                    buff_velocidade DOUBLE,
                    debuff_velocidade DOUBLE
                );
            """;
            statement.executeUpdate(createTerrenos);

            System.out.println("Tabelas criadas com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
