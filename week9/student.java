
import java.io.*;

import java.sql.*;



import javax.servlet.*;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.*;

/**

* Servlet implementation class Student

*/

@WebServlet("/Student")

public class Student extends HttpServlet {

protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

res.setContentType("text/html");

PrintWriter out = res.getWriter();

String Fname = req.getParameter("Fname");

String Lname = req.getParameter("Lname");

String uid = req.getParameter("uid");

String pwd = req.getParameter("pwd");

out.println("<html><body>");

out.println("<p>FirstName: " + Fname + "</p>");

out.println("<p>LastName: " + Lname + "</p>");

out.println("<p>uid: " + uid + "</p>");

out.println("<p>Password: " + pwd + "</p>");



Connection con = null;

PreparedStatement st = null;

try {

Class.forName("com.mysql.cj.jdbc.Driver");

con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sameera", "root", "root");

st = con.prepareStatement("INSERT INTO student (Fname,Lname,uid,pwd) VALUES (?,?,?, ?)");

st.setString(1, Fname);

st.setString(2, Lname);

st.setString(3, uid);

st.setString(4, pwd);

st.executeUpdate();

} catch (Exception e) {

out.println(e);

}

out.println("</body></html>");

}}


