package com.bridgeit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.bridgeit.DAO.UserDAO;

/**
 * Servlet implementation class EmailValidation
 */
public class EmailValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");

	    PrintWriter out = response.getWriter();
	    JSONObject json = new JSONObject();
	    String availEmail = request.getParameter("email");
	    UserDAO user = new UserDAO();
		json.put("valid", false);
		if(availEmail!=null)
		{
			boolean flag = user.isExits(availEmail);
			System.out.println(flag);
			if (flag) {
	            json.put("valid", false);
	        }
	        else {
	            /*out.print("{\"valid\" : true }");*/
	            json.put("valid", true);
	           /* System.out.println("true");*/
	        }
		}
		System.out.println(json);
		out.println(json);
	}
}
