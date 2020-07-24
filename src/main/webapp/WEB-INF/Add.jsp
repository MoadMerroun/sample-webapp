<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Add</title>
</head>
<body>
	<form action="/sample-webapp/Add" method="POST">
		First Name: <input type="text" name="first_name"> Last Name: <input
			type="text" name="last_name" /> ID: <input type="text" name="ID">
		Phone Number: <input type="text" name="phone_number" /> <input
			type="submit" value="Submit" />
	</form>
	<%@ include file="menu.jsp"%>
</body>
</html>
