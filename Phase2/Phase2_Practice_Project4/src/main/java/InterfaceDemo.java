import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/InterfaceDemo")
public class InterfaceDemo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Servlet Demo</title></head><body>");
        response.getWriter().println("<h2>Servlet invoked successfully!</h2>");
        response.getWriter().println("</body></html>");
    }
}
