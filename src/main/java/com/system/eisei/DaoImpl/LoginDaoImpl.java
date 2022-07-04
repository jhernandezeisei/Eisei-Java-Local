package com.system.eisei.DaoImpl;

import com.system.eisei.config.ConexionConfig;
import com.system.eisei.dao.LoginDao;
import com.system.eisei.model.Usuario;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDaoImpl implements LoginDao {

    Usuario user = new Usuario();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public Usuario login(Usuario obj) {
        try {
            ConexionConfig c = new ConexionConfig();
            conn = c.getConnection();

            String sql = "{call SP_ObtenerUsuario(?,?)}";
            ps = conn.prepareCall(sql);
            System.out.println(sql);
            ps.setString(1, obj.getUsuario());
            ps.setString(2, obj.getContraseña());
            rs = ps.executeQuery();
            System.out.println(rs);

            while (rs.next()) {
                user.setUsuario(rs.getString(1));
                user.setContraseña(rs.getString(2));
                System.out.println("c:");
            }
            ps.close();
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return user;
    }

}