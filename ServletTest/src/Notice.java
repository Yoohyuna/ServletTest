

import java.io.*;//입출력
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;//http로 접속
//추가
import java.util.*;//Calendar ,or Date

/**
 * Servlet implementation class Notice
 */
@WebServlet("/Notice")
public class Notice extends HttpServlet {
	
	/**
	 *  get방식으로 접속을 할때마다 자동적으로 호출되는 메서드
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");//html문서+한글데이터
		PrintWriter out=response.getWriter();//객체 생성 3번째 방법
		out.println("<html><head><title>공지사항</title></head>");//document.write("<html><head></head>");
		out.println("<body>");
		out.println("<h2>오늘의 공지사항</h2>");
		//notice->2019215.txt
        String fileName="";//불러올 파일명을 저장
        Calendar cal=Calendar.getInstance();//Date d=new Date();
        fileName+=cal.get(Calendar.YEAR);//"2019"
        fileName+=cal.get(Calendar.MONTH)+1;//0~11+1->2 =>"20192"
        fileName+=cal.get(Calendar.DATE);//15->윤년도 자동계산->"2019215"
        fileName+=".txt";//2019215.txt
        
        //경로명+파일명->경로는 절대경로
        String realPath="C:/webtest/4.jsp/sou2/ServletTest/WebContent/notice/"+fileName;
        System.out.println("realPath=>"+realPath);
        try {
        	//FileInputStream(영문) or FileReader(한글)
        	BufferedReader br=new BufferedReader(new FileReader(realPath));
        	String line="";//한줄씩 읽어들여서 저장할 변수
        	
        	while((line=br.readLine())!=null) {
        		out.println(line+"<br>");//클라이언트의 브라우저로 전송
        	}
        	br.close();
        }catch(IOException e) {
        	System.out.println("불러올 파일의 경로와 파일명을 확인요망=>"+e);
        }catch(Exception e) {
        	System.out.println("오늘 공지사항이 없습니다."+e);
        }
        //------------------------------------------------------
        out.println("<p align=center>");
        out.println("<hr>");
        out.println("<input type='submit' value='창닫기' onclick='window.close()'>");
		out.println("</body>");
		out.println("</html>");
	}

}





