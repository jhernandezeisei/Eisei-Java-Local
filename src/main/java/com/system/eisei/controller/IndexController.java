package com.system.eisei.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView indexModel = new ModelAndView("index", "command", new Object());
        
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String connectionUrl =
//                    "jdbc:sqlserver://EDGO-026\\SQLEXPRESS;"
//                            + "database=JAVALOCALEISEI;"
//                            + "user=sa;"
//                            + "password=Eiseidgo2022;";
//        } catch (Exception e) {
//            
//        }
        
//        String connectionUrl = "jdbc:sqlserver://EDGO-026\\SQLEXPRESS;"
//                                    + "database=JAVALOCALEISEI;"
//                                    + "user=sa;"
//                                    + "password=Eiseidgo2022;";
//        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
//            // Code here.
//            System.out.println("Conexión a BD exitosa.");
//            
//        }
//        // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            System.out.println(e);
//            e.printStackTrace();
//        }
        
        return indexModel;
    }
}
