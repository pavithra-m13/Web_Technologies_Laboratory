import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class payment extends HttpServlet {
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
        try{
            response.setContentType("text/html");
            PrintWriter out= response.getWriter();
            out.println("<center><br><br>");
            out.println("<h1>Payment Successful</h1></center>");
            out.print("<h3 ><center><button style='color: white; background-color: #007bff; padding: 10px 20px; border: none; border-radius: 4px;' onclick=\"window.location.href='fruits_catalog.html'\">Fruits Catalog</button></center></h3>");

        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}