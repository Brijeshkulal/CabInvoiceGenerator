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
}
