package com.mockito;

import static org.mockito.Mockito.*;

import static junit.framework.Assert.*;

import org.mockito.Mockito;

public class CalcService1Test {

	void testCalc() {

		System.out.println("**--- Test testCalccc executed ---**");

		AddService addService;
		CalcService calcService;

		addService = Mockito.mock(AddService.class);
		calcService = new CalcService(addService);

		int num1 = 11;
		int num2 = 12;
		int expected = 23;

		when(addService.add(num1, num2)).thenReturn(expected);

		int actual = calcService.calc(num1, num2);
		assertEquals(expected, actual);
	}

}