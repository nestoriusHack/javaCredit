package kmt.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kmt.metier.ICredit;
import kmt.metier.MetierImplementation;

class TestMetierTest {
	private ICredit metier;
	@BeforeEach
	void setUp() throws Exception {
		metier = new MetierImplementation();
	}

	@Test
	void test() {
		double taux = 4.5;
		double capital = 200000;
		int duree = 240;
		double resultatAttendu = 1265.2987;
		double resultat = metier.calculMensualite(capital, taux, duree);
		assertEquals(resultatAttendu, resultat, 0.0001);
	}

}
