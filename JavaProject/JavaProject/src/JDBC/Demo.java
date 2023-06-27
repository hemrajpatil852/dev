package JDBC;

//1) 
import java.sql.*;

public class Demo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 2)

		Class c = null;
		Connection con = null;
		try {
			c = Class.forName("com.mysql.cj.jdbc.Driver");
			// 3)
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newschema?autoReconnect=true&useSSL=false",
					"root", "Hemraj@19");
			System.out.println("connection established");
			// 4)
			Statement st = con.createStatement();
			// 5)
			ResultSet rs = st.executeQuery("select * from dept");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			con.close();
		} catch (SQLException e) {

			System.out.println("connection not established");
			e.printStackTrace();

		}

		
	}

}
