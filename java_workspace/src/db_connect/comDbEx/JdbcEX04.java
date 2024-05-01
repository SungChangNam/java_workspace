package db_connect.comDbEx;

import java.sql.*; //1단계
public class JdbcEX04 {

	public static void main(String[] args) {
		
		Connection conn =null;
		Statement stmt =null;
		
		ResultSet rs= null;
		/*
		 * resultSet
		 * 	-select쿼리의 수행결과로 얻어진 결과 집합을 추상화한 것임
		 * 	ResultSet 은 결과집합에서 데이터를 가져올수 있는 다양한
		 * 	메소드와 커서를 포함하고 있음 
		 * */
		
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
		String sql =	"select deptno, dname, college , loc from department";
		/*
		 * 실행하고자 하는 sql문이 select 쿼리인 경우 쿼리의 실행 결과의 집합을 
		 * 리턴받을 수 있는 executeQuery() 메소드 호출
		 * */
		
		rs = stmt.executeQuery(sql);
		
		/*
		 * rs 객체로 부터 테이터를 추출함 
		 * 
		 * rs 객체의 next() method 통해서 커서를 다음으로 이동시키며
		 * 행이 존재하면 true ,존재하지 않으면 false를 반환함
		 * 
		 * */
		while (rs.next()) {// 행이 존재한다면
			/* 커서가 위치한 행의 각각의 컬럼에서 값을 추출함
			 * 값을 추출할때 getxxx(컬럼위치),getxxx(커럼이름)메소드를 이용하여
			 * 컬럼 값 추출함
			 * 
			 * */
			int i = rs.getInt(1); //rs.getInt("deptno");
			String s1= rs.getString(2);//rs.getString("dname")
			int j = rs.getInt(3); //rs.getInt("college");
			String s2= rs.getString(4);//rs.getString("loc")
			System.out.println(i+"\t"+s1+"\t"+j+"\t"+s2);
			
		}
		
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
					if (conn !=null) rs.close();
					} catch ( SQLException se) {
						se.printStackTrace();
			}
		}
	}
}
