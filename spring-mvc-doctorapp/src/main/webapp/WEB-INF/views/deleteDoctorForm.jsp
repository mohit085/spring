<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete doctor id</title>
</head>
<body>
	<div>
		<h1>Deleting a doctor record</h1>
	</div>
	<br>
	<fieldset>
		<legend align="center">Options</legend>
		<form action="deleteDoctor" method="post">
			<table align="left" border="1">
				<td><input type="number" name="doctorId" placeholder="enter doctor id"></td>
				<td><input type="submit" value="Delete"></td>
			</table>
			
		</form>
	</fieldset>
</body>
</html>