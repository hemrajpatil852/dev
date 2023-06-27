package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatch {
	Connection con = null;

	AddBatch() throws ClassNotFoundException, SQLException {
		con = Connection1.getConnection();
	}

	void add() throws SQLException {
		Statement st = con.createStatement();
		st.addBatch("insert into dept values(5,'management')");
		st.addBatch("insert into dept values(6,'it')");
		st.addBatch("update dept set id=7 where name='dev'");
		st.addBatch("delete from dept where id=1");

		int a[] = st.executeBatch();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "row affected");
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AddBatch a = new AddBatch();
		a.add();

	}
}