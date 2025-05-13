<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="abc.css"></link>
</head>
<body style="background-image: url('bg1.jpg');">
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
    <form action="/login2" >
        <table class="center">
            <caption>Registration PAGE</caption>
            <tr>
                <td>
                    Enter Id
                </td>
                <td>
                    <input type="text" class="A" name="id" placeholder="Enter ID">
                </td>
            </tr>
            <tr>
                <td>
                    Enter Name
                </td>
                <td>
                    <input type="text" class="A" name="name" placeholder="Enter Name">
                </td>
            </tr>
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
                    <input type="password" class="A" name="password" placeholder="Enter Password">
                </td>
            </tr>
            <tr>
                <th colspan="2">Already have an account?
                <a href="/login">SignIn</a></th>
           </tr>
            <tr>
                <th colspan="2">
                    <input type="submit" class="B" value="REGISTRATION">
                </th>
            </tr>
        </table>
    </form>
    </div>
</body>
</html>