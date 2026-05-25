package com.myloginapp;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.User;

import com.fasterxml.jackson.databind.ObjectMapper;

import DAOImplementation.ManageUserDAO;
import DAOInterface.ManageUserInterface;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Users;

public class RegisterServlet extends HttpServlet{
	
	ManageUserInterface manageUser = new ManageUserDAO();
	
	void Cors(HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
		resp.setHeader("Access-Control-Max-Age","86400");
		resp.setContentType("application/json");
	}
	
	@Override
	protected void doOptions(
	        HttpServletRequest req,
	        HttpServletResponse resp)

	        throws ServletException, IOException {

	    Cors(resp);

	    resp.setStatus(HttpServletResponse.SC_OK);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cors(resp);
		
		PrintWriter out = resp.getWriter();
		
		ObjectMapper mapper = new ObjectMapper();
		
		Users user = mapper.readValue(req.getReader(), Users.class);
		
		Boolean validate = manageUser.registerUser(user);
		
		if(validate) {
			out.print("user registered");
		}
		else
			out.print("user registration fail");
		
	}
}
