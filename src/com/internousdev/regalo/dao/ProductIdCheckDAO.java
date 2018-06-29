package com.internousdev.regalo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.regalo.util.DBConnector;

public class ProductIdCheckDAO {




	public boolean existsProductId(int product_id) throws SQLException {

		DBConnector db = new DBConnector();

		Connection con = db.getConnection();

		boolean result = false;

		String sql = "SELECT COUNT(*) AS COUNT FROM product_info WHERE product_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, product_id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				System.out.println(rs.getInt("COUNT"));

				int i = rs.getInt("COUNT");

				if(i != 0) {
					result = true;
					System.out.println("result true");
				}
			}


		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}return result;
	}

}



