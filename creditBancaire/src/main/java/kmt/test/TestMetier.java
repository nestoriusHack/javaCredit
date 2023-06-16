package kmt.test;

import kmt.metier.ICredit;
import kmt.metier.MetierImplementation;
public class TestMetier {
	public static void main(String[] args) {
		ICredit metier = new MetierImplementation();
		double taux = 4.5;
		double capital = 200000;
		int duree = 240;
		double mensualite = metier.calculMensualite(capital, taux, duree);
		System.out.println("Mensualite = "+mensualite);
	}
}
