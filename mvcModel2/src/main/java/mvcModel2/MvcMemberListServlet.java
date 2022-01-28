package mvcModel2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class MvcMemberListServlet
 */
//@WebServlet(name = "mvcMemberListServlet", urlPatterns = "/servlet-mvc/members")
@WebServlet("/servlet/members")
public class MvcMemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberRepository memberRepository = MemberRepository.getInstance();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcMemberListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Member> members = memberRepository.findAll();
        request.setAttribute("members",members); /// 저장
        String viewPath ="/members.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request,response);
	}

}
