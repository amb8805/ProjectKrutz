import java.sql.*;

public class test3 {

	
	private final String DBLocation = "";
	
	
	public static void main(String[] args) {
		test3 t3 = new test3();
		t3.Run();
	}
	
	
	public void Run(){
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:src/EvolutionOfAndroidApplications.sqlite");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      
	      stmt = c.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM APKInformation;" );
	      while ( rs.next() ) {
	      //   int id = rs.getInt("id");
	         
	         
	         
	        // String  name = rs.getString("name");
	       //  int age  = rs.getInt("age");
	       //  String  address = rs.getString("address");
	       //  float salary = rs.getFloat("salary");
	       //  System.out.println( "ID = " + id );
	       //  System.out.println( "NAME = " + name );
	      //   System.out.println( "AGE = " + age );
	      //   System.out.println( "ADDRESS = " + address );
	      //   System.out.println( "SALARY = " + salary );
	      //   System.out.println();
	      }
	      
	      rs.close();
	      
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	}

}
