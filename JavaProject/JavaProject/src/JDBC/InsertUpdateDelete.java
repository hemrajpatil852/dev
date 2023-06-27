package JDBC;
import java.sql.*;

import com.Constructor.Demo;

public class InsertUpdateDelete {

	Connection con=null;
	Statement st;
	InsertUpdateDelete() throws ClassNotFoundException, SQLException
	{
	  con=Connection1.getConnection();
	}
	
	
	void insert() throws SQLException
	{
	st=	con.createStatement();
	int a=st.executeUpdate("insert into dept values(5,'sell')");
	System.out.println(a+" row inserted");	
	}
	
	void show() throws SQLException
	{
	st=	con.createStatement();
	ResultSet rs=st.executeQuery("select * from dept");
	
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
	}
	
	void update() throws SQLException
	{
		st=	con.createStatement();
		int a=st.executeUpdate("update departments set manager_id='100' where department_id=10");
		System.out.println(a+" row updated");
	}
	
	void delete() throws SQLException
	{
		st=	con.createStatement();
		int a=st.executeUpdate("delete from dept where id=4");
		System.out.println(a+" row deleted");
		
	}

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertUpdateDelete i=new InsertUpdateDelete();
		//i.insert();
		i.update();
		//i.delete();
		i.show();

	}

}

