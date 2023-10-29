import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class password extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Connection conn=null;
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String currentPassword = request.getParameter("currentPassword");
        String newPassword = request.getParameter("newPassword");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/organicfruits","root", "");
            if(conn!=null)
            {
                out.println("<h1> No issues in Connection</h1>");
            }
            String sql;
            sql = "UPDATE users SET password = ? WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, currentPassword);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                out.println("<br><br><br><h1><center>Password updated successfully</center></h1>");
                out.print("<h3 ><center><button style='color: white; background-color: #007bff; padding: 10px 20px; border: none; border-radius: 4px;' onclick=\"window.location.href='fruits_catalog.html'\">Fruits Catalog</button></center></h3>");

            } else {
                out.print("<h1><center>Password update failed. Please check your current password and username.</center></h1>");
                out.print("<h3 ><center><button style='color: white; background-color: #007bff; padding: 10px 20px; border: none; border-radius: 4px;' onclick=\"window.location.href='login.html'\">Login</button></center></h3>");

            }
            preparedStatement.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}