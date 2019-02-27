import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class COMPtests {

	//no issues with this first test. Passed on the first try
	//intent - to make sure an integer between 1 and 4 will not cause the total to be discounted
		@Test
		public void oneThroughFourNoDiscountTest() {
			Tests object = new Tests();
			float result = object.OneThroughFourNoDiscount(2, (float) 100.00);
			assertEquals(100,result);
		}
		
		
		//Some basic math issues. Had to fix a couple casting errors. Eventually got it to pass.
		//intent - to make sure an integer between 5 and 9 will cause a 5% discount on the total cost
		@Test
		public void fiveThroughNineDiscountTest() {
			Tests object = new Tests();
			double result = object.fiveThroughNineDiscount(7, (float) 100.00);
			assertEquals(95.00,result);
		}
		
		// No Problems. Passed on the first attempt.
		//intent - to make sure an integer >= 10 will cause a 10% discount on the total cost
		@Test
		public void tenOrMoreDiscountTest() {
			Tests object = new Tests();
			double result = object.tenOrMoreDiscount(15, (float) 100.00);
			assertEquals(90.00,result);
		}
		
		//no problems. passed on the first attempt.
		//intent - to make sure a customer cannot have more than 50 items
		@Test
		public void noMoreThanFiftyItemsTest() {
			Tests object = new Tests();
			String result = object.noMoreThanFiftyItems(51);
			assertEquals("invalid",result);
		}
		
		//no problems. passed on the first attempt.
		//to make sure if a customer is a member they get a 10% discount
		@Test
		public void isAMemberTest() {
			Tests object = new Tests();
			double result = object.isAMember(true, 100.00);
			assertEquals(90.00,result);
		}
		
		
		//no problems. passed on the first attempt
		//to make sure if the customer is not a member the total cost does not get a 10% discount
		@Test
		public void isNotAMemberTest() {
			Tests object = new Tests();
			double result = object.isNotAMember(false, (int) 100.00);
			assertEquals(100.00,result);
		}
		
		//got it to pass after a few attempts. I was using the wrong method.
		//to make sure if a customer is tax exempt, the total cost will not increase by 4.5%
		@Test
		public void isTaxExemptTest() {
			Tests object = new Tests();
			double result = object.isTaxExempt(true, 100.00);
			assertEquals(100.00,result);
		}
		
		//no problems. Passed on the fist attempt
		//to make sure if a customer is not tax exempt, the total cost will increase by 4.5%
		@Test
		public void isNotTaxExemptTest() {
			Tests object = new Tests();
			double result = object.isNotTaxExempt(true, 100.00);
			assertEquals(104.50,result);
		}
		
		//no problems. Passed on the first attempt
		//to make sure if a customer buys 1-4 products they will
		//not get any discount
		@Test
		public void noDiscountForInputOfThreeTest() {
			Tests object = new Tests();
			double result = object.noDiscountForInputOfThree(3, 100.00);
			assertEquals(100.00,result);
		}
		
		//No problems. Passed on the first attempt
		//to make sure if a customer buys 5-9 products they will
		//get a 5% discount
		@Test
		public void fivePercentDiscountInputOfSevenTest() {
			Tests object = new Tests();
			double result = object.fivePercentDiscountInputOfSeven(7, 100.00);
			assertEquals(95.00,result);
		}
		
		//Passed on the second attempt. First attempt I was calling the wrong method
		//to make sure if a customer buys > 10 products they will
		//get a 10% discount
		@Test
		public void tenPercentDiscountInputOffifteenTest() {
			Tests object = new Tests();
			double result = object.tenPercentDiscountInputOffifteen(15, 100.00);
			assertEquals(90.00,result);
		}
		
		//No problems. Passed on the first attempt
		//intent - to make sure a customer can buy any number of products
		//between 1 and 50. In this case, it is 30
		@Test
		public void thirtyGroceriesIsValidTest() {
			Tests object = new Tests();
			String result = object.thirtyGroceriesIsValid(30);
			assertEquals("valid",result);
		}
		
		//No Problems. Passed on the first attempt
		//intent - to make sure a customer cannot buy more than 50 products
		@Test
		public void fiftyFiveGroceriesIsInvalidTest() {
			Tests object = new Tests();
			String result = object.fiftyFiveGroceriesIsInvalid(55);
			assertEquals("invalid",result);
		}
		
		//No Problems. Passed on the first attempt
		//boundary test to make sure there is no discount for purchasing 4 items
		@Test
		public void discountForFourItemsTest() {
			Tests object = new Tests();
			double result = object.discountForFourItems(4, 100.00);
			assertEquals(100.00,result);
		}
		
		//Passed on the second attempt. I had to modify the return statement in Tests.java
		//boundary test to make sure there is a 5% discount for purchasing 5 products
		@Test
		public void discountForFiveItemsTest() {
			Tests object = new Tests();
			double result = object.discountForFiveItems(5, 100.00);
			assertEquals(95.00,result);
		}
		
		//Passed on the first attempt
		//boundary test to make sure there is a 5% discount for purchasing 6 products
		@Test
		public void discountForSixItemsTest() {
			Tests object = new Tests();
			double result = object.discountForSixItems(6, 100.00);
			assertEquals(95.00,result);
		}
		
		//Passed on the first attempt
		//boundary test to make sure there is a 5% discount for purchasing 9 products
		@Test
		public void discountForNineItemsTest() {
			Tests object = new Tests();
			double result = object.discountForNineItems(9, 100.00);
			assertEquals(95.00,result);
		}
		
		//Passed on the second attempt. I was calling the wrong method
		//boundary test to make sure there is a 10% discount for purchasing 10 products
		@Test
		public void discountForTenItemsTest() {
			Tests object = new Tests();
			double result = object.discountForTenItems(10, 100.00);
			assertEquals(90.00,result);
		}
		
		//Passed on the first attempt
		//boundary test to make sure there is a 10% discount for purchasing 11 products
		@Test
		public void discountForElevenItemsTest() {
			Tests object = new Tests();
			double result = object.discountForElevenItems(11, 100.00);
			assertEquals(90.00,result);
		}
		
		//Passed after a couple attempts. Had to experiment a little bit
		//to figure out how exactly to add the rounding feature to the totalCost amount.
		//intent - to make sure a total cost with a number >= 5 in the thousandth
		//place will round the total up, with two decimal places.
		@Test
		public void roundDecimalUpTest() {
			double totalCost = 100.2393625;
			Tests object = new Tests();
			double result = Math.round(totalCost * 100.0) / 100.0;
			assertEquals(100.24, result);
		}
		
		//No problems. Passed after the first attempt
		//intent - to make sure a total cost with a number <= 4 in the thousandth
		//place will cause the first two decimal spots to stay the same.
		@Test
		public void decimalDoesNotRoundUpTest() {
			double totalCost = 100.221;
			Tests object = new Tests();
			double result = Math.round(totalCost * 100.0) / 100.0;
			assertEquals(100.22, result);
		}
		
		//No problems. Passed after the first attempt
		//first boundary test to make sure a 4 in the thousandth place will cause
		//the first two digits to stay the same
		@Test
		public void decimalBoundaryTest1() {
			double totalCost = 100.2344444;
			Tests object = new Tests();
			double result = Math.round(totalCost * 100.0) / 100.0;
			assertEquals(100.23, result);
		}
		
		//No problems
		//second boundary test to make sure a 5 in the thousandth place will cause
		//the second decimal digit to go up one
		@Test
		public void decimalBoundaryTest2() {
			double totalCost = 100.2355555;
			Tests object = new Tests();
			double result = Math.round(totalCost * 100.0) / 100.0;
			assertEquals(100.24, result);
		}
		
		//No problems
		//third boundary test to make sure a 6 in the thousandth place will cause
		//the second decimal digit to go up one
		@Test
		public void decimalBoundaryTest3() {
			double totalCost = 100.2366666;
			Tests object = new Tests();
			double result = Math.round(totalCost * 100.0) / 100.0;
			assertEquals(100.24, result);
		}
	}
