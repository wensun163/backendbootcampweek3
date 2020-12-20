/*
 * Backend BootCamp Week3 Assignment Part2 
 * Author: Wendy Sun 
 */
public class part2 {
	//Testrun from Question #7 to #13 
	public static void main(String[] args) {
		System.out.println("Testrun for Question 7:" +  multiplyString("Hello",3));
		System.out.println("Testrun for Question 8:" +  fullName("Angelina","Smith"));
		System.out.println("Testrun for Question 9:");
		int [] sampleArray = {3,5,7,9}; 
		System.out.println(sumArray(sampleArray)); 
		System.out.println("Testrun for Question 10:");
		double [] testArray = {3.33, 5.55, 7.77, 8.88, 9.99}; 
		System.out.println(aveArray(testArray)); 
		System.out.println("Testrun for Question 11:");
		double [] aArray = {98.11, 95.32, 96.44, 64.35, 58.92}; 
		double [] bArray = {62.31, 99.85, 67.46, 54.88, 75.82}; 
		System.out.println(firstBigger(aArray, bArray));
		System.out.println("Testrun for Question 12:");
		boolean isHotoutside = true; 
		double moneyInpocket = 11.00; 
		System.out.println(willBuyDrink(isHotoutside, moneyInpocket));
		System.out.println("Testrun for Question 13:");
		double caloriesIntake = 960.55; 
		double caloriesOutput = 887.63; 
		System.out.println(eatTooMuch(caloriesIntake,caloriesOutput)); 
		}
		
		
		
		
		
		/*7.	Write a method that takes a String, word, and an int, n, 
		 * as arguments and returns the word concatenated to itself n number of times. 
		 * (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		 */
		
		public static String multiplyString (String word, int num) {
				String finalWord = "";
				for (int i=0; i<num; i++) {
					finalWord += word; 
				}
				return finalWord;
		}
		
		/*8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
		(the full name should be the first and the last name as a String separated by a space).
		*/
		public static String fullName (String firstName, String lastName) { 
			String fullName = firstName + " " + lastName; 
			return fullName;
		}
	
		/*9.	Write a method that takes an array of int and returns true if the sum of all the
		 *  ints in the array is greater than 100.
		 */
		public static boolean sumArray (int [] numbers ) {
			int sum =0; 
			for (int number:numbers) {
				sum += number; 
			}
			while(sum > 100){
				return true;
						}
			return false;
		}
		
		/*10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		 * 
		 */
		public static double aveArray (double [] elements) {
			double sumArray =0; 
			for (double element:elements) {
				sumArray += element; 
			}
			double average = sumArray/elements.length; 
			return average;
		}
		
		/*
		 * 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
		 * greater than the average of the elements in the second array.
	
		 */
		public static boolean firstBigger (double [] firstArray, double [] secondArray) {
			while (aveArray(firstArray) > aveArray(secondArray)) {
				return true; 
			}
			return false;
		}
		
	   /*
	    * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	    * and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	    */
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			while(isHotOutside && moneyInPocket > 10.50) {
				return true;
			}
			return false;
		}
		
		
	   /*
	    * 13.	Create a method of your own that solves a problem.
	    *  In comments, write what the method does and why you created it.
	    *  The eatTooMuch method returns boolean value to determine if someone eats too much. It returns true if 
	    *  the caloriesIntake is greater than caloriesOutput. 
	    *  I created this method because it can help somone to keep track of their energy intakes and output to 
	    *  make sure it remains balanced. 
	    */
		
	   public static boolean eatTooMuch (double caloriesIntake, double caloriesOutput) {
		   while(caloriesIntake > caloriesOutput) {
			   return true;
		   }
		   return false;
	   }
}
			   

		