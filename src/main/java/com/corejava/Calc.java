package com.corejava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class Calc {

	private static final Logger LOGGER = LoggerFactory.getLogger(Calc.class);
	private static final int FIVE = 5;
	private int x;
	private int y;

	public Calc(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Integer getSum() {
		LOGGER.info("Calc.getSum()");
		return getX() + getY();
	}

	public Integer getSub() {
		LOGGER.info("Calc.getSub()");
		return getX() - getY();
	}

	public Long getMul() {
		LOGGER.info("Calc.getMul()");
		return new Long(getX() * getY());
	}

	public Float getDiv() {
		LOGGER.info("Calc.getDiv()");
		return new Float(getX() / getY());
	}
	
	
	public static void main(String[] args) {
		LOGGER.info("Hello World!");
		Calc sum = new Calc(FIVE, FIVE);
		LOGGER.info("App.main().getSum() : " + sum.getSum());
		LOGGER.info("App.main().getSub() : " + sum.getSub());
		LOGGER.info("App.main().getMul() : " + sum.getMul());
		LOGGER.info("App.main().getDiv() : " + sum.getDiv());
	}
}
