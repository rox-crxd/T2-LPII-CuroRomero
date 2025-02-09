package Controlador;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ProveedorImp;
import model.TblProveedorcl2;

/**
 * Servlet implementation class ControladorProveedor
 */
public class ControladorProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ProveedorImp crudimp = new ProveedorImp();
		TblProveedorcl2 tblprov = new TblProveedorcl2();
		List<TblProveedorcl2> listadoproveedor=crudimp.ListadoProveedor();
		
		request.setAttribute("listar", listadoproveedor);
		
		String accion=request.getParameter("accion");
		if(accion!=null){
			//aplicamos un switch
			switch(accion){
			case "Actualizar":
				//Obtenemos el código
				int cod=Integer.parseInt(request.getParameter("cod"));
				//Asignamos los valores
				tblprov.setIdProveedor(cod);
				//Buscamos el codigo a actualizar
				TblProveedorcl2 prov=crudimp.BuscarProveedor(tblprov);
				SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
				//Asignamos los valores
				//Para enviarlos hacia la vista(formulario actualizar)
				request.setAttribute("codigo", prov.getIdProveedor());
				request.setAttribute("nombre", prov.getNomProvecl2());
				request.setAttribute("ruc", prov.getRucProvecl2());
				request.setAttribute("razon", prov.getRsocialProvecl2());
				request.setAttribute("email", prov.getEmailProvecl2());
				request.setAttribute("fechaing", format.format(prov.getFeingProvecl2()));
				//Redireccionamos
				request.getRequestDispatcher("actualizarProveedor.jsp").forward(request, response);
				break; //salimos
			case "Registrar":
				//redireccionamos a la vista jsp
				request.getRequestDispatcher("registrarProveedor.jsp").forward(request, response);
				break;
			case "Eliminar":
				//Obtenemos el código
				int codEliminar=Integer.parseInt(request.getParameter("cod"));
				//Asignamos los valores
				tblprov.setIdProveedor(codEliminar);
				//Invocamos al metodo eliminar
				crudimp.EliminarProveedor(tblprov);
				List<TblProveedorcl2> listar=crudimp.ListadoProveedor();
				//Enviamos hacia la vista
				request.setAttribute("listar", listar);
				//Redireccionamos
				request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
				break;
			case "Listar":
				//redireccionamos a la vista jsp
				request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
				break;
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);

		String codigo=request.getParameter("codigo");
		String nombre=request.getParameter("nombre");
		String ruc=request.getParameter("ruc");
		String razon=request.getParameter("razon");
		String email=request.getParameter("email");
		Date fechaing=new Date();
		Date fechasql=new Date(fechaing.getTime());

		TblProveedorcl2 tblprov=new TblProveedorcl2();
		ProveedorImp provImp=new ProveedorImp();

		tblprov.setNomProvecl2(nombre);
		tblprov.setRucProvecl2(ruc);
		tblprov.setRsocialProvecl2(razon);
		tblprov.setEmailProvecl2(email);
		tblprov.setFeingProvecl2(fechasql);

		if(codigo!=null){
			int cod=Integer.parseInt(codigo);

			tblprov.setIdProveedor(cod);
			provImp.ActualizarProveedor(tblprov);

		}else{
			provImp.RegistrarProveedor(tblprov);
		}

		List<TblProveedorcl2> listar=provImp.ListadoProveedor();
		
		request.setAttribute("listar",listar);
		request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
	}

}
