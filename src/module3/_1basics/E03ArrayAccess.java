package module3._1basics;

import java.util.logging.Handler;

public class E03ArrayAccess {
	
	//Exercise 3: Can you print out 3rd score in the array (remember 
	//that the first score is at index 0)? Can you change last 
	//score to 97 using an assignment statement in the code? 
	//Can you change the array so that it has 6 elements and 
	//add another score and print it out? What happens if you 
	//try to access an element that is not there, for example 
	//at index 7?
	public static void main(String[] args) {
		// declare and create arrays
		int[ ] highScores = new int[5];
		// Print initial highScore
		System.out.println(highScores[0]);
		// put values in highScore using an indexed variable
		highScores[0] = 99;
		highScores[1] = 98;
		highScores[2] = 98;
		highScores[3] = 88;
		highScores[4] = 68;

		// Print first highScore at index 0
		System.out.println( highScores[0] );

		//print out 3rd number in array
		System.out.println(highScores[2]);
		//change last score to 97
		highScores[4]=97;
		//add an extra element
		int[] highScores1 = new int[6];
		for (int i = 0; i < highScores.length; i++) {
                highScores1[i] = highScores[i];
            }
		//add another score and print it out
		highScores1[5]= 10;
		System.out.println(highScores1[5]);
		//what if i access an index that does not exist?
		//System.out.println(highScores1[7]);
		//error: index 7 out of bounds for legnth 6

	}
}

