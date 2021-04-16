package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	StringCalculator calculator = new StringCalculator();
	
	@Test
	void testGivenCalculatorWhenAddEmptyStringThen0() {
		int expectedResult = 0;
		String numbers = "";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testGivenCalculatorWhenAdd1Then1() {
		int expectedResult = 1;
		String numbers = "1";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testGivenCalculatorWhenAdd1Comma2Then3() {
		int expectedResult = 3;
		String numbers = "1,2";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testGivenCalculatorWhenAdd_1_2_3_4_5Then15() {
		int expectedResult = 15;
		String numbers = "1,2,3,4,5";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testGivenCalculatorWhenAdd1NewLine2Comma3Then6() {
		int expectedResult = 6;
		String numbers = "1\n2,3";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}

}
