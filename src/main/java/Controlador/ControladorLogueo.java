package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DaoImp.LogueoImp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorLogueo
 */
public class ControladorLogueo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorLogueo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		LogueoImp logueo = new LogueoImp();
		TblUsuariocl2 user = logueo.validar(usuario, password);

		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("usuario", user);
			response.sendRedirect("menuPrincipal.jsp"); // Redirige al home si es v�lido
		} else {
			request.setAttribute("error", "Usuario o contrase�a incorrectos");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
