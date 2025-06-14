package Facade;

import DAOs.UsuarioDAO;

public class Facade {
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

    public void registrarUsuario(){
        dao.registrarUsuario();
    }
}
