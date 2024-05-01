package db_connect.comDbEx;


/*
 * jdbc 를 이용한 데이터베이스 연결
 * 
 * 1단계 : import java.sql.*;
 * 
 * 2단계 : 특정 데이터베이스 드라이브 검색
 * 			oracle.jdbc.driver.OracleDriver
 * 
 * 3단계: 데이터베이스 연결 
 * 			Connection conn = DriverManager.getConnection(url,id(디비),password)
 * 			jdbc: oracle:thin:@localhost:1521:sid(orcl)
 * 
 * 4단계 : 쿼리문 작성
 * 			1. Statement stmt =conn.createStatement();  정적
 * 			2.PreparedStatment pstmt = conn.prepareStatement(query);(동적)
 *  
 * 5단계 : 결과 저장
 * 		-- 정적 일때 --
 * 		ResultSet rs =  stmt.executeQuery(query) ; // select(조회,검색)
 * 		ResultSet rs =  stmt.executeUpdate(query) ; // insert,update,delete
 *	
 *			-- 동적일때--
 *			ResultSet rs =  pstmt.executeQuery(query) ; // select(조회,검색)
 * 		ResultSet rs =  pastmt.executeUpdate(query) ; // insert,update,delete
 * 
 * 6단계: 
 * 	   작업이 다 끝난 후 반드시 close()한다.
 * */
import java.sql.*; //1단계
public class JdbcEX01 {

	public static void main(String[] args) {
		
		Connection conn =null;
		Statement stmt =null;
		
		try {
			// jdbc 드라이브 메모리에 로드하기
			Class.forName("oracle.jdbc.driver.OracleDriver");// 2단계
			// 연결 객체 생성
			conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",
					"scott","tiger");
			System.out.println("데이터베이스 연결 성공.....");
			// Statement 객체성공
			stmt =conn.createStatement();
			
			//SQL 쿼리문 생성
		String sql =	"insert into department values(203,'컴퓨터공학과',200,'7호관')";
		 int result =  stmt.executeUpdate(sql) ;
		 	System.out.println(result + "개의 행이 추가 되었습니다.");
			}catch (ClassNotFoundException ce){
				ce.printStackTrace();
			} catch (SQLException s)  {
				s.printStackTrace();
			}finally {// 데이터베이스 연결 해제 및 닫기
				
				try {
					if (stmt !=null) stmt.close();
					} catch ( SQLException se) {
						se.printStackTrace();
			}
				
				
				try {
					if (conn !=null) conn.close();
					} catch ( SQLException se) {
						se.printStackTrace();
			}
		}
	}
}
