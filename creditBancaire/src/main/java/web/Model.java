package web;

public class Model {
	private double montant;
	private double taux;
	private int duree;
	private double mensualite;
	
	
	public Model(double montant, double taux, int duree, double mensualite) {
		super();
		this.montant = montant;
		this.taux = taux;
		this.duree = duree;
		this.mensualite = mensualite;
	}


	public Model() {
		
	}


	public double getMontant() {
		return montant;
	}


	public double getTaux() {
		return taux;
	}


	public int getDuree() {
		return duree;
	}


	public double getMensualite() {
		return mensualite;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public void setTaux(double taux) {
		this.taux = taux;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}


	public void setMensualite(double mensualite) {
		this.mensualite = mensualite;
	}


	
	
	
}
