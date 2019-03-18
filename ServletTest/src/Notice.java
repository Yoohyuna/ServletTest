

import java.io.*;//�����
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;//http�� ����
//�߰�
import java.util.*;//Calendar ,or Date

/**
 * Servlet implementation class Notice
 */
@WebServlet("/Notice")
public class Notice extends HttpServlet {
	
	/**
	 *  get������� ������ �Ҷ����� �ڵ������� ȣ��Ǵ� �޼���
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");//html����+�ѱ۵�����
		PrintWriter out=response.getWriter();//��ü ���� 3��° ���
		out.println("<html><head><title>��������</title></head>");//document.write("<html><head></head>");
		out.println("<body>");
		out.println("<h2>������ ��������</h2>");
		//notice->2019215.txt
        String fileName="";//�ҷ��� ���ϸ��� ����
        Calendar cal=Calendar.getInstance();//Date d=new Date();
        fileName+=cal.get(Calendar.YEAR);//"2019"
        fileName+=cal.get(Calendar.MONTH)+1;//0~11+1->2 =>"20192"
        fileName+=cal.get(Calendar.DATE);//15->���⵵ �ڵ����->"2019215"
        fileName+=".txt";//2019215.txt
        
        //��θ�+���ϸ�->��δ� ������
        String realPath="C:/webtest/4.jsp/sou2/ServletTest/WebContent/notice/"+fileName;
        System.out.println("realPath=>"+realPath);
        try {
        	//FileInputStream(����) or FileReader(�ѱ�)
        	BufferedReader br=new BufferedReader(new FileReader(realPath));
        	String line="";//���پ� �о�鿩�� ������ ����
        	
        	while((line=br.readLine())!=null) {
        		out.println(line+"<br>");//Ŭ���̾�Ʈ�� �������� ����
        	}
        	br.close();
        }catch(IOException e) {
        	System.out.println("�ҷ��� ������ ��ο� ���ϸ��� Ȯ�ο��=>"+e);
        }catch(Exception e) {
        	System.out.println("���� ���������� �����ϴ�."+e);
        }
        //------------------------------------------------------
        out.println("<p align=center>");
        out.println("<hr>");
        out.println("<input type='submit' value='â�ݱ�' onclick='window.close()'>");
		out.println("</body>");
		out.println("</html>");
	}

}





