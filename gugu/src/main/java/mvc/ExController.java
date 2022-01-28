package mvc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ExController
 */
public class ExController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 GugudanModel gumodel = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
        gumodel= new GugudanModel();

    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		 
	        String dan =request.getParameter("dan");
	        String result = null;
	        
	        if(dan != null) {
	            result = gumodel.getGuResult(dan);
	        }
	    
	        request.setAttribute("result", result);
	        String viewName = "result.jsp";
	        
	        request.getRequestDispatcher(viewName).forward(request, response);


	}

}
