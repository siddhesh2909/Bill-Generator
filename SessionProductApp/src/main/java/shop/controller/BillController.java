package shop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.KeyStore.Entry.Attribute;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shop.model.Bill;
import shop.model.Product;

/**
 * Servlet implementation class BillController
 */
@WebServlet("/BillController")
public class BillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int BillNumber = 9999;
	java.util.Date billDate = new java.util.Date();
	double total = 0;
	double cgst=0;
	double sgst=0;
	double FinalTotal =0;
	
	HttpSession session = request.getSession();
	
	List<Product> lst =(List<Product>) session.getAttribute("data");
	
	PrintWriter pw = response.getWriter();
	
	pw.println("<h1> Final List </h1>");
	for(Product p : lst)
	{
		total = total + (p.getProPrice()*p.getProQnt());
		
	}
	cgst = total* 0.6;
	sgst = total * 0.6;
	 FinalTotal = total+ cgst+sgst;
	 Bill billobj = new Bill(BillNumber, billDate, total, cgst, sgst, FinalTotal);
	 List<Bill> lstbill = new ArrayList<Bill>();
	 lstbill.add(billobj);
	 
	 session.setAttribute("bill", lstbill);
	 response.sendRedirect("PrintBillController");
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
