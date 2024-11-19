package controllers;

import dao.AccountDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        AccountDAO accountDAO = new AccountDAO();
        ArrayList listRole = accountDAO.getAllRole();
        request.setAttribute("listRole", listRole);
//        request.getRequestDispatcher("src/main/webapp/Register.jsp").forward(request, response);
        response.getWriter().write("Success!");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String fullname = request.getParameter("fullname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");
        String role_id = request.getParameter("role_id");
        AccountDAO accountDAO = new AccountDAO();
        accountDAO.register(fullname, phone, email, gender, user_name, password, role_id);
        response.sendRedirect("src/main/webapp/Login.jsp");
    }
}
