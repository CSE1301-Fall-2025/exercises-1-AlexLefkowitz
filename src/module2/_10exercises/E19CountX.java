package module2._10exercises;

public class E19CountX {
	//Exercise 19: Complete the code below to count the number of
	//"x"s in the String. Use indexOf() with a loop.
    public static void main(String[] args) {
        String message = "xyxxzax";
        int numX=0;
        for (int i=0; i< message.length(); i++)
            if (message.charAt(i)=='x'){
                numX++;
            }
        System.out.println("There are "+ numX+ " Xs");
    }
}
