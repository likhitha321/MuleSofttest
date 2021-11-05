import java.sql.*;
public class MovieInsertion {

	public static void main(String args[]) throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		String url="jdbc:sqlite:movies.db";
		Connection con=DriverManager.getConnection(url);
		if(con!=null)
		{
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create table movies(name text primary key,actor text,actress text,director text,yearofrelease int)");
		    System.out.println("table created");
		    
		    
		    stmt.executeUpdate("insert into movies values('Race Gurram','Allu Arjun','Shruti Haasan','Surender Reddy',2014)");
		    stmt.executeUpdate("insert into movies values('Arya','Allu Arjun','Anu Mehta','Sukumar',2004)");
		    stmt.executeUpdate("insert into movies values('Julayi','Allu Arjun','Lleana','Trivikram',2012)");
		    stmt.executeUpdate("insert into movies values('Happy','Allu Arjun','Genelia','A.Karunakaran',2006)");
		    stmt.executeUpdate("insert into movies values('Bunny','Allu Arjun','Gowri Munjal','V. V. Vinayak',2005)");
		    stmt.executeUpdate("insert into movies values('Temper','N.T.Rama Rao','Kajal','Puri Jagannadh',2015)");
		    stmt.executeUpdate("insert into movies values('Janatha Garage','N.T.Rama Rao','Samantha','Koratala Siva',2016)");
		    stmt.executeUpdate("insert into movies values('Nannaku Prematho','N.T.Rama Rao','Rakul','Sukumar',2016)");
		    stmt.executeUpdate("insert into movies values('Gabbar Singh','Pawan Kalyan','Shruti Haasan','Harish Shankar',2012)");
		    stmt.executeUpdate("insert into movies values('Kushi','Pawan Kalyan','Bhumika Chawla','S. J. Surya',2001)");
		    stmt.executeUpdate("insert into movies values('Jalsa','Pawan Kalyan','Parvati Melton','Trivikram',2008)");
		    stmt.executeUpdate("insert into movies values('Katamarayudu','Pawan Kalyan','Shruti Haasan','Kishore Kumar Pardasani',2017)");
		    stmt.executeUpdate("insert into movies values('Agnyaathavaasi','Pawan Kalyan','Keerthy Suresh','Trivikram',2018)");
		    stmt.executeUpdate("insert into movies values('Rangasthalam','Ram Charan','Samantha','Sukumar',2018)");
		    stmt.executeUpdate("insert into movies values('Yevadu','Ram Charan','Shruti Haasan','Vamshi Paidipally',2014)");
		    
		    ResultSet rs=stmt.executeQuery("select * from movies");
		    while(rs.next())
		    {
		    	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
		    }
		    
		    ResultSet rs1=stmt.executeQuery("select * from movies where actor='Allu Arjun'");
		    while(rs1.next())
		    {
		    	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
		    }
		    
		    
		    
		}
		else
		{
			System.out.println("connection to the driver is not successfull");
		}
		con.close();		
	}
}













