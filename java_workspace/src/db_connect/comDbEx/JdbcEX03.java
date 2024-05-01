package db_connect.comDbEx;

import java.sql.*; //1단계
public class JdbcEX03 {

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
		String sql =	"delete  from department  where  dname='컴퓨터공학' ";
		
		
		int result =  stmt.executeUpdate(sql) ;
		 	System.out.println(result + "개의 삭제 되었습니다.");
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
