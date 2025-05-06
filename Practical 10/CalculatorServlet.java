

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int result = 0;
        res.setContentType("text/html"); // Important to set the response type
        PrintWriter p = res.getWriter(); // Moved outside the try block

        try {
            String number1 = req.getParameter("num1");
            String number2 = req.getParameter("num2");
            String operator = req.getParameter("opr");

            int x = Integer.parseInt(number1);
            int y = Integer.parseInt(number2);

            if (operator.equals("+")) {
                result = x + y;
            } else if (operator.equals("-")) {
                result = x - y;
            } else if (operator.equals("*")) {
                result = x * y;
            } else if (operator.equals("/")) {
                if (y != 0) {
                    result = x / y;
                } else {
                    p.println("Division by zero is not allowed.");
                    return;
                }
            } else {
                p.println("Invalid operator.");
                return;
            }

            p.println("<h1>Result: " + result + "</h1>");
        } catch (Exception e) {
            p.println("<h3>Error: " + e.getMessage() + "</h3>");
            e.printStackTrace();
        }
    }
}