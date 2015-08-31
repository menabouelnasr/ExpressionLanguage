

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class userInfo
 */
@WebServlet("/userInfo")
public class userInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String Firstname, Lastname,email;
		
		Firstname="Menatolla";
		Lastname= "Abouelnasr";
		email= "menabouelnasr3@gmail.com";
		
		User user = new User();
		user.setEmail(email);
		user.setFirstname(Firstname);
		user.setLastname(Lastname);
		
		Address address = new Address();
		address.setCity("Washington");
		address.setStreet("37 Lenape Trail");
		address.setZipCode("07882");
		address.setState("NJ");
		user.setAddress(address);
	
		//session.setAttribute("user", user);
		request.getSession().setAttribute("user", user);
	    getServletContext().getRequestDispatcher("/UserJSP.jsp").forward(request,response);
	}

}
