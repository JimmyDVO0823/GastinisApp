package DAOs;

import Util.ConnectionManager;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OperationsDAO {
    public OperationsDAO() {
        createTable();
    }

    private final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS OPERACIONES" +
            "(ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "PRESTAMISTA TEXT NOT NULL," +
            "RECEPTOR TEXT NOT NULL," +
            "MONTO REAL NOT NULL," +
            "FECHA TEXT NOT NULL DEFAULT CURRENT_DATE, " +
            "FOREIGN KEY (PRESTAMISTA) REFERENCES USUARIOS(NOMBRE)," +
            "FOREIGN KEY (RECEPTOR) REFERENCES USUARIOS(NOMBRE)," +
            "CHECK (PRESTAMISTA <> RECEPTOR)" +
            ")";

    public void createTable() {
        try (Connection con = ConnectionManager.getConnection();
             Statement stmt = con.createStatement()) {
            stmt.execute(CREATE_TABLE);
            System.out.println("Table created");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " +
                    "al crear o encontrar la tabla de operaciones");
            throw new RuntimeException(e);
        }
    }
}
