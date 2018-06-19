package Pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String cs="jdbc:mysql://localhost:3306/batch1";
		Connection conn=DriverManager.getConnection(cs,"root","root");
		if(conn != null)
			System.out.println("connected......");
		else
			System.out.println("not connected.....");
		
	}

}
