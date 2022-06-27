package com.system.eisei.controller;

import com.system.eisei.DaoImpl.LoginDaoImpl;
import com.system.eisei.dao.LoginDao;
import com.system.eisei.model.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet {
    Usuario user = new Usuario();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contraseña = request.getParameter("contrasena");
        user.setUsuario(usuario);
        user.setContraseña(contraseña);
        LoginDao ld = new LoginDaoImpl();
        Usuario u = ld.login(user);
        if(u.getUsuario()!=null){
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        }else{
            response.sendRedirect("bienvenida.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
