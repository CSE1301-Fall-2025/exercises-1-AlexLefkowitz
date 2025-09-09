package module3._6exercises;

public class E15Replace {
	//Exercise 15: Complete the code below to replace the
	//word "purple" with "yellow"
	public static void main(String[] args) {
		String[][] arr = { {"red","orange", "purple"}, {"green","blue", "indigo"} };

		// ADD CODE HERE //

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[1].length; col++) {
				System.out.println(arr[row][col]);
				//replace purple with yellow
				if (arr[row][col]=="purple"){
					arr[row][col] = "yellow";
				}
			}
		}
		//print new array
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[1].length; col++) {
				System.out.println(arr[row][col]);
			}
		}
	}
}

