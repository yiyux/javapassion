package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This is a simple example of an HTTP Servlet.  It responds to the GET
 * method of the HTTP protocol.
 */
public class ResponseServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        // then write the data of the response
        String username = request.getParameter("username");

        if ((username != null) && (username.length() > 0)) {
            out.println("<h2>Hello, " + username + "!</h2>");

        }

        HttpSession session = request.getSession();
        out.println("<h2>You live in " + session.getAttribute("city") + "!</h2>");
        out.println("<h2>Your age is  " + session.getAttribute("age") + "!</h2>");
    }

    public String getServletInfo() {
        return "The Response servlet says hello.";
    }
}
