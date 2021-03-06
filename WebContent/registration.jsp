<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<div class="container">
		<form action="${pageContext.request.contextPath}/process-registration.jsp" method="post">
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Detail</th>
						<th scope="col">Value</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"
							placeholder="Enter the name" /></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="email" name="email"
							placeholder="Enter the email" /></td>
					</tr>
					<tr>
						<td>Mobile</td>
						<td><input type="text" name="mobile"
							placeholder="Enter the mobile number" /></td>
					</tr>
					<tr>
						<td>Age</td>
						<td><input type="number" name="age"
							placeholder="Enter your age" /></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><input type="radio" name="gender" value="Male" /> Male
							&nbsp;&nbsp; <input type="radio" name="gender" value="Female" />
							Female</td>
					</tr>
					<tr>
						<td>Courses</td>
						<td><input type="checkbox" name="courses" value="Module 1" />
							Core Java &nbsp;&nbsp; <input type="checkbox" name="courses"
							value="Module 2" /> Advance Java &nbsp; &nbsp; <input
							type="checkbox" name="courses" value="Module 3" /> Java
							Frameworks</td>
					</tr>
					<tr>
						<td>City</td>
						<td><select name="city">
								<option value="">---Select---</option>
								<option value="Bengaluru">Bengaluru</option>
								<option value="Delhi">Delhi</option>
								<option value="Hyderabad">Hyderabad</option>
								<option value="Chennai">Chennai</option>
								<option value="Berhampur">Berhampur</option>
								<option value="Kolkata">Kolkata</option>
								<option value="Jabalpur">Jabalpur</option>
						</select></td>
					</tr>
					<tr>
						<td>Comment</td>
						<td><textarea rows="5" cols="50" name="comment"></textarea></td>
					</tr>
					<tr>
						<td><input type="reset" value="Reset" /></td>
						<td><input type="submit" value="Register Me" /> </td>
					</tr>
				</tbody>
			</table>
		</form>




		<h1>Bootstrap form</h1>

		<form>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Email</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="Email"
						name="email">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Password</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Password"
						name="password">
				</div>
			</div>
			<div class="form-group">
				<label for="inputAddress">Address</label> <input type="text"
					class="form-control" id="inputAddress" placeholder="1234 Main St"
					name="street1">
			</div>
			<div class="form-group">
				<label for="inputAddress2">Address 2</label> <input type="text"
					class="form-control" id="inputAddress2"
					placeholder="Apartment, studio, or floor" name="street2">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputCity">City</label> <input type="text"
						class="form-control" id="inputCity" name="city">
				</div>
				<div class="form-group col-md-4">
					<label for="inputState">State</label> <select id="inputState"
						class="form-control">
						<option selected>Choose...</option>
						<option>...</option>
					</select>
				</div>
				<div class="form-group col-md-2">
					<label for="inputZip">Zip</label> <input type="text"
						class="form-control" id="inputZip">
				</div>
			</div>
			<div class="form-group">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" id="gridCheck">
					<label class="form-check-label" for="gridCheck"> Check me
						out </label>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Sign in</button>
		</form>
	</div>
</body>
</html>