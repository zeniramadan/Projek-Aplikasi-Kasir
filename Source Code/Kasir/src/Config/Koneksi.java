
package Config;
import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    public static Connection koneksiDB() {
        try {
            String url="jdbc:mysql://localhost:3306/db_kasir";
            String user="root";
            String pass="";
            DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn=DriverManager.getConnection(url,user,pass);
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
