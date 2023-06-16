package kmt.metier;

public class MetierImplementation implements ICredit{



	
	public double calculMensualite(double capital, double taux, int duree) {
		double t1= taux/100;
		double t2= capital*t1/12;
		double t3= 1-Math.pow(1+t1/12, -duree);
		return t2/t3;
	}
	
}
