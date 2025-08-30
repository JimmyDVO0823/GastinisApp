package DAOs;

import Util.ConnectionManager;
import personas.User;

import javax.swing.*;
import java.sql.*;

public class UserDAO {
    final String INSERT_USER = "INSERT INTO USUARIOS (NOMBRE,EMAIL, CONTRASENIA) " +
            "VALUES (?,?,?)";
    final String CREAR_TABLA  = "CREATE TABLE IF NOT EXISTS USUARIOS " +
            "(NOMBRE TEXT PRIMARY KEY," +
            "EMAIL TEXT NOT NULL,"+
            " CONTRASENIA TEXT NOT NULL);";
    final String FIND_BY_CREDENTIALS =
            "SELECT nombre, email, contrasenia " +
                    "FROM USUARIOS " +
                    "WHERE (nombre = ? OR email = ?) " +
                    "  AND CONTRASENIA = ?";

    public UserDAO() {
        createTable();
    }

    private void createTable() {
        try (Connection conn = ConnectionManager.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(CREAR_TABLA);
            System.out.println("Tabla 'USUARIOS' verificada o creada.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al crear el tabla USUARIOS.");
        }
    }


    public void registerUser(String email,String name, String password) {
        try (Connection conn = ConnectionManager.getConnection();
        PreparedStatement stmt = conn.prepareStatement(INSERT_USER)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.executeUpdate();

            System.out.println("Usuario registrado con éxito.");
            System.out.println("Nombre: " + name + "Correo: " + email + "Contrasenia: " + password);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario inválido.");
        }
    }

    public User loginUser(String name, String password) throws DaoException {
        try (Connection conn = ConnectionManager.getConnection();
        PreparedStatement stmt = conn.prepareStatement(FIND_BY_CREDENTIALS)){
            stmt.setString(1, name);
            stmt.setString(2, name);
            stmt.setString(3, password);
            //System.out.println(stmt);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Si hay coincidencia, mapeas y devuelves el usuario
                    return new User(
                            rs.getString("nombre"),
                            rs.getString("email"),
                            rs.getString("contrasenia")
                    );
                } else {
                    // No encontrado: podrías devolver null o lanzar excepción
                    return null;
                }
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            throw new DaoException("Error",e);
        }
    }
}
