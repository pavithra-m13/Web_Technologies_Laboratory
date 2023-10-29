import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class cookie1 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
     try{
        response.setContentType("text/html");
        PrintWriter pwriter = response.getWriter();
        String in_uname = request.getParameter("name");
        Cookie c = new Cookie("UserCookie",in_uname);      
        response.addCookie(c);
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<style>");
        pwriter.println("body {");
        pwriter.println("font-family: Arial, sans-serif;");
        pwriter.println("background-color:rgb(17, 150, 17);");
        pwriter.println("display: flex;");
        pwriter.println("align-items: center;");
        pwriter.println("height: 100vh;");
        pwriter.println("flex-direction: column;");
        pwriter.println("}");
        response.getWriter().println("</style>");
        response.getWriter().println("</head>");
        pwriter.println("<body>");
        pwriter.print("<h1><center>Hii "+in_uname+"</center></h1>");
        pwriter.println("<br><br>");
        pwriter.println("<p style='text-align: center; font-size: 18px; color: green;'>Please confirm the message. </p>");
        pwriter.println("</body></html>");
        pwriter.print("<h3 ><center><a href='cookie2'> Confirm</a></center></h3>");
        pwriter.println("</body></html>");
      }
     catch(Exception exp){
       System.out.println(exp);
     }
  }
}