package Interfaces;

import model.TblUsuariocl2;

public interface ILogueo {
	
	 TblUsuariocl2 validar(String usuario, String password);
}
