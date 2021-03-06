package User;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	private Connection conn; //?λ°μ? ?°?΄?°λ² μ΄?€λ₯? ?°κ²?
	private PreparedStatement pstmt; //μΏΌλ¦¬λ¬? ??κΈ? λ°? ?€? 
	private ResultSet rs; //κ²°κ³Όκ°? λ°μ?€κΈ?
	
	//κΈ°λ³Έ ??±?
	//UserDAOκ°? ?€??λ©? ???Όλ‘? ??±?? λΆ?λΆ?
	//λ©μ?λ§λ€ λ°λ³΅?? μ½λλ₯? ?΄κ³³μ ?£?Όλ©? μ½λκ°? κ°μ???€
	public UserDAO() {
		try {
			String dbURL = "jdbc:mariadb://58.229.253.250:3306/student05";
			String dbID = "student05";
			String dbPassword = "1234!!";
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//λ‘κ·Έ?Έ ??­
	public int login(String userID, String userPassword) {
		String sql = "select userPassword from USER where userID = ?";
		try {
			pstmt = conn.prepareStatement(sql); //sqlμΏΌλ¦¬λ¬Έμ ??κΈ? ??¨?€
			pstmt.setString(1, userID); //μ²«λ²μ§? '?'? λ§€κ°λ³??λ‘? λ°μ?¨ 'userID'λ₯? ???
			rs = pstmt.executeQuery(); //μΏΌλ¦¬λ₯? ?€?? κ²°κ³Όλ₯? rs? ???₯
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword)) {
					return 1; //λ‘κ·Έ?Έ ?±κ³?
				}else
					return 0; //λΉλ?λ²νΈ ??λ¦?
			}
			return -1; //??΄? ??
		}catch (Exception e) {
			e.printStackTrace();
		}
		return -2; //?€λ₯?
		}
	public int join(User user) {
		  String sql = "insert into USER values(?, ?, ?, ?, ?)";
		  try {
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, user.getUserID());
		    pstmt.setString(2, user.getUserPassword());
		    pstmt.setString(3, user.getUserName());
		    pstmt.setString(4, user.getUserGender());
		    pstmt.setString(5, user.getUserEmail());
		    return pstmt.executeUpdate();
		  }catch (Exception e) {
		 	e.printStackTrace();
		  }
		  return -1;
		}
	
	
	
	
	
}