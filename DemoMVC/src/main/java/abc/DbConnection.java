package abc;
import java.sql.*;
public class DbConnection {
Connection con;
Statement stmt;
public DbConnection() throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/table2","root","root");
	stmt=con.createStatement();
}
void executeSQL(String sql) throws Exception {
	stmt.executeUpdate(sql);
}
ResultSet getData(String sql) throws Exception{
	ResultSet rs;
	rs=stmt.executeQuery(sql);
	return rs;
}
void closeDb()throws Exception{
	con.close();
}
}
