package controllers;

import dao.AccountDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Account;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("user_name");
        String password = request.getParameter("password");
        AccountDAO accountDAO = new AccountDAO();
        if (accountDAO.checkAccount(userName, password)) {
            Account acc = accountDAO.getAccount(userName, password);
            if (!acc.getActive()) {
                request.setAttribute("msg", "Acc is blocked");
                request.getRequestDispatcher("/src/main/webapp/Login.jsp").forward(request, response);
            }
            if (acc.getRole().getRole_name().equals("admin")) {
                HttpSession ss = request.getSession();
                ss.setAttribute("account", acc);
                response.getWriter().write("success");
//                response.sendRedirect("AdminPage.jsp");
            } else {
                HttpSession ss = request.getSession();
                ss.setAttribute("account", acc);
                response.getWriter().write("success");
//                response.sendRedirect("Homepage.jsp");
            }
        } else {
            request.setAttribute("msg", "Username or Password incorrect");
            request.getRequestDispatcher("/src/main/webapp/Login.jsp").forward(request, response);
        }
//        Account account = accountDAO.login(userName, password);
//
//        if (account != null) {
//            HttpSession session = request.getSession(false);
//            session.setAttribute("user", account);
//            response.sendRedirect("homepage.jsp");
//        } else {
//            request.setAttribute("error", "Invalid username or password.");
//            request.getRequestDispatcher("Login.jsp").forward(request, response);
//        }
    }
}


