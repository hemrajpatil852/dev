package JDBC;

import java.sql.*;
import java.util.Scanner;

public class PreParedStatement {
	Connection con=null;
	PreparedStatement ps=null;
	Scanner sc=new Scanner(System.in);
	PreParedStatement() throws ClassNotFoundException, SQLException 
	{
		con= Connection1.getConnection();	
	}
	void insert() throws SQLException
	{
	ps=con.prepareStatement("insert into departments values (?,?,?,?)");
	System.out.println("Enter department  id");
	int d_id=sc.nextInt();
	System.out.println("Enter department name");
	String d_name=sc.next();
	System.out.println("Enter manager id ");
	int mag_id=sc.nextInt();
	System.out.println("Enter location id ");
	int loc_id=sc.nextInt();
	ps.setInt(1, d_id);
	ps.setString(2,d_name);
	ps.setInt(3,mag_id );
	ps.setInt(4,loc_id );
	int a=ps.executeUpdate();
	System.out.println(a+" row inserted");
	}
	
	void show() throws SQLException
	{
	Statement st=	con.createStatement();
	ResultSet rs=st.executeQuery("select * from departments");
	while(rs.next())
	{
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
	}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreParedStatement p=new PreParedStatement();
		p.insert();
		p.show();

	}

}

