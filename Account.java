package alli;

public class Account 
{
	private User profile;
	private String username;
	private String password;
	
	public Account()
	{
		profile = new User();
		username = "";
		password = "";
	}
	
	
	public void newUser(User newUser)
	{
		profile = newUser;
	}
	public User getUser()
	{
		return profile;
	}
	
	
	public void setUsername(String userName)
	{
		username = userName;
	}
	public String getUsername()
	{
		return username;
	}
	
	public void setPassword(String passWord)
	{
		password = passWord;
	}
	public String getPassword()
	{
		return password;
	}
	
	
}
