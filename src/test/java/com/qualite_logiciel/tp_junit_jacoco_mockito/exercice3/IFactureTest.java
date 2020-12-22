package com.qualite_logiciel.tp_junit_jacoco_mockito.exercice3;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IFactureTest {
	

	@Test public void testGetMontantFacture() {
		
		IFacture facture = mock(IFacture.class); 
		when(facture.getMontantFacture()).thenReturn((double)750);
		
//		assertEquals(, 750);
		assertTrue(Math.abs(facture.getMontantFacture() - 750 ) < 0.0001); 
	}
	
	@Test
	public void testGetFraisTransport_ls_600() { 
		// Test 1 - DT : { montant = 30 } , prediction de l'oracle : 45
		
		IFacture facture = mock(IFacture.class);
		when(facture.getFraisTransport(30)).thenReturn((double)45); 
		
		assertTrue(Math.abs(facture.getFraisTransport(30) - 45) < 0.0001);
	}
	
	
	@Test
	public void testGetFraisTransport_gt_600() {
		//Test 2 - Dt : { montant = 650 } , prediction de l'oracle : 0) 
		
		
		IFacture facture = mock(IFacture.class);
		when(facture.getFraisTransport(30)).thenReturn((double)45); 
		
		assertTrue(Math.abs(facture.getFraisTransport(650) - 0) < 0.0001);
	}
}
