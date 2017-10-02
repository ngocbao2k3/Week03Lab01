/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352.servlets;

import sati.cprg352.business.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author 595770
 */
public class LoginServlet extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String logoutMessage = request.getParameter("logout1");
       request.setAttribute("logout1", logoutMessage);
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
       
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NullPointerException {
        String username = request.getParameter("myusername");
        String password = request.getParameter("mypassword");
        UserService user = new UserService();
        boolean validUser = true;
            if(user.login(username, password) == validUser)
            {
                request.setAttribute("username", username);
                getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
            }
            else
            {
                request.setAttribute("errorMessage", "Invalid username or password");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
           
       
    }
}
