package hotel.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import hotel.business.CustomerService;
import mhotel.DatasourceUtils;
import mhotel.dao.CustomerDAO;
import mhotel.model.Customer;

/**
 * Servlet implementation class CustomerListController
 */
public class CustomerListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Citeste din baza de date un List<Customer>
		// forward la view - customerList.jsp
		try {

			List<Customer> customerList = new CustomerService().getAllCustomers();

			RequestDispatcher rd = request.getRequestDispatcher("/customerList.jsp");
			request.setAttribute("customers", customerList);
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}

	}

}