package TestEntidades;

import DaoImp.LogueoImp;
import model.TblUsuariocl2;

public class TestLogueo {

	public static void main(String[] args) {
        // Crear instancia de la implementación de logueo
        LogueoImp logueo = new LogueoImp();
        // Datos de prueba (deben existir en la base de datos)
        String usuario = "Roxana";  // Reemplázalo con un usuario real
        String password = "1234"; // Reemplázalo con la contraseña real

        // Validar usuario
        TblUsuariocl2 usuarioValidado = logueo.validar(usuario, password);

        if (usuarioValidado != null) {
            System.out.println("Inicio de sesión exitoso para: " + usuarioValidado.getUsuariocl2());
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
	}

}
