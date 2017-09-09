package com.cuhoney.smartframework;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloSerlvet
 */
@WebServlet("/hello")
public class HelloSerlvet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		DateFormat dft = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
		String currentTime = dft.format(new Date());
		request.setAttribute("currentTime", currentTime);
		request.getRequestDispatcher("/WEB-INF/jsp/helloword.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
