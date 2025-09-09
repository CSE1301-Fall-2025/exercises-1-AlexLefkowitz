package module3._6exercises;
public class E11SumSecondRow {

	//Exercise 11: Write code that will sum and print the
	//values in the second row of the array
	public static void main(String[] args) {
		int[][] table = { {1,4,9},{11,4,3},{2,2,3} };

		//ADD CODE HERE
		int sum = 0;
		for (int i=0; i<table[1].length; i++){
			sum = sum + table[1][i];
		}
		System.out.println("the sum of the second row is: "+sum);

	}
}
