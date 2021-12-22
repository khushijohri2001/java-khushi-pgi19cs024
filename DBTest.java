import java.sql.*;

public class DBTest
{
public static void main(String args[])
{
try
{
	// Load and register
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	//Establish connection
	Connection con=DriverManager.getConnection("Jdbc:Odbc:Faculty");
	//create the statement
	Statement st=con.createStatement();

//insert query
           String query1 = "insert into FacultyFeedback values (3,'Yash Kumawat',7,'C','Ram Sharma','Good')";
           String query4 = "insert into FacultyFeedback values (4,'Aakash Singh',10,'E','Seema Meena','Excellent')";
           String query5 = "insert into FacultyFeedback values (8,'Aakansha Sharma',7,'G','Megha Tank','Average')";
          // st.executeUpdate(query5);
//update query
         String query2 = "UPDATE FacultyFeedback SET Class=11 WHERE Student_Name='Aaku'";
        //st.executeUpdate(query2);
//delete query
         String query3 = "delete from FacultyFeedback where Student_Name='aaku'";
         //st.executeUpdate(query3);




//execute query
	String query="SELECT * from FacultyFeedback";

        ResultSet rs=st.executeQuery(query);
	//execute the query.
	System.out.println("\nStudent's_ID\tStudent's_Name\tClass\t  Section\tFaculty_Name\tFaculty_feedback");
	//process the query
	while(rs.next())
	{
         System.out.println("\n"+"\t"+rs.getString(1)+"\t"+rs.getString(2)+"\t  "+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
	}
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}