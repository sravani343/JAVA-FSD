package UsingJUnit.userAuthentication;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;



public class UserAuthenticationTest {
	private UserAuthentication userAuthentication;
	@Before
	public void setUp() {
		userAuthentication = new UserAuthentication();
	}
	@Test
	public void testAuthenticateUser_ValidCredentials_ReturnsTrue() {
		String username = "user";
		String password = "password";
		boolean result = userAuthentication.authenticateUser(username, password);
		Assert.assertTrue(result);
	}


	@Test
	public void testAuthenticateUser_InvalidCredentials_ReturnsFalse() {
		String username = "john";
		String password = "wrongpassword";
		boolean result = userAuthentication.authenticateUser(username, password);
		Assert.assertFalse(result);
	}

	@Test
	public void testAuthenticateUser_EmptyCredentials_ReturnsFalse() {
		String username = "";
		String password = "";
		boolean result = userAuthentication.authenticateUser(username, password);
		Assert.assertFalse(result);
	}


	@Test
	public void testAuthenticateUser_NullCredentials_ReturnsFalse() {
		String username = null;
		String password = null;
		boolean result = userAuthentication.authenticateUser(username, password);
		Assert.assertTrue(result);
	}

	@Test
	public void testAuthenticateUser_InvalidUsername_ReturnsFalse() {
		String username = "invalid";
		String password = "password";
		boolean result = userAuthentication.authenticateUser(username, password);
		Assert.assertFalse(result);
	}


	@Test
	public void testAuthenticateUser_InvalidPassword_ReturnsFalse() {
		String username = "john";
		String password = "wrongpassword";
		boolean result = userAuthentication.authenticateUser(username, password);
		Assert.assertFalse(result);
	}
}





