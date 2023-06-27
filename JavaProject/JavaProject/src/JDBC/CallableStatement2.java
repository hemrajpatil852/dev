package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatement2 {

	Connection con = null;
	PreparedStatement cs = null;
	Scanner sc = new Scanner(System.in);

	CallableStatement2() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();

	}

	void callProcedure() throws SQLException {



     cs=con.prepareStatement("insert into departments values (?,?,?,?)");
		System.out.println("Enter department  id");
		int d_id=sc.nextInt();
		System.out.println("Enter department name");
		String d_name=sc.next();
		System.out.println("Enter manager id ");
		int mag_id=sc.nextInt();
		System.out.println("Enter location id ");
		int loc_id=sc.nextInt();
		cs.setInt(1, d_id);
		cs.setString(2,d_name);
		cs.setInt(3,mag_id );
		cs.setInt(4,loc_id );
		int a=cs.executeUpdate();

		boolean b = cs.execute();

		if (true) {

		}
		ResultSet rs = cs.getResultSet();
		while (rs.next()) {

			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
		}

		boolean b1 = cs.getMoreResults();
		System.out.println("------");
		if (true) {
			ResultSet rs1 = cs.getResultSet();
			while (rs1.next()) {

				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatement2 cs = new CallableStatement2();
		cs.callProcedure();

	}

}
