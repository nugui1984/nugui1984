package javamysql;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt;
        String usuario = "root";
        String contrasena = "1234";
        String bd = "guillem24";
        String ip = "localhost";
        String puerto = "3306";

        String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }
}
