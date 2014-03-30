package com.diana.pattern.ProdCons;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.diana.shop.Vehicle;
import com.diana.shop.VehicleFactory;
import com.diana.shop.VehicleType;

public class VehicleTest {
	private VehicleFactory factory;
	
	@Before
	public void setup()
	{
		factory = VehicleFactory.getInstance();
	}

	@Test
	public void testCreate() 
	{
		Vehicle bike = factory.createVehicle(VehicleType.BIKE);
		assert(bike.getWheels() == 2);
		
		Vehicle car = factory.createVehicle(VehicleType.CAR);
		assert(car.getWheels() == 4);
	}

}
