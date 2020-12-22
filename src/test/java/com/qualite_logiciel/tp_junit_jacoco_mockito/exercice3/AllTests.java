package com.qualite_logiciel.tp_junit_jacoco_mockito.exercice3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.qualite_logiciel.tp_junit_jacoco_mockito.exercice1.FactureTest;
import com.qualite_logiciel.tp_junit_jacoco_mockito.exercice2.MathTest;

@RunWith(Suite.class)
@SuiteClasses( value = { FactureTest.class, MathTest.class, IFactureTest.class} )
public class AllTests {
	
	
}
