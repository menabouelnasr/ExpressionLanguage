import javax.servlet.http.HttpSession;
public class User
{
	public String Firstname, Lastname,email;
	Address Address;
	public User()
	{
		super();
		
	}
	
	Address address= new Address();
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		address= Address;
	}

	public String getFirstname() 
	{
		return Firstname;
	}

	public void setFirstname(String firstname) 
	{
		Firstname = firstname;
	}

	public String getLastname() 
	{
		return Lastname;
	}

	public void setLastname(String lastname) 
	{
		Lastname = lastname;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
	

}
