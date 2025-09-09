package module2._10exercises;

public class E15EvenOdd {
	//Exercise 15: Write a program that will print all of the values
	//from 10 to 1 followed by "is even" for the evens and "is odd" for the odds.
    public static void main(String[] args) {
        
        for (int i = 10; i>0; i--){
            System.out.print(i);
            if (i%2==1){
                System.out.println(" is odd");
            }
            else{
                System.out.println(" is even");
            }
        }
    }
}
