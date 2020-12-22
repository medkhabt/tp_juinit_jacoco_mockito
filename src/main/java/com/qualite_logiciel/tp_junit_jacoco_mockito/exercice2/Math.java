package com.qualite_logiciel.tp_junit_jacoco_mockito.exercice2;

public class Math {
	
	public static int pccm(int a, int b) { 
		int p = a * b ; 
		
		while(a != b) { 
			
			if(a < b) 
				b -= a; 
			else 
				a -= b; 
			
			p = a * b ; 
		}
		
		
		
		
		return p / a;  
	}
	
	
}
