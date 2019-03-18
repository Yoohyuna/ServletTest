/*
 *1. Servlet->Server Side Applet(서버상에서 실행되는 웹프로그램)->동영상(원격전송)
 *                                           ->브라우저에서 실행결과를 볼 수 있다.
 * 자바스크립트 프로그램->계산기(자기 컴퓨터에서 실행->자기 브라우저)   
 *              Client Side               자기 컴퓨터에서 실행
 *              
 * 2.서블릿을 만들 수 있는 조건
 * 
 *  1)import javax.servlet.*;//서블릿의 클래스
 *     import javax.servlet.http.*;   //웹상에서의 접속에 관련된 정보 
 *     =>c:\tomcat8.5\lib->servlet-api.jar파일에 저장     
 *   2) 반드시 public class로 작성해야 한다.-> 누구나 접속이 가능하게 만들기 위해
 *   3) 반드시 HttpServlet클래스를 상속받아야 된다. ->
 *      get방식으로 요청->doGet() 자동 호출(call Back)
 *      post방식으로 요청->,doPost() 자동 호출(call Back)
 *      get or post방식 요청->service() 자동 호출                          
 */

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
 * Servlet implementation class HelloTest
 */
@WebServlet("/HelloTest")
public class HelloTest extends HttpServlet { //웹상에서 요청->처리해주는 메서드 가지고 있다
	
	/**
	 * 서블릿을 처음 실행시킬때 자동으로 호출되는 메서드(=>생성자와 같은 역할)
	 * 딱 한번 호출
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("서블릿 실행시 제일 먼저 호출되는 메서드(init())");
		System.out.println("생성자와 같은 역할(서블릿의 초기값을 설정할때)");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("서블릿이 종료할때 (메모리 해제할때),소스코드가 변경(reload)");
	}

	/**
	 * 요청을 받아서 처리해주는 메서드(request,response){ 기능을 구현}
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//callBack Method(운영체제가 호출)
		System.out.println("웹상에서 get방식으로 접속할때마다 자동으로 호출되는 메서드");
		//어떤형태의 문서를 보내줄지 결정
		response.setContentType("text/html;charset=utf-8");//html문서+한글데이터
		//PrintWriter out=new PrintWriter(~);
		PrintWriter out=response.getWriter();//객체 생성 3번째 방법
		out.println("<html><head></head>");//document.write("<html><head></head>");
		out.println("<body>");
		//접속시 보여줄 내용을 기술하시오.
		out.println("<h2>Hello Servlet 이연수!!!</h2>");
		//추가
		out.println("<table border=1>");
        for(int i=2;i<=9;i++) {//단
        	out.println("<tr>");
        	for(int j=1;j<10;j++) {
        		out.println("<td>");
        		out.println(""+i+"*"+j+"="+(i*j));
        		out.println("</td>");
        	}
        	out.println("</tr>");
        }
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("웹상에서 post방식으로 접속할때마다 자동으로 호출되는 메서드");
	}

}


