package org.example.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MiliciaDataInserter {

    public static void inserirMilicia() {
        try (Connection connection = Database.getConnection()) {
            // Inserir o tipo de tropa
            int tipoId = insertTipoDeTropa(connection, "Infantaria");

            // Inserir a tropa "Milícia"
            int tropaId = insertTropa(connection, "Milícia", tipoId, 4, 5, 20, 1);

            // Inserir os dados de recursos necessários para cada nível
            insertRecursosNecessarios(connection, tropaId, 1, 100, 50, 30, 10);
            insertRecursosNecessarios(connection, tropaId, 2, 200, 100, 60, 20);
            insertRecursosNecessarios(connection, tropaId, 3, 400, 200, 120, 40);
            insertRecursosNecessarios(connection, tropaId, 4, 800, 400, 240, 80);

            // Inserir os dados de danos e defesas para cada nível
            insertDanosDefesas(connection, tropaId, 1, 10, 5, 2, 0, 0, 0, 3);
            insertDanosDefesas(connection, tropaId, 2, 20, 10, 4, 0, 0, 0, 6);
            insertDanosDefesas(connection, tropaId, 3, 40, 20, 8, 0, 0, 0, 12);
            insertDanosDefesas(connection, tropaId, 4, 80, 40, 16, 0, 0, 0, 24);

            System.out.println("Dados da Milícia inseridos com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados da Milícia: " + e.getMessage());
        }
    }

    private static int insertTipoDeTropa(Connection connection, String nome) throws SQLException {
        String sql = "INSERT INTO TiposDeTropas (nome) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, nome);
            statement.executeUpdate();
            var resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getInt(1); // Retorna o ID gerado
            }
        }
        throw new SQLException("Erro ao inserir TipoDeTropa.");
    }

    private static int insertTropa(Connection connection, String nome, int tipoId, int nivelMaximo, int danoMedio, int pontosVida, int velocidade) throws SQLException {
        String sql = "INSERT INTO Tropas (nome, tipo_id, nivel_maximo, dano_medio, pontos_vida, velocidade) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, nome);
            statement.setInt(2, tipoId);
            statement.setInt(3, nivelMaximo);
            statement.setInt(4, danoMedio);
            statement.setInt(5, pontosVida);
            statement.setInt(6, velocidade);
            statement.executeUpdate();
            var resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getInt(1); // Retorna o ID gerado
            }
        }
        throw new SQLException("Erro ao inserir Tropa.");
    }

    private static void insertRecursosNecessarios(Connection connection, int tropaId, int nivel, int dinheiro, int alimento, int maoDeObra, int combustivel) throws SQLException {
        String sql = "INSERT INTO RecursosNecessarios (tropa_id, nivel, dinheiro, alimento, mao_de_obra, combustivel) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, tropaId);
            statement.setInt(2, nivel);
            statement.setInt(3, dinheiro);
            statement.setInt(4, alimento);
            statement.setInt(5, maoDeObra);
            statement.setInt(6, combustivel);
            statement.executeUpdate();
        }
    }

    private static void insertDanosDefesas(Connection connection, int tropaId, int nivel, int semBlindagem, int blindagemLeve, int blindagemPesada, int aviao, int navio, int submarino, int edificio) throws SQLException {
        String sql = "INSERT INTO DanosDefesas (tropa_id, nivel, contra_sem_blindagem, contra_blindagem_leve, contra_blindagem_pesada, contra_aviao, contra_navio, contra_submarino, contra_edificio) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, tropaId);
            statement.setInt(2, nivel);
            statement.setInt(3, semBlindagem);
            statement.setInt(4, blindagemLeve);
            statement.setInt(5, blindagemPesada);
            statement.setInt(6, aviao);
            statement.setInt(7, navio);
            statement.setInt(8, submarino);
            statement.setInt(9, edificio);
            statement.executeUpdate();
        }
    }
}
