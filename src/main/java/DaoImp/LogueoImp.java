package DaoImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Interfaces.ILogueo;
import model.TblUsuariocl2;

public class LogueoImp implements ILogueo{
	
	@Override
	public TblUsuariocl2 validar(String usuario, String password) {
		// ESTBABLECEMOS CONEXION CON PERSISTENCE
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_CUROROMEROROXANA");
		//Permite gestionar entidades
		EntityManager em=emf.createEntityManager();
		
        TblUsuariocl2 user = null;

        try {
            String sql = "SELECT u FROM TblUsuariocl2 u WHERE u.usuariocl2 = :usuario AND u.passwordcl2 = :password";
            TypedQuery<TblUsuariocl2> query = em.createQuery(sql, TblUsuariocl2.class);
            query.setParameter("usuario", usuario);
            query.setParameter("password", password);

            user = query.getSingleResult(); // Retorna el usuario si existe
        } catch (NoResultException e) {
            System.out.println("Usuario no encontrado.");
        } finally {
            em.close();
        }

        return user;
	}

}
