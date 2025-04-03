<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String fname =request.getParameter ("Fname");
 String lname = request. getParameter ("Lname");
 String uid = request.getParameter("uid");
 String pwd = request. getParameter ("pwd");
 try
 {
 Class.forName ("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/archu","root","root");
PreparedStatement st= con.prepareStatement("insert into student values(?,?,?,?)");
st.setString (1, fname);
st.setString (2, lname);
st.setString(3, uid);
st.setString (4, pwd);
st.executeUpdate();
 }
catch(Exception e){out .print(e);}
%>
</body>
</html>
