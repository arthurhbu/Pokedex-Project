package database;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
        

public class insertImageintoDatabase {
    
    static String sql_code = "UPDATE `pokemon_database`.`pokemon_infos` SET img = ? where id = ?";
            
//    public static void main(String args[]) throws Exception{
//        Connection connection;
//        PreparedStatement pstm;
//        int i = 1;
//        try{
//            connection = database_connection.createConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultset = statement.executeQuery(sql_code);
//            
//            while(resultset.next()){
//                System.out.println(i);
//                connection = database_connection.createConnection();
//                pstm = connection.prepareStatement(sql_code);
//                
//                //Inserting Blob type
//                String string = String.format("C:\\Users\\Arthur\\Desktop\\home\\%2d.png", i);
//                InputStream in = new FileInputStream(string);
//                pstm.setBlob(1, in);
//                pstm.setInt(2, i);
//                //Executing the statement
//                pstm.execute();
//                System.out.println("Record inserted......");
//            }
//        }
//        catch(Exception e){
//            System.out.println("Erro");
//        }
//    }
    
   public static void main(String args[]) throws Exception{
      //Registering the Driver
      //Getting the connection
        Connection connection;
        PreparedStatement pstm;
        
        try {
        connection = database_connection.createConnection();
        pstm = connection.prepareStatement(sql_code);
       
        for (int i = 1; i < 802; i++){
            //Inserting Blob type
            String string = String.format("C:\\Users\\Arthur\\Desktop\\spritegif\\%d.gif", i);
            System.out.println(string);
            InputStream in = new FileInputStream(string);
            pstm.setBlob(1, in);

            pstm.setInt(2, i);
            //Executing the statement
            pstm.execute();
            System.out.println("Record inserted......");
        }
        }catch(Exception e) { 
            System.out.println("Erro");
        }
   }
}

