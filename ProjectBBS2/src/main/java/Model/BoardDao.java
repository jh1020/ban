package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDao {
	Connection conn;
	ResultSet rs;
	PreparedStatement pstmt;
	
	public void getcon() {
		try {
			String dbURL="jdbc:mariadb://58.229.253.250:3306/student19";
			String dbID = "student19";
			String dbPassword = "1234!!";
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Vector<BoardBean> getAllBoard(int start, int end){
		Vector<BoardBean> v = new Vector<>();
		getcon();
		try {
			String SQL="select * from (select A.*,(@rownum := @rownum +1) as Rnum  from "
					+" (select *from board2 order by ref desc ,re_stop ASC) AS A,"
					+ " (SELECT @rownum:=0) tmp ) B"
					+ " where Rnum >= ? and Rnum <= ?";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardBean bean = new BoardBean();
				bean.setNum(rs.getInt(1));
				bean.setWrite(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getString(6));
				bean.setRef(rs.getInt(7));
				bean.setRe_stop(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContent(rs.getString(11));
				
					v.add(bean);
			}
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}
	
	public int getAllcount() {
		getcon();
		int count = 0;
		try {
			String sql = "select count(*) from board2";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
}
