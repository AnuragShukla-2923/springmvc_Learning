<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./empInfo" method="post">
  <label for="Ename">Name:</label>
  <input type="text"  name="name" placeholder="Enter Name"/><br><br>
   <label for="Eage">Age:</label>
  <input type="text"  name="age" placeholder="Enter Age"/><br><br>
   <label for="Eaddress">Address</label>
  <input type="text"  name="address" placeholder="Enter Address"/><br><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>