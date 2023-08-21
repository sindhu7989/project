<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Generate OTP</title>
</head>
<body>
    <h2>Generate OTP</h2>
    <form action="/auth/generate-otp" method="post">
        Phone Number:<input type="text" id="phoneNumber" name="phoneNumber" required>
        <button type="submit">Generate OTP</button>
    </form>
</body>
</html>

