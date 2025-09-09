package module1._5casting;

public class E03TestOverflow {
	//Exercise 3: These numbers are outside the scope of an int
	//Modify the code to fix the errors
	public static void main(String[] args) {
		long id = 2147483650L; // overflow error!
		long negative = -21474836450L; // overflow
	}
}
