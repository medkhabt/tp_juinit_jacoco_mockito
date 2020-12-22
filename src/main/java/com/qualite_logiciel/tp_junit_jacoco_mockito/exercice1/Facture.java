package com.qualite_logiciel.tp_junit_jacoco_mockito.exercice1;


/**
 * 
 * Les tests sont en src/test/java. 
 * 
 * @author medkhalil
 *
 */
public class Facture {
	
	private double montant ; 
	
	public Facture() { 
		
	}
	
	
	public double getFraisTransport(double montant) { 	
		return (montant < 600) ? 45 : 0 ;
	}

}
