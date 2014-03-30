package com.diana.shop;

public class VehicleFactory 
{
	private static VehicleFactory instance;
	
	protected VehicleFactory()
	{
		
	}
	
	public static VehicleFactory getInstance()
	{
		if(instance == null) 
		{
			instance =  new VehicleFactory();
		}
		
		return instance;
	}
	
	public static Vehicle createVehicle(VehicleType type)
	{
		switch(type)
		{
			case BIKE: return new Bike();
			case CAR: return new Car();
			default: return new Car();
		}
	}
}
