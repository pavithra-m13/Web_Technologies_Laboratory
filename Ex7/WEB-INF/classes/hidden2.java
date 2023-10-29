import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class hidden2 extends HttpServlet {  
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{  
        try
        {  
                response.setContentType("text/html");  
                PrintWriter out = response.getWriter();  
                //Getting the value from the hidden field  
                String n=request.getParameter("uname");  
                out.print("Hello "+n+". Good to be back.");  
                out.print("<h3 ><center><button style='color: white; background-color: #007bff; padding: 10px 20px; border: none; border-radius: 4px;' onclick=\"window.location.href='fruits_catalog.html'\">Fruits Catalog</button></center></h3>");
                out.close();  
        }
        catch(Exception e){System.out.println(e);}    
} 
}  