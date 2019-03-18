import java.io.IOException;//입출력
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;//서블릿의 초기환경설정할때 필요
import javax.servlet.ServletException;//서블릿의 오류발생시 처리
import javax.servlet.annotation.WebServlet;//웹상에서 어떻게 접근->정보
import javax.servlet.http.HttpServlet;//상속을 받을 부모클래스
import javax.servlet.http.HttpServletRequest;//요청을 받아서 처리 인터페이스
import javax.servlet.http.HttpServletResponse;//응답을 받아서 처리 인터페이스

/**
 * Servlet implementation class RepeatServlet
 */
@WebServlet("/RepeatServlet")
public class RepeatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RepeatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
				 
		   String txt=request.getParameter("name");
		   String num=request.getParameter("number");		 
				   
		/*
		 * out.println("<html><head></head>"); out.println("<body>");
		 */
			
			
	        for(int i=0;i<Integer.parseInt(num);i++) {
	        	out.println("<h3>");
	        	out.println(txt);	
	        	out.println("</h3>");
	        	out.println("</p>");
	        }
		/*
		 * out.println("</body>"); out.println("</html>");
		 */
	}

}
