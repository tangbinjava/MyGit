package cn.com.dbu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
		private static final String DRV = "oracle.jdbc.driver.OracleDriver"; 
		private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		private static final String USERNAME = "admin";
		private static final String USERPWD = "abc123";
		
		private DBUtil(){
			
		}
		
		/** 加载驱动程序类 */
		static {
			try {
				Class.forName(DRV);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/** 按驱动程序获得连接 */
		public static Connection getConn() {
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(URL, USERNAME, USERPWD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		
		/** 断开连接，释放资源 */
		public static void free(Statement pstm, Connection conn){
			if(pstm != null){
				try {
					pstm.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		/** 断开连接，释放资源 */
		public static void free(ResultSet rs, Statement pstm, Connection conn){
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(pstm != null){
				try {
					pstm.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
}
