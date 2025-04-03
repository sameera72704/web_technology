<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>

<%@ page import="java.io.PrintWriter" %>



<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Login Page</title>

</head>

<body>

<%

PrintWriter pw = response.getWriter();

String uid = request.getParameter("uid");

String pwd = request.getParameter("pwd");

String errorMessage = null;



try {

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wt", "root", "root");

PreparedStatement st = con.prepareStatement("SELECT uid, pwd FROM student WHERE uid=? AND pwd=?");

st.setString(1, uid);

st.setString(2, pwd);

ResultSet rs = st.executeQuery();



if (rs.next()) {

pw.print("Login successful");

} else {

errorMessage = "Invalid credentials";

}



rs.close();

st.close();

con.close();

} catch (ClassNotFoundException | SQLException e) {

errorMessage = "An error occurred. Please try again later.";

e.printStackTrace(); // Log the exception

}



if (errorMessage != null) {

pw.println(errorMessage);

}

%>

</body>

</html>