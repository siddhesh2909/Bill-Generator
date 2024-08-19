package shop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shop.model.Product;

@WebServlet("/SecondServlet")
public class ProductCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductCart() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		List<Product> lst =(List<Product>) session.getAttribute("data");
		
		PrintWriter pw = response.getWriter();
		
	        pw.println("<!DOCTYPE html>");
	        pw.println("<html lang=\"en\">");
	        pw.println("<head>");
	        pw.println("<meta charset=\"UTF-8\">");
	        pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
	        pw.println("<title>Display All Accounts</title>");
	        pw.println("<style>");
	        pw.println("table { border-collapse: collapse; width: 50%; margin: 20px auto; }");
	        pw.println("th, td { border: 1px solid black; padding: 8px; text-align: center; }");
	        pw.println("th { background-color: lightgray; }");
	        pw.println("</style>");
	        pw.println("</head>");
	        pw.println("<body>");
	        pw.println("<div style='text-align: center;'>");
	        pw.println("<h1>Confirm Products</h1>");
	        pw.println("<table>");
	        pw.println("<tr><th>Product Id</th><th>Product Name</th><th>Product Price</th><th>Product Quantity</th></tr>");

		for(Product p : lst)
		{
			 pw.println("<tr><td>" + p.getProId() + "</td><td>" + p.getProName() + "</td><td>" + p.getProPrice() + "</td><td>"+p.getProQnt()+"</td></tr>");
			
		}
		    pw.println("</table>");
	        pw.println("</div>");
	        pw.println("</body>");
	        pw.println("</html>");
	        pw.println("<hr/>");
		
		pw.println("<center><h3>Do you want to add more product"+" <a href='ProductView.html'> click Here</a> </h3>");
		pw.println(" <h3>For Bill <a href='BillController'>Click  Here </a></h3></center>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
