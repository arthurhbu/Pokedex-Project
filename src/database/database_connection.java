package database;
import java.sql.DriverManager;
import java.sql.Connection;


public class database_connection {
    
    private static final String username = "root";
    private static final String password = "175839123zx";
    private static final String mysqlUrl = "jdbc:mysql://localhost/pokemon_database";
            
    public static Connection createConnection() throws Exception { 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(mysqlUrl, username, password);
        return conexao;
    }
    
    public static void main(String[] args) throws Exception{
        Connection con = createConnection();
        
        if(con != null){
            System.out.println("Success connection with database");
        }
        else { 
            System.out.println("Connection failed");
        }
    }       
}
