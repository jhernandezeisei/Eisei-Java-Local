import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author jesus.hernandez
 */
public class Pruebaconeccion {
    
    public static void main(String[] args) {
        try {
            
            String connectionUrl =
                    "jdbc:sqlserver://localhost:1433;"
                            + "database=Agenda;"
                            + "user=sa;"
                            + "password=Agen123;"
                            + "trustServerCertificate=true";
            
            Connection con = DriverManager.getConnection(connectionUrl);
            System.out.println("Conexión a BD exitosa.");
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Usuarios");
            //String sql ="select * from UsuariosPrueba";

            //creating PreparedStatement object to execute query
            //PreparedStatement preStatement = con.prepareStatement(sql);

            //ResultSet result = preStatement.executeQuery();
            
            System.out.println("Consulta exitosa.");
            
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Usuario: " + rs.getString(2));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
