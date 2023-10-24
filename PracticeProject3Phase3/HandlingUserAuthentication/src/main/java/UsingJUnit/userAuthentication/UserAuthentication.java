package UsingJUnit.userAuthentication;

public class UserAuthentication {


	public boolean authenticateUser(String username, String password) {
		if (username==null&&password==null ||username.equals("user") && password.equals("password")) {
			return true;
		} 
		else 
		{
			return false;
		}
	}
}
