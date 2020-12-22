package com.qualite_logiciel.tp_junit_jacoco_mockito.exercice1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactureTest {
	Facture facture = new Facture() ; 

	@Test
	public void testGetFraisTransport_Si_Montant_lt_600() { 
		// Test 1 - DT : { montant = 30 } , prediction de l'oracle : 45

		/**
		 * AssertEquals(double, double) is deprecated, on peut utiliser asserTrue, on 
		 * choississons un epsilon = 0.0001, qui vas determiner si les deux "long" valeur sont egals
		 * ou pas 
		 *  
		 */
//		assertEquals(Facture.getFraisTransport(30), 45);
		
		assertTrue(Math.abs(facture.getFraisTransport(30) - 45) < 0.0001); 
	}
	
	
	@Test
	public void testGetFraisTransport_Si_Montant_gt_600() {
		//Test 2 - Dt : { montant = 650 } , prediction de l'oracle : 0) 
		
		
		assertTrue(Math.abs(facture.getFraisTransport(650) - 0) < 0.0001);
	}
}
