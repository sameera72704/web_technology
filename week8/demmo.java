package jdbcDemo;
import java.sql.*;

public class demmo {
public static void main(String[] args) throws ClassNotFoundException,SQLException
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sameera","root","root");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from login");
while(rs.next())
{
System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));

}
con.close();
}

}
