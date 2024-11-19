<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="register" method="post">
    Username: <input type="text" name="user_name" id="user_name" placeholder="Username">
    <br>
    Password: <input type="password" name="password" id="password" placeholder="Password">
    <br>
    Fullname: <input type="text" name="full_name" id="full_name" placeholder="Full Name">
    <br>
    Phone: <input type="text" name="phone_number" id="phone_number" placeholder="Phone number">
    <br>
    Gender:
        <input type="radio" name="gender" value="male">Male
        <input type="radio" name="gender" value="male">Female
    <br>
    Date of Birth: <input type="date" name="date_of_birth" id="date_of_birth">
    <br>
    Role:
    <select name="role" id="role">
        <option value="user">User</option>
        <option value="admin">Admin</option>
    </select>
    <input type="submit" value="Register">
    <a href="../webapp/Login.jsp">Login</a>
</form>
</body>
</html>
