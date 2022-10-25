
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulario
 */
@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Formulario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String valor_nombre = request.getParameter("Usuario");
		String valor_contraseña = request.getParameter("pass");

		System.out.println(valor_nombre + " _ " + valor_contraseña);

		if (valor_nombre != null && valor_contraseña != null) {
			if (valor_nombre.equals("Manuel") && valor_contraseña.equals("pass")) {
				request.setAttribute("entrar", "sí");
				request.setAttribute("Usuario", valor_nombre);
				System.out.println("OK! GET");
			} else {
				request.setAttribute("error", "sí");
			}
		}

		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String valor_nombre;
		String valor_contraseña;

//		BufferedReader reader = request.getReader();
//		String rawData = reader.readLine();
//		System.out.println("Datos en bruto con getReader(): " + rawData);
//		
//		String valor_nombre = rawData.substring(rawData.indexOf("Usuario=")+8, rawData.indexOf("&pass"));
//		String valor_contraseña = rawData.substring(rawData.indexOf("pass=")+5, rawData.indexOf("&Boton"));
//		System.out.println(valor_nombre + " _ " + valor_contraseña);
		// Si los parametros son leídos antes por getReader, luego no están disponibles
		// con getParameter().

		valor_nombre = request.getParameter("Usuario");
		valor_contraseña = request.getParameter("pass");
		System.out.println(valor_nombre + " _ " + valor_contraseña);

		if (valor_nombre != null && valor_contraseña != null) {
			if (valor_nombre.equals("Manuel") && valor_contraseña.equals("pass")) {
				request.setAttribute("entrar", "sí");
				request.setAttribute("Usuario", valor_nombre);
				System.out.println("OK! POST");
			} else {
				request.setAttribute("error", "sí");
			}
		}

		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
