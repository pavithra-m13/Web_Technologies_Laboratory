import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class url1 extends HttpServlet {  
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{  
        try{  
            response.setContentType("text/html");  
            PrintWriter out = response.getWriter();  
            String n=request.getParameter("name");  
            out.print("<br><br><br>");
            out.print("<center>");
            out.print("<h1>Thank You "+n+ " for your valuable Feedback</h1>");
            out.print("<br>");   
            out.print("<h4><a href='url2?uname="+n+"'>visit the next page</a></h4>");  
            out.print("</center>");
            out.close();  
        }
        catch(Exception e){System.out.println(e);}  
    } 
}  