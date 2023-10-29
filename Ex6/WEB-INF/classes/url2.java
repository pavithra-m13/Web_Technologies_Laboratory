import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class url2 extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try{  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();            
        String n=request.getParameter("uname");  
        out.println("<center>");
        out.print("<h1>Hello! "+n+"</h1>"); 
        out.print("Your feedback helped us to identify areas for improvement in our product and service") ;
        out.print("<br><br>");
        out.print("<h3 ><center><button style='color: white; background-color: #007bff; padding: 10px 20px; border: none; border-radius: 4px;' onclick=\"window.location.href='fruits_catalog.html'\">Fruits Catalog</button></center></h3>");
        out.print("</center>");
        out.close();  
        }catch(Exception e){System.out.println(e);}  
    } 
}