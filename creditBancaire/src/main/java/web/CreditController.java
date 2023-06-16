package web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kmt.metier.ICredit;
import kmt.metier.MetierImplementation;

@WebServlet(name = "cs", urlPatterns = {"/fs", "*.php"})

public class CreditController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ICredit metier ;
	@Override
	public void init() throws ServletException {
		metier = new MetierImplementation();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double montant = Double.parseDouble(request.getParameter("montant"));
		double taux = Double.parseDouble(request.getParameter("taux"));
		int duree = Integer.parseInt(request.getParameter("duree"));
		
		Model model = new Model();
		model.setMontant(montant);
		model.setTaux(taux);
		model.setDuree(duree);
		
		double mensualite = metier.calculMensualite(montant, taux, duree);
		model.setMensualite(mensualite);
		request.setAttribute("creditModel", model);
		request.getRequestDispatcher("vue.jsp").forward(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Model model = new Model();
		request.setAttribute("creditModel", model);
		request.getRequestDispatcher("vue.jsp").forward(request, response);
	}
}
