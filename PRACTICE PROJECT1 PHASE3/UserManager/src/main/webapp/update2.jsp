

<html>
<head>
	<style>
	table, th, td {
	  border: 1px solid black;
	  margin: auto;
	}
	.center {
  		text-align: center;
  		align-items:center;
  	}
  	a{
  	text-decoration:None;
  	color:black;}
	</style>
</head>
<body>
	<div class="center">
		<h2>Successfully Updated User</h2>
		
		<p> User ID: ${IDedit}</p>
		<div>
			<table style="float:inherit">
			   <tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
			   <c:forEach items="${user}" var="userE" varStatus="count">
			    <tr id="${count.index}">
			    	<td>${userE.id}</td>
			        <td>${userE.name}</td>
			        <td>${userE.email}</td>
			        <td>${userE.password}</td>
			    </tr>
				</c:forEach>
			</table>
		</div>
		<br><br>
		<h3>Return to Homepage</h3>
		<div>
		<button><a href="/">Return</a></button>
			
		</div>
	</div>
</body>
</html>
