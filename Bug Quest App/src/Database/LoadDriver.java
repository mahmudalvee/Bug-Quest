package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

public class LoadDriver {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
    	String url = "jdbc:mysql://localhost/bugquestappdb";
    	String username = "root";
    	String password = "";
    	String query = "SELECT * from users where id=1";
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection connection = DriverManager.getConnection(url, username, password);
    	
    	System.out.println("DB connected!");
    	Statement statement = connection.createStatement();
    	ResultSet result = statement.executeQuery(query);
    	
    	result.next();
    	
    	String name = result.getString("name");
    	System.out.println("Name: "+name);
    	
    	connection.close();
    	statement.close();
        
    }
}