package mvcModel2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MvcMemberFormServlet
 */
//@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
@WebServlet("/servlet/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcMemberFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String viewPath = "/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);// 컨트롤러에서 뷰로 이동할때 사용
        dispatcher.forward(request, response); //서블릿에서 jsp호출
            /////// 외부에서 호출되고 싶지 않을때 WEB-INF 사용        
	}

}
