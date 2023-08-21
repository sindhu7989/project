<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="/auth/login" method="post">
        Phone Number:
        <input type="text" id="phoneNumber" name="phoneNumber" required><br>
        OTP:
        <input type="text" id="otp" name="otp" required><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
