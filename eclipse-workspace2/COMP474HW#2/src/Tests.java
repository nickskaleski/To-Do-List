
public class Tests {

	public static void main(String[] args) {
		

	}
	
	public static void noNegativeInput(int numOfItems){
		if(numOfItems > 0) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}	


	public static float OneThroughFourNoDiscount(float numOfItems, float totalCost) {
		totalCost = 100;
		if(numOfItems > 1 && numOfItems <= 4) {
		}
		return totalCost;
	}
	
	
	public static double fiveThroughNineDiscount(float numOfItems, float totalCost) {
		totalCost = 100;
		if(numOfItems > 5 && numOfItems <= 9) {
		}
		return (totalCost * .95);
	}
	
	public static double tenOrMoreDiscount(int numOfItems, float totalCost) {
		totalCost = 100;
		if(numOfItems >= 10) {
		}
		return (totalCost * .90);
	}
	
	public static String FiftyItems(int numOfItems) {
		if(numOfItems >= 1 && numOfItems <= 50) {
		}
		return "valid";
	}
	
	public static String noMoreThanFiftyItems(int numOfItems) {
		if(numOfItems > 50) {
		}
		return "invalid";
	}
	
	public static double isAMember(boolean memberOrNot, double totalCost) {
		totalCost = 100;
		if(memberOrNot == true) {
		}
			return (totalCost * .90);
		}
	
	public static double isNotAMember(boolean memberOrNot, int totalCost) {
		totalCost = 100;
		if(memberOrNot == false) {
		}
			return (totalCost);
		}
	
	public static double isTaxExempt(boolean taxExempt, double totalCost) {
		totalCost = 100;
		if(taxExempt == true) {
		}
			return (totalCost);
		}
	
	public static double isNotTaxExempt(boolean taxExempt, double totalCost) {
		totalCost = 100;
		if(taxExempt == false) {
		}
			return (totalCost * 1.045);
		}
	
	public static double noDiscountForInputOfThree(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 3) {
		}
			return (totalCost);
		}
	
	public static double fivePercentDiscountInputOfSeven(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 7) {
		}
			return (totalCost * .95);
		}
	
	public static double tenPercentDiscountInputOffifteen(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 15) {
		}
			return (totalCost * .90);
		}
	
	public static String thirtyGroceriesIsValid(int numOfItems) {
		if(numOfItems == 30) {
		}
			return "valid";
		}
	
	public static String fiftyFiveGroceriesIsInvalid(int numOfItems) {
		if(numOfItems == 55) {
		}
			return "invalid";
		}
	
	public static double discountForFourItems(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 4) {
		}
		return totalCost;
		}
		
	public static double discountForFiveItems(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 5) {
		}
			return (totalCost * .95);
		}
	
	public static double discountForSixItems(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 6) {
		}
			return (totalCost * .95);
		}
	
	public static double discountForNineItems(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 9) {
		}
			return (totalCost * .95);
		}
	
	public static double discountForTenItems(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 10) {
		}
			return (totalCost * .90);
		}
	
	public static double discountForElevenItems(int numOfItems, double totalCost) {
		totalCost = 100;
		if(numOfItems == 11) {
		}
			return (totalCost * .90);
		}
	
	public static double roundDecimalUp(double totalCost) {
		double result = Math.round(totalCost * 100.0) / 100.0;
		return result;
	}
	
	public static double decimalDoesNotRoundUp(double totalCost) {
		double result = Math.round(totalCost * 100.0) / 100.0;
		return result;
	}
	
	public static double decimalBoundaryTest1(double totalCost) {
		double result = Math.round(totalCost * 100.0) / 100.0;
		return result;
	}
	
	public static double decimalBoundaryTest2(double totalCost) {
		double result = Math.round(totalCost * 100.0) / 100.0;
		return result;
	}
	
	public static double decimalBoundaryTest3(double totalCost) {
		double result = Math.round(totalCost * 100.0) / 100.0;
		return result;
	}
}
