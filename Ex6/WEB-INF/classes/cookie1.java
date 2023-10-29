/*SET USERNAME AS COOKIE AND REDIRECT TO INBOX*/

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
        String imagePath = request.getContextPath() + "/images/contact_bg.jpg";
        pwriter.println("background-image: url('" + imagePath + "');");
        pwriter.println("background-color: rgba(238, 215, 151, 0.863);background-repeat: no-repeat; background-size: cover;");
        pwriter.println("display: flex;");
        // pwriter.print("justify-content: center;");
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