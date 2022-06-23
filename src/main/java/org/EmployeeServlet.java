package org;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.POJO.LocalEJBEmployee;

import java.io.IOException;

@WebServlet("/index")
public class EmployeeServlet extends HttpServlet {

    @EJB
    private LocalEJBEmployee employee;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(employee.getName() == null || employee.getName().isBlank()){
            employee.setName("Elio");
        }

        req.setAttribute("EmployeeName", employee.getName());

        getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}
