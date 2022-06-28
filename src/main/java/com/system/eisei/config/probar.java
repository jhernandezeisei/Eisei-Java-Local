package com.system.eisei.config;

import java.io.IOException;

public class probar {
   
    public static void main(String[] args) throws IOException {
        ConexionConfig c = new ConexionConfig();
        c.getConnection();

        if (c.getConnection() != null) {
            System.out.println("conexion exitosa");
        } else {
            System.out.println("conexion erronea");
        }
    }
    
}
