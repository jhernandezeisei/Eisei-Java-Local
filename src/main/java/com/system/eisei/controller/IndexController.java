package com.system.eisei.controller;

import com.system.eisei.DaoImpl.LoginDaoImpl;
import com.system.eisei.config.ConexionConfig;
import com.system.eisei.dao.LoginDao;
import com.system.eisei.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController extends HttpServlet {
    Usuario user = new Usuario();

    @RequestMapping(value = "/login")
    public ModelAndView index() {
        ModelAndView indexModel = new ModelAndView("index", "command", new Object());
        return indexModel;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        doPost(request, response);
    }
    
    @RequestMapping(value = "/Userlogin", method = RequestMethod.POST)
    protected void doPost(@RequestParam(value = "Usuario", required = false) String usuario,
            @RequestParam(value = "Contrasena", required = false) String contraseña,
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        user.setUsuario(usuario);
        user.setContraseña(contraseña);
        
        LoginDao ld = new LoginDaoImpl();
        Usuario u = ld.login(user);
        
        if(u.getUsuario()!=null){
            
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        }else{
            response.sendRedirect("index.jsp");
        }
        
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
