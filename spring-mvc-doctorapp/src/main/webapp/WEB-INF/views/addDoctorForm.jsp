<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Doctor Details</h1>
	<br>
	<fieldset>
		<legend align="center">Doctor details</legend>
		<form action="addDoctor" method="post">
			<table align="left" border="2">
			<tr>
				<td>Enter Doctor Name</td>
				<td><input type="text" name="doctorName" placeholder="Enter Doctor Name"></td>
			</tr>
			<tr>
				<td>Enter Speciality</td>
				<td>
					<select name="speciality">
						<option value="ORTHO">ORTHOPEDIC</option>
						<option value="PEDIA">PEDIATRICIAN</option>
						<option value="PHYSICIAN">GENERAL PHYSICIAN</option>
						<option value="GYNAEC">ORTHOPEDIC</option>
						<option value="NEURO">NEUROLOGIST</option>
						<option value="DERMA">DERMATOLOGIST</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Enter Consultation  fees</td>
				<td><input type="number" name="fees" placeholder="Enter Consultation fees"></td>
			</tr>
			<tr>
				<td>Enter Experience</td>
				<td><input type="text" name="experience" placeholder="Enter Doctor Experience"></td>
			</tr>
			<tr>
				<td>Enter Ratings</td>
				<td><input type="text" name="ratings" placeholder="Enter Doctor Ratings"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
		</form>
	</fieldset>
</body>
</html>