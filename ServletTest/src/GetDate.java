

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//������̼�->������ �����θ� ������ �� �ֵ��� ������� ȯ�漳��
import javax.servlet.annotation.WebServlet;
//---------------------------------------------------
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *����->@Ű����(�Ӽ���) or (�Ӽ���=��)
 */
@WebServlet("/test/abc/ccc/ddd/GetDate")
public class GetDate extends HttpServlet {
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");//html����+�ѱ۵�����
		PrintWriter out=response.getWriter();//��ü ���� 3��° ���
		out.println("<html><head></head>");//document.write("<html><head></head>");
		out.println("<body>");
		out.println("<h2>�ѱ�ó��</h2>");
		//��û->request, ����->response
        request.setCharacterEncoding("utf-8");
        
        String name=request.getParameter("name");
        String addr=request.getParameter("addr");
        out.println("name=>"+name+",addr="+addr);
        //------------------------------------------------------
		out.println("</body>");
		out.println("</html>");
	}

}
