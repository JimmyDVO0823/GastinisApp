package DAOs;

import Util.ConnectionManager;
import personas.User;

import javax.swing.*;
import java.sql.*;

public class WordsDAO {
    final String INSERT_WORD = "INSERT INTO WORDS (WORD,MEANING, WHERE_FOUND) " +
            "VALUES (?,?,?)";
    final String CREATE_TABLE  = "CREATE TABLE IF NOT EXISTS WORDS " +
            "(WORD TEXT PRIMARY KEY," +
            "MEANING TEXT NOT NULL,"+
            " WHERE_FOUND TEXT NOT NULL);";
    final String FIND =
            "SELECT WORD, MEANING, WHERE_FOUND " +
                    "FROM WORDS " +
                    "WHERE (WORD = ?) ";

    final String DELETE_WORD = "DELETE FROM WORDS WHERE WORD = ?";

    final String EDIT_WORD = "UPDATE WORDS SET WORD = ?, MEANING = ?, WHERE_FOUND = ? WHERE WORD = ?";


    private void createTable() {
        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(CREATE_TABLE);
            System.out.println("Tabla 'WORDS' verificada o creada.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al crear el tabla USUARIOS.");
        }
    }

    public void registerWords(String word,String meaning, String whereFound) {
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(INSERT_WORD)) {
            stmt.setString(1, word);
            stmt.setString(2, meaning);
            stmt.setString(3, whereFound);
            stmt.executeUpdate();

            System.out.println("Usuario registrado con éxito.");
            System.out.println("Word: " + word + "Meaning: " + meaning + "Where Found: " + whereFound);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario inválido.");
        }
    }

    public void deleteWord(String word,String meaning, String whereFound) {
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(DELETE_WORD)) {
            stmt.setString(1, word);
            stmt.executeUpdate();

            System.out.println("Word deleted successfully.");
            System.out.println("Word: " + word + "Meaning: " + meaning + "Where Found: " + whereFound);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario inválido.");
        }
    }

    public void EDITwORD(String word, String newWord,String meaning, String whereFound) {
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(EDIT_WORD)) {
            stmt.setString(1, newWord);
            stmt.setString(2, meaning);
            stmt.setString(3, whereFound);
            stmt.setString(4, word);
            stmt.executeUpdate();

            System.out.println("Word deleted successfully.");
            System.out.println("New Word: " + newWord + "Meaning: " + meaning + "Where Found: " + whereFound);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario inválido.");
        }
    }
}
