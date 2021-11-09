package com.invoice.generator;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

	@Test
	public void givenDistanceTime_ShouldReturnTotalFare(){
        CabInvoiceGenerator generator = new CabInvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare= generator.calculateFare(distance,time);
        Assert.assertEquals(25,fare,0.0);
    }


	@Test
	public void givenMultipleRides_ShouldReturnTotalFare(){
		CabInvoiceGenerator generator = new CabInvoiceGenerator();
		Ride[] rides = {new Ride(3.0, 6),
                   new Ride(0.4, 1)
		};
		double fare =generator.calculateFare1(rides);
		Assert.assertEquals(40,fare);
	}

}