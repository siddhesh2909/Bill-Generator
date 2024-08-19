package shop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shop.model.Product;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/ProductController")
public class FirstServlet extends HttpServlet {
	List<Product> lst=null;
	private static final long serialVersionUID = 1L;
	public void init(){
		lst = new ArrayList<Product>();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int proId = Integer.parseInt(request.getParameter("proId"));
		String proName = request.getParameter("proName");
		double proPrice = Double.parseDouble(request.getParameter("proPrice"));
		int proQnt = Integer.parseInt(request.getParameter("proQnt"));
		
		Product pobj = new Product(proId, proName, proPrice, proQnt);
		
		
		lst.add(pobj);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("data", lst);
		response.sendRedirect("SecondServlet");
		
		
	}

}
