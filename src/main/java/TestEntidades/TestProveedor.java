package TestEntidades;

import java.util.List;
import DaoImp.ProveedorImp;
import model.TblProveedorcl2;

public class TestProveedor {

	public static void main(String[] args) {
		TblProveedorcl2 tbl=new TblProveedorcl2();
		ProveedorImp crudimp=new ProveedorImp();
		
		/*//ASIGNAMOS LOS RESPECTIVOS VALORES
		tbl.setNomProvecl2("Juan");
		tbl.setRucProvecl2("456951");
		tbl.setRsocialProvecl2("Coca cola SAC");
		tbl.setEmailProvecl2("coca@gmail.com");
		Date fechaing=new Date();
		Date fechasql=new Date(fechaing.getTime());
		tbl.setFeingProvecl2(fechasql);
		//Invocamos el respectivo metodo registrar
		crudimp.RegistrarProveedor(tbl);*/
		
		/*//Actualizar
		tbl.setIdproducto(3);
		tbl.setNomprod("Fabrizio");
		tbl.setRucProvecl2("456951");
		tbl.setRsocialProvecl2("Honda EIRL");
		tbl.setEmailProvecl2("honda@gmail.com");
		Date fechaing=new Date();
		Date fechasql=new Date(fechaing.getTime());
		tbl.setFeingProvecl2(fechasql);
		//invocamos el respectivo metodo actualizar.
		crudimp.ActualizarProveedor(tbl);*/
		
		
		//Buscar o obtener
		tbl.setIdProveedor(1);
		TblProveedorcl2 buscarprov=crudimp.BuscarProveedor(tbl);
		//Imprimimos por pantalla el mensaje
		System.out.println("codigo " +buscarprov.getIdProveedor()+ " nombre " +buscarprov.getNomProvecl2());
		
		//Listar producto
		List<TblProveedorcl2> listadoproveedor=crudimp.ListadoProveedor();
		//Aplicamos un bucle for
		for(TblProveedorcl2 prod:listadoproveedor){
			//Imprimimos 
			System.out.println("codigo: " + prod.getIdProveedor()+"  nombre: " + buscarprov.getNomProvecl2());
		}
		
	}
}
