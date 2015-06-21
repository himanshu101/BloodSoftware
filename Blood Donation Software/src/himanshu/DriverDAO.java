package himanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverDAO {
	
	private Connection conn;
	
	public DriverDAO() throws Exception{
		// TODO Auto-generated constructor stub
		
		String url = "jdbc:mysql://localhost:3306/blood_donation";
		String password = "";
		
		conn = DriverManager.getConnection(url, "root", password);
	}
	
	public void insertData(Driver driver) throws SQLException{
		
		PreparedStatement stat = null;
		
		String sql = "INSERT INTO driver(first_name, middle_name, last_name, sex, pincode, city, state, "
				+ "country, email, address, dl_no, doj, mobile_no) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try{
			stat = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			stat.setString(1, driver.getFirst_name());
			stat.setString(2, driver.getMiddle_name());
			stat.setString(3, driver.getLast_name());
			stat.setString(4, driver.getSex());
			stat.setString(5, driver.getPincode());
			stat.setString(6, driver.getCity());
			stat.setString(7, driver.getState());
			stat.setString(8, driver.getCountry());
			stat.setString(9, driver.getEmail());
			stat.setString(10, driver.getAddress());
			stat.setString(11, driver.getDl_no());
			stat.setString(12, driver.getDob());
			stat.setString(13, driver.getMobile_no());
			stat.executeUpdate();
		}
		finally{
			close(null, stat, null);
		}
	}

	private void close(Connection conn, Statement stat, ResultSet rs) throws SQLException{
		if(conn != null)
			conn.close();
		if(stat != null)
			stat.close();
		if(rs != null)
			rs.close();
	}
}
