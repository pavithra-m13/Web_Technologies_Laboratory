import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class recipe extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String title = request.getParameter("recipeTitle");
            String ingredients = request.getParameter("ingredients");
            String instructions = request.getParameter("instructions");
            out.println("<html>");
            out.println("<head><title>Recipe Page</title></head>");
            out.println("<body>");
            out.println("<center><h1>Recipe Title: " + title + "</h1></center><br>");
            out.println("<h2>Ingredients:</h2>");
            out.println("<ul>");
            String[] ingredientList = ingredients.split("\n");
            for (String ingredient : ingredientList) {
                out.println("<li>" + ingredient + "</li>");
            }
            out.println("</ul>");
            out.println("<h2>Instructions:</h2>");
            out.println("<ol>");
            String[] instructionList = instructions.split("\n");
            for (String instruction : instructionList) {
                out.println("<li>" + instruction + "</li>");
            }
            out.println("</ol>");
            out.print("<h3><center><button style='color: white; background-color: #007bff; padding: 10px 20px; border: none; border-radius: 4px;' onclick=\"window.location.href='fruits_catalog.html'\">Fruits Catalog</button></center></h3>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
