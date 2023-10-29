import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class cookie2 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
     try{
        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();
        Cookie[] ck=request.getCookies();
        int len=ck.length;
        String value;      
        for(int i=0;i<len;i++)
        {
            value=ck[i].getValue();
            pwriter.print("<center><br><br>");
            pwriter.println("<h3>Hello");
            pwriter.println(value +"</h3>");
        }
        pwriter.print("<center><br><br>");
        pwriter.print("<h2>Thank you for contacting us.Your message has been submitted successfully!</h2>");
        pwriter.print("<h3 ><center><button style='color: white; background-color: #007bff; padding: 10px 20px; border: none; border-radius: 4px;' onclick=\"window.location.href='fruits_catalog.html'\">Fruits Catalog</button></center></h3>");
        pwriter.print("</center>");
        pwriter.close();
    }
     catch(Exception exp){
       System.out.println(exp);
     }
  }
}