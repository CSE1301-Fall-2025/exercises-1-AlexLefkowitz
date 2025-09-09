package module2._10exercises;

public class E17Message {
	//Exercise 17: Write a program so that it prints a string message minus the last character 
    //each time through the loop until there are no more characters in message.   
    //The loop condition should test the length of the message.
    //The loop body should print the message and then use substring to create a new message without the last character.  

    public static void main(String[] args) {
        String hello = "Hello World";
        String subString;
        String a;
        while (hello.length()>0){
                hello = hello.substring(0,hello.length()-1);
                System.out.println(hello);
        }
    }
}
