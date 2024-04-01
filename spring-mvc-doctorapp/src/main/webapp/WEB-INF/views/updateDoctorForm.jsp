<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.doctorapp.model.Doctor"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Doctor</title>
</head>
<body>
	<div>
		<h1>getting  the Doctor record</h1>
	</div>
	<br>
	<fieldset>
		<legend align="center">Update Doctor</legend>
			<form action="updateDoctor">
				<table align="left" border="2">
					<tr>
						<td>Enter DoctorId</td>
						<td><input type="number" name="doctorId" placeholder="enter the doctor id" value="${doctor.doctorId }" readonly></td>
					</tr>
					<tr>
						<td>Enter DocorName</td>
						<td><input type="text" name="doctorName" placeholder="enter the doctor name" value="${doctor.doctorName }" readonly></td>
					</tr>
					<tr>
					<td>Enter Speciality</td>
						<td>
							<select name="speciality" readonly>
								<option>${doctor.speciality }</option>
							</select>
						</td>
						</tr>
						<tr>
							<td>Enter Consultation  fees</td>
							<td><input type="number" name="fees" placeholder="fees" value="${doctor.fees }" ></td>
						</tr>
						<tr>
							<td>Enter Experience</td>
							<td><input type="text" name="experience" placeholder="Enter Doctor Experience" value="${doctor.experience }"  readonly></td>
						</tr>
						<tr>
							<td>Enter Ratings</td>
							<td><input type="text" name="ratings" placeholder="Enter Doctor Ratings" value="${doctor.ratings }" readonly></td>
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