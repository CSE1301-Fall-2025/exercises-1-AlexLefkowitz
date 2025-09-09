package module3._1basics;

public class E04ParallelArrays {
	
	//Exercise 4: Can you print out Mateo's score?
	//Can you change Sofia's score to 97 using an assignment statement in the code? 
	//Can you change the arrays so that they have 6 elements and add your name and score and print them out? 
	public static void main(String[] args) {
		// declare, create, initialize arrays
		int[ ] highScores = {99,98,98,88,68, 100};
		String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia", "Alex"};

		// Print corresponding names and scores
		System.out.println(names[0] + " has a score of " + highScores[0]);
		System.out.println(names[1] + " has a score of " + highScores[1]);
		//print mateos's score
		System.out.println(names[3] + " has a score of " + highScores[3]);
		//change sophias score
		highScores[4] = 97;
		//add myself into the array and print
		System.out.println(names[5] + " has a score of " + highScores[5]);


	}
}

