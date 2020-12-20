/*
 * Backend BootCamp Week3 Assignment
 * Author: Wendy Sun 
 */

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question 1: Create an array of int called ages that contains the following values:
		 *  3, 9, 23, 64, 2, 8, 28, 93.
		 */
		 System.out.println("Question 1:"); 
		 int[] ages = {3,9,23,64,2,8,28,93};
		 for (int age:ages) {
			 System.out.print(age + " ");
		 }
		 System.out.println();
		 /*
		  * a.	Programmatically subtract the value of the first element in the array from 
		  * the value in the last element of the array (i.e. do not use ages[7] in your code). 
		  * Print the result to the console.
		  */
		 int i=0; 
		 int result = ages[ages.length-1 -i] - ages[i]; 
		 System.out.println("result:" + result);
		 
		
	 	/*
	 	 * b.	Add a new age to your array and repeat the step above to ensure it is dynamic
	 	 *  (works for arrays of different lengths).
	 	 */  
		 int [] newAges = {3,9,23,64,2,8,28,93,79};
		 int j=0; 
		 int newResult = newAges[newAges.length-1-j] - newAges[j]; 
		 System.out.println("newResult:" + newResult);
		 
	    /*
	     * Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	     */
		 int sum =0; 
		 for (int age:ages) {
			 sum += age;
		 }
		 int average = sum/ages.length;
		 System.out.println("average:" + average);
		 System.out.println("------------------------------------------------------------"); 
		 
		/*  
		 * 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */
		 System.out.println("Question 2:");
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 
		 /*
		  *a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
		 *Print the result to the console.
		  */
		 int totalLetter=0; 
		 for (String name:names) {
			 totalLetter += name.length(); 	 
			 }
		int averageLetter = totalLetter/names.length; 
		System.out.println("averageLetter: " + averageLetter); 
		
		/*
		 * *b.	Use a loop to iterate through the array again and concatenate all the names together, 
         *separated by spaces, and print the result to the console.
		 */
		for (String name:names) {
			System.out.print(name + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------"); 
		
		/*
		 * 3.	How do you access the last element of any array?
		 */
		System.out.println ("Question 3:");
		String lastElement = names[names.length-1]; //type variable = array [array.length -1]; 
		System.out.println(lastElement);
		System.out.println("------------------------------------------------------------"); 
		/*
		 * 4.	How do you access the first element of any array?
		 */
		System.out.println ("Question 4:");
		int firstElement = ages [0]; //type variable = array [0]; 
		System.out.println(firstElement);
		System.out.println("------------------------------------------------------------"); 
		
		/*
		 * 5.	Create a new array of int called nameLengths. 
		 * Write a loop to iterate over the previously created names array 
		 * and add the length of each name to the nameLengths array.
		 */
		System.out.println ("Question 5:");
		int[] nameLengths = new int[names.length];
		for (int a = 0; a < names.length; a++) {
			nameLengths[a] = names[a].length(); 
			System.out.print(nameLengths[a] + " ");
		}		
		System.out.println();
		System.out.println("------------------------------------------------------------"); 
		/*
		 * 6.	Write a loop to iterate over the nameLengths array and calculate 
		 * the sum of all the elements in the array. Print the result to the console.
		 */
		System.out.println ("Question 6:");
		int sumOfElements = 0;
		for (int b = 0; b < nameLengths.length; b++) {
			sumOfElements += nameLengths[b]; 
		}
		System.out.println(sumOfElements);					
	}
		
}
		 
		 
			
	 	
	
	   
	
	
		

