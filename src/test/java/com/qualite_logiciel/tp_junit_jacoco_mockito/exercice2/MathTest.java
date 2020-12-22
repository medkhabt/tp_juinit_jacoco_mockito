package com.qualite_logiciel.tp_junit_jacoco_mockito.exercice2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Coverage de ce test est a  100% pour le package d'exercice 2 
 * @author medkhalil
 *
 */
public class MathTest {

	
	@Test
	public void testPpcm_when_a_equals_b() {
		
		//Test 1 - DT : { a = 5, b = 5 }, prediction de l'oracle : 5
		
		assertEquals(Math.pccm(5, 5), 5);
	}
	
	@Test
	public void testPpcm_when_a_lt_b() { 
		//Test 1 - DT : { a = 2 , b = 6 }, prediction de l'oracle : 2  
		
		int result = Math.pccm(2, 6);
		
		assertEquals(result , 2);

	}
	
	@Test public void testPpcm_when_a_gt_b() {
		// Test 1 - DT : { a = 25, b = 5 } , prediction de l'orcale : 5
		
		assertEquals(Math.pccm(25, 5), 5);

	}
}
