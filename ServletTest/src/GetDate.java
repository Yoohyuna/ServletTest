

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//어노테이션->서블릿의 실행경로를 설정할 수 있도록 만들어진 환경설정
import javax.servlet.annotation.WebServlet;
//---------------------------------------------------
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *형식->@키워드(속성명) or (속성명=값)
 */
@WebServlet("/test/abc/ccc/ddd/GetDate")
public class GetDate extends HttpServlet {
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");//html문서+한글데이터
		PrintWriter out=response.getWriter();//객체 생성 3번째 방법
		out.println("<html><head></head>");//document.write("<html><head></head>");
		out.println("<body>");
		out.println("<h2>한글처리</h2>");
		//요청->request, 응답->response
        request.setCharacterEncoding("utf-8");
        
        String name=request.getParameter("name");
        String addr=request.getParameter("addr");
        out.println("name=>"+name+",addr="+addr);
        //------------------------------------------------------
		out.println("</body>");
		out.println("</html>");
	}

}
