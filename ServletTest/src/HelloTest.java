/*
 *1. Servlet->Server Side Applet(�����󿡼� ����Ǵ� �����α׷�)->������(��������)
 *                                           ->���������� �������� �� �� �ִ�.
 * �ڹٽ�ũ��Ʈ ���α׷�->����(�ڱ� ��ǻ�Ϳ��� ����->�ڱ� ������)   
 *              Client Side               �ڱ� ��ǻ�Ϳ��� ����
 *              
 * 2.������ ���� �� �ִ� ����
 * 
 *  1)import javax.servlet.*;//������ Ŭ����
 *     import javax.servlet.http.*;   //���󿡼��� ���ӿ� ���õ� ���� 
 *     =>c:\tomcat8.5\lib->servlet-api.jar���Ͽ� ����     
 *   2) �ݵ�� public class�� �ۼ��ؾ� �Ѵ�.-> ������ ������ �����ϰ� ����� ����
 *   3) �ݵ�� HttpServletŬ������ ��ӹ޾ƾ� �ȴ�. ->
 *      get������� ��û->doGet() �ڵ� ȣ��(call Back)
 *      post������� ��û->,doPost() �ڵ� ȣ��(call Back)
 *      get or post��� ��û->service() �ڵ� ȣ��                          
 */

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
 * Servlet implementation class HelloTest
 */
@WebServlet("/HelloTest")
public class HelloTest extends HttpServlet { //���󿡼� ��û->ó�����ִ� �޼��� ������ �ִ�
	
	/**
	 * ������ ó�� �����ų�� �ڵ����� ȣ��Ǵ� �޼���(=>�����ڿ� ���� ����)
	 * �� �ѹ� ȣ��
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("���� ����� ���� ���� ȣ��Ǵ� �޼���(init())");
		System.out.println("�����ڿ� ���� ����(������ �ʱⰪ�� �����Ҷ�)");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("������ �����Ҷ� (�޸� �����Ҷ�),�ҽ��ڵ尡 ����(reload)");
	}

	/**
	 * ��û�� �޾Ƽ� ó�����ִ� �޼���(request,response){ ����� ����}
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//callBack Method(�ü���� ȣ��)
		System.out.println("���󿡼� get������� �����Ҷ����� �ڵ����� ȣ��Ǵ� �޼���");
		//������� ������ �������� ����
		response.setContentType("text/html;charset=utf-8");//html����+�ѱ۵�����
		//PrintWriter out=new PrintWriter(~);
		PrintWriter out=response.getWriter();//��ü ���� 3��° ���
		out.println("<html><head></head>");//document.write("<html><head></head>");
		out.println("<body>");
		//���ӽ� ������ ������ ����Ͻÿ�.
		out.println("<h2>Hello Servlet �̿���!!!</h2>");
		//�߰�
		out.println("<table border=1>");
        for(int i=2;i<=9;i++) {//��
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
		System.out.println("���󿡼� post������� �����Ҷ����� �ڵ����� ȣ��Ǵ� �޼���");
	}

}


