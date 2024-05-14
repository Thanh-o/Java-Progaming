package Java2PracticalTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionDB {


    //Tao method tra ve 1 dt Connection
    public static Connection getMyConnection() throws SQLException {
        Connection conn = null;
        String hostName = "localhost";
        String dbName = "java2practicaltest";
        String userName = "root";
        String password = "";

        //String connection (chuoi ket noi)
        String connectionURL = "jdbc:mysql://"+hostName + ":3306/" + dbName;
        conn = DriverManager.getConnection(connectionURL,userName,password);
        return conn;
    }

//    public static void main(String[] args) throws SQLException {
//        Connection cn = getMyConnection();
//        if (cn!=null){
//            System.out.println("Ket noi thanh cong");
//        }
//    }
}
