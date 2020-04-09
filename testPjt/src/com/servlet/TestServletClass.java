package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServletClass
 */
@WebServlet("/TSC")
public class TestServletClass extends HttpServlet { //HttpServlet 상속받음
	
	private static final long serialVersionUID = 1L;
       

    public TestServletClass() {
        super();

    }

    //servlet 실행부분
    //>service를 이용해도 되는데 잘 사용하지 않음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("-- doGet() --");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

	@PostConstruct
	public void postContruct() {
		System.out.println("-- postContruct --");
	}
	//init
	//> servlet이 생성되는 시점에서 작업하는 부분
	//> 주로 데이터 서버에서 로그인 아이디와 패스워드를 변수에 담는 작업들 , 항상 공통적으로 이루어지는 작업들을
	@Override
		public void init() throws ServletException {
			System.out.println("-- init() --");
		}
	
	//destroy
	//> 자원해제, 웹 서버의 리소스를 다시 반납할 때 작업하는 부분
	@Override
		public void destroy() {
			System.out.println("-- destroy() --");
		}
	
	@PreDestroy
	public void funPd() {
		System.out.println("-- preDestroy() --");
	}

}
