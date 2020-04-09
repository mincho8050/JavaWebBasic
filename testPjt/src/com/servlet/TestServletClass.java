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
public class TestServletClass extends HttpServlet { //HttpServlet ��ӹ���
	
	private static final long serialVersionUID = 1L;
       

    public TestServletClass() {
        super();

    }

    //servlet ����κ�
    //>service�� �̿��ص� �Ǵµ� �� ������� ����
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
	//> servlet�� �����Ǵ� �������� �۾��ϴ� �κ�
	//> �ַ� ������ �������� �α��� ���̵�� �н����带 ������ ��� �۾��� , �׻� ���������� �̷������ �۾�����
	@Override
		public void init() throws ServletException {
			System.out.println("-- init() --");
		}
	
	//destroy
	//> �ڿ�����, �� ������ ���ҽ��� �ٽ� �ݳ��� �� �۾��ϴ� �κ�
	@Override
		public void destroy() {
			System.out.println("-- destroy() --");
		}
	
	@PreDestroy
	public void funPd() {
		System.out.println("-- preDestroy() --");
	}

}
