package Facade;

import DAOs.DaoException;
import DAOs.UsuarioDAO;
import personas.User;

public class Facade {
    private User user;
    private static Facade instance;

    private Facade() {
    }

    public static Facade getInstance() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    UsuarioDAO dao = new UsuarioDAO();

    public void registerUser(String email, String username, String password) {
        dao.registerUser(email, username, password);
    }

    public void logIn(String nameEmail, String password) {
        try {
            user = dao.loginUser(nameEmail, password);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
