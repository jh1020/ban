package mvcModel2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MvcMemberSaveServlet
 */
//@WebServlet(name="mvcMemberSaveServlet", urlPatterns = "/servlet-mvc/members/save")
@WebServlet("/servlet/members/save")
public class MvcMemberSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberRepository memberRepository = MemberRepository.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcMemberSaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        //model에 데이터를 보관
        request.setAttribute("member", member); /// request 내부에 map같은 저장소가 잇음

        String viewPath="/save-result.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
	}

}
