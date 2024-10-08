package p1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/resultserv")
public class ResultServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String s = request.getParameter("hno");
            int int_hno = Integer.parseInt(s);

            // Get result using DAO
            ResultDAO rao = new ResultDAO();
            ResultBean rdb = rao.getResult(int_hno);

            // Store result in the session
            HttpSession hs = request.getSession();
            request.setAttribute("resultbean", rdb); // Don't convert to string

            // Forward the request to the result page
            RequestDispatcher rd = request.getRequestDispatcher("/stdresult.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
