<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	td{
	padding : 20px;
	}
	a{
		padding  :20px;
		margin : 20px;
	}
</style>
</head>
<body>
	<h1>Admin Dashboard</h1>
	<br>
	<fieldset>
		<legend align="center">Options</legend>
			<table align="left" border="2">
				<tr>
					<td>Add Doctor</td>
					<td><a href="add-doctor-form"><button>Add a Doctor</button></a></td>
				</tr>
				<tr>
					<td>Delete Doctor</td>
					<td><a href="delete-doctor-form"><button>Delete a Doctor</button></a></td>
				</tr>
				<tr>
					<td>Update Doctor</td>
					<td><a href="edit-doctor-form"><button>Update a Doctor</button></a></td>
				</tr>
			</table>
	</fieldset>	
</body>
</html>