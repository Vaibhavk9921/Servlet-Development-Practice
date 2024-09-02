package abc;
import java.sql.ResultSet;
public class MyModel {
public boolean check(String uname,String password) throws Exception{
	String sql="select * from login_credentials where username='"+uname+"'and password='"+password+"'";
	DbConnection ob=new DbConnection();
	ResultSet rs=ob.getData(sql);
	if(rs.next()) {
		ob.closeDb();
		return true;
	}
	ob.closeDb();
	return false;
}
public void register(String uname,String password) throws Exception{
	String sql="insert into login_credentials values('"+uname+"','"+password+"')";
	DbConnection ob=new DbConnection();
	ob.executeSQL(sql);
	ob.closeDb();
}
}
