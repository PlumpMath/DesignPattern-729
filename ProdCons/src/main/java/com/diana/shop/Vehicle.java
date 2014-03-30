package com.diana.shop;

import java.util.logging.Logger;

public abstract class Vehicle 
{
	protected int wheels;
	private Logger log = Logger.getLogger(Vehicle.class.getName());
	
	public void start()
	{
		log.info("Vehicle start");
	}

	public int getWheels() 
	{
		return this.wheels;
	}
}
