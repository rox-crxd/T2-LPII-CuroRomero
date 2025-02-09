package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;
import model.TblProveedorcl2;

public class ProveedorImp implements IProveedor{

	@Override
	public void RegistrarProveedor(TblProveedorcl2 tblproveedorcl2) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(tblproveedorcl2);
		System.out.println("Proveedor registrado en la BD");
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void ActualizarProveedor(TblProveedorcl2 tblproveedorcl2) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(tblproveedorcl2);
		System.out.println("Datos actualizados correctamente");
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void EliminarProveedor(TblProveedorcl2 tblproveedorcl2) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		TblProveedorcl2 tblprov=em.merge(tblproveedorcl2);
		em.remove(tblprov);
		System.out.println("Dato eliminado");
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<TblProveedorcl2> ListadoProveedor() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<TblProveedorcl2> listadoproveedor=em.createQuery("SELECT p FROM TblProveedorcl2 p",TblProveedorcl2.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listadoproveedor;
	}

	@Override
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblproveedorcl2) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_CUROROMEROROXANA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		TblProveedorcl2 tblprov=em.find(TblProveedorcl2.class,tblproveedorcl2.getIdProveedor());
		em.getTransaction().commit();
		em.close();
		return tblprov;
	}

}
