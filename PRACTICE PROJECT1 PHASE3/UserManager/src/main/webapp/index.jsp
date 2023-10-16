
<html>
<head>
	<style>
		.center {
	  		text-align: center;
	  		align-items:center;
	  		
	  	}
	  	a{
	  	text-decoration:None;
	  	color:black;
	  	}
	  	
	  	
	</style>
</head>
<body>
	<div class="center">
		<h1>User Manager</h1>
		
		<h2 class="hello-title">Search for a User and Update Information</h2>
		
		
		<br><br>
		<form method="post" action="update.jsp">
			Enter id : <input type="text" id="id" name="id" placeholder="Type here" required>
			<br>
			<br>
			<input type="submit" value="Submit" /> &nbsp;&nbsp;&nbsp;
			<button><a href="/users.jsp">View user table</a></button>
		</form>
	</div>
</body>
</html>
