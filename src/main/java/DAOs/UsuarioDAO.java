package DAOs;

import Util.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {
    final String REGISTRO_USUARIO = "registro_usuario";
    final String CREAR_TABLA  = "CREATE TABLE IF NOT EXISTS USUARIOS " +
            "(ID INTEGER PRIMARY KEY AUTOINCREMENT, NOMBRE TEXT NOT NULL," +
            " CONTRASEÑA TEXT NOT NULL);";



    public void registrarUsuario () {
        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(CREAR_TABLA);
            System.out.println("Tabla 'USUARIO' verificada o creada.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
