<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="abc.css"></link>
</head>
<body style="background-image: url('bg4.jpg');">
   <div id="mymenu">
    <ul>
        <li>Home</li>
        <li>Login</li>
        <li>Registration</li>
        <li>About</li>
        <li>Contact</li>
    </ul>
   </div>
   <div id="mydata">
    <form action="/home">
        <table class="center">
            <caption>LOGIN PAGE</caption>
            <tr>
                <td>
                    Enter UserName
                </td>
                <td>
                    <input type="text" class="A" name="username" placeholder="Enter UserName">
                </td>
            </tr>
            <tr>
                <td>
                    Enter Password
                </td>
                <td>
                    <input type="text" class="A" name="password" placeholder="Enter Password">
                </td>
            </tr>
            <tr>
                <th colspan="2">Need an account?
                <a href="/register">SignUp</a></th>
           </tr>
            <tr>
                <th colspan="2">
                    <input type="submit" class="B" value="LOGIN">
                </th>
            </tr>
        </table>
    </form>
    </div>
</body>
</html>