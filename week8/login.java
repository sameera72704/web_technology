
import java.io.*;

import java.sql.*;

import javax.servlet.*;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.*;

@WebServlet("/login")

public class login extends HttpServlet {

protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

res.setContentType("text/html");

PrintWriter out = res.getWriter();

String Uname = req.getParameter("Uname");

String Pwd = req.getParameter("Pwd");

Connection con = null;

PreparedStatement st = null;

ResultSet rs = null;

try {

Class.forName("com.mysql.cj.jdbc.Driver");

con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wt", "root", "root");

st = con.prepareStatement("SELECT * FROM reg WHERE Uname=? AND Pwd=?");

st.setString(1, Uname);

st.setString(2, Pwd);

rs = st.executeQuery();

if (rs.next()) {

out.println("<p>Welcome, " + Uname + "! You are a valid user.</p>");

} else {

out.println("<p>" + Uname + ", you are not an authenticated user.</p>");

}

} catch (Exception e) {

out.println("An error occurred: " + e.getMessage());

e.printStackTrace();}

out.close();

}}
