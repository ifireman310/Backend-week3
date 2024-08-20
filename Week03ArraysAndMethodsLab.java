//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] intArray = new int[6];
		intArray[0] = 1;
		intArray[1] = 5;
		intArray[2] = 2;
		intArray[3] = 8;
		intArray[4] = 13;
		intArray[5] = 6;
		
		// 2. Print out the first element in the array
		System.out.println(intArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(intArray[intArray.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(intArray[6]); CAUSES ERROR, INDEX OUT OF BOUNDS
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(intArray[-1]); //CAUSES ERROR, INDEX OUT OF BOUNDS
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("Traditional loop");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("Enhanced loop");
		for (int integer : intArray) {
			System.out.println(integer);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		System.out.println("Summing integers in the array!");
		for (int num : intArray) {
			sum += num;
			System.out.println(sum);
		}
			
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum/intArray.length;
		System.out.println("The average is: " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int num:intArray) {
			if (num % 2 != 0) {
				System.out.println("Odd number: " + num);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		for (String name : names) {
			System.out.println(name);
		}
		
		// 12. Calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		
		for (String name:names) {
			sumOfLetters += name.length();
		}
		System.out.println("Total letters: " + sumOfLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		String inputName = "Ian";
		greetings(inputName);
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		String testGreeting = greeting(inputName);
		System.out.println(testGreeting);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		System.out.println(isStringLonger("yo",2));
		System.out.println(isStringLonger("Wazzup",2));
		System.out.println(isStringLonger("Not much, you?",20));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println("Question 16");
		System.out.println(isStringInArray(names,"test"));
		System.out.println(isStringInArray(names,"Sally"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(returnSmallestInt(intArray));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] testArray = {1.5, 3.2, 6.4, 10.7};
		System.out.println(calculateAverage(testArray));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		
		int[] intArray2;
		intArray2 = LengthOfStringsInArray(names);
		
		for (int num : intArray2) {
			System.out.println(num);
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		
		System.out.println(areMoreEvenStringChars(names));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		String testString = "tacocat";
		System.out.println("Is " + testString + " a palindrome?");
		System.out.println(isPalindrome(testString));
		
	}
	

	
	// Method 13:
	public static void greetings(String name) {
		System.out.println("Hello, " + name + ". Good to see you.");
	}

	// Method 14:
	public static String greeting(String name) {
		String greetingout = "Hello, " + name + ". Good to see you.";
		return greetingout;
	}
	
	// Method 15:
	public static boolean isStringLonger(String inputString, int length) {
		
		if (inputString.length() > length) {
			return true;
		} else {
			return false;
		}
			
	}
	
	// Method 16:
	public static boolean isStringInArray(String[] StringArray, String inputString) {
		
		for (String string:StringArray) {
			if (string.equals(inputString)) {
				return true;
			}
		}
		// If no return happens, the string is not in the array
		return false;
	}
	
	// Method 17:
	public static int returnSmallestInt(int[] intArray) {
		
		int min_num = intArray[0];
		for (int num : intArray) {
			if (num < min_num) {
				min_num = num;
			}
		}
		return min_num;
	}
	
	// Method 18:
	public static double calculateAverage(double[] array) {
		
		double array_sum = 0;
		
		for (double num : array) {
			array_sum += num;
		}
		
		return array_sum/array.length;
	}
	
	// Method 19:
	public static int[] LengthOfStringsInArray(String[] stringArray) {
		
		int[] intArray = new int[stringArray.length];
		
		for (int i = 0; i < stringArray.length; i++) {
			
			intArray[i] = stringArray[i].length();
		}
		
		return intArray;
	}
	
	// Method 20:
	public static boolean areMoreEvenStringChars (String[] stringArray) {
		int [] intArray = LengthOfStringsInArray(stringArray);
		
		int evenCounter = 0;
		int oddCounter = 0;
		for (int num : intArray) {
			if (num % 2 == 0) {
				// number is even, increment even counter
				evenCounter += num;
			} else {
				// number is odd, increment odd counter
				oddCounter += num;
			}
		}
		
		return (evenCounter > oddCounter);
		
	}
	
	// Method 21:
	
	public static boolean isPalindrome(String inputString) {
		
		inputString = inputString.toLowerCase();
		
		String reverseInput = "";
		// Rebuild the string by looping backwards then compare to the original string
		for (int i = inputString.length()-1; i >= 0; i--) {
			reverseInput += inputString.charAt(i);
		}
		return reverseInput.equals(inputString);
	}

}
