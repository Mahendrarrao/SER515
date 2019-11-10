package com.asu.ser515.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.asu.ser515.model.Quiz;
import com.asu.ser515.services.impl.DBConnServiceImpl;

/**
 * @author Kushagr Jolly
 * Nov 8, 2019
 */
@SuppressWarnings("serial")
public class StudentServlet extends HttpServlet {
	private int quiz_id;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		quiz_id = Integer.parseInt(req.getParameter("id"));
		DBConnServiceImpl serviceImpl = new DBConnServiceImpl();
		Quiz quiz= serviceImpl.getQuestion(quiz_id);
		HttpSession session = req.getSession(true);
		session.setAttribute("quiz", quiz);
		try {
			getServletContext().getRequestDispatcher("/student1.jsp").forward(req,res);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
