package com.corejava;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(CalcTest.class);
	private static final int FIVE = 5;
	private static Calc app;

	@BeforeClass
	public static void setUp() {
		LOGGER.info("@BeforeClass - setUp");
		app = new Calc(FIVE, FIVE);
	}

	@AfterClass
	public static void tearDown() {
		LOGGER.info("@AfterClass - tearDown");
		app = null;
	}

	@Test
	public void testGetSum() {
		LOGGER.info("App.testGetSum()");
		assertEquals(new Integer(10), app.getSum());
	}

	@Test
	public void testGetSub() {
		LOGGER.info("App.testGetSum()");
		assertEquals(new Integer(0), app.getSub());
	}

	@Test
	public void testGetMul() {
		LOGGER.info("App.testGetSum()");
		assertEquals(new Long(25), app.getMul());
	}

	@Test
	public void testGetDiv() {
		LOGGER.info("App.testGetSum()");
		assertEquals(new Float(1.0), app.getDiv());
	}

	@Test
	public void testMain() {
		LOGGER.info("App.testGetSum()");
		String[] args = null;
		Calc.main(args);
	}

	// http://eclemma.org/jacoco/trunk/doc/examples/build/pom-offline.xml
	// http://docs.sonarqube.org/display/PLUG/JaCoCo+Plugin
	// clean org.jacoco:jacoco-maven-plugin:prepare-agent install org.jacoco:jacoco-maven-plugin:report -Dmaven.test.failure.ignore=true sonar:sonar
	// clean install -Dmaven.test.failure.ignore=true sonar:sonar
}