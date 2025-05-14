<%@ page import="com.example.demo.entity.User" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="abc.css"></link>
</head>
<body style="background-image: url('bg3.jpg');">
   <div id="mymenu">
    <ul>
        <li><a href="menu.html">Home</a></li>
        <li><a href="insertdemo.html">Insert</a></li>
        <li><a href="ShowAll">Show</a></li>
        <li><a href="searchdemo.html">Search</a></li>
        <li><a href="updatedemo.html">Update</a></li>
        <li><a href="deletedemo.html">Delete</a></li>
        <li><a href="login.html">LogOut</a></li>
        <li>About</li>
        <li>Contact</li>
    </ul>
   </div>
   <div>
        <%
            User user = (User)request.getAttribute("user");
            if (user != null) {
            	%>
            	    <div class="user-info">
            	     
            	        <h2 style="text-align:center;">User Information</h2>
            	        <table class="center" style="background-color: lightgreen;">
            	            <tr><td>ID:</td><td><%= user.getId() %></td></tr>
            	            <tr><td>Name:</td><td><%= user.getName() %></td></tr>
            	            <tr><td>Username:</td><td><%= user.getUsername() %></td></tr>
            	       
            	        </table>
            	    </div>
            	<%
            	    } else {
            	%>
            	    <p style="text-align:center;">No user data found.</p>
            	<%
            	    }
            	%>
        
   </div>
</body>
</html>