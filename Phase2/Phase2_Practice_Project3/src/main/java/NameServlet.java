import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the name parameter from the form
        String name = request.getParameter("name");
        
        // Set the response content type
        response.setContentType("text/html");
        
        // Write the name to the response
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Name Display</title></head><body>");
        out.println("<h2>Hello, " + name + "!</h2>");
        out.println("</body></html>");
        out.close();
    }
}
