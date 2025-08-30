package Facade;

import DAOs.DaoException;
import DAOs.OperationsDAO;
import DAOs.UserDAO;
import personas.User;

public class Facade {
    private User user;
    private static Facade instance;
    UserDAO userDAO;
    OperationsDAO opDAO;

    private Facade() {
        userDAO = new UserDAO();
        opDAO = new OperationsDAO();
    }

    public static Facade getInstance() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }


    public void registerUser(String email, String username, String password) {
        userDAO.registerUser(email, username, password);
    }

    public void logIn(String nameEmail, String password) {
        try {
            user = userDAO.loginUser(nameEmail, password);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
