import java.io.IOException;//�����
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;//������ �ʱ�ȯ�漳���Ҷ� �ʿ�
import javax.servlet.ServletException;//������ �����߻��� ó��
import javax.servlet.annotation.WebServlet;//���󿡼� ��� ����->����
import javax.servlet.http.HttpServlet;//����� ���� �θ�Ŭ����
import javax.servlet.http.HttpServletRequest;//��û�� �޾Ƽ� ó�� �������̽�
import javax.servlet.http.HttpServletResponse;//������ �޾Ƽ� ó�� �������̽�

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
