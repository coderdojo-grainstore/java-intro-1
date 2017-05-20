package coderdojo;

import java.util.Scanner;

// Hello world1
public class HelloWorld1
{
	//
	// The main function is the programs entry point.
	//
	//
	public static void main(String[] args) {
		
		// Create a new HelloWorld1 Object
		HelloWorld1 obj = new HelloWorld1();
		
		// Call the askQuestions method on the HelloWorld1 Object
		obj.askQuestions();
	}
	
	
	public void askQuestions(){
		
		int age;				// This variable is be used to store the users age.
		float favouriteNumber;  // This variable is used to store the users favourite number.
		String name;			// This variable is used to store the users name.

		// We are going to print out the 
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Hello World!");
		}

		//Scanner is a program built into java that lets you get input from the user
		//through the keyboard.
		Scanner scanner = new Scanner(System.in);

		System.out.print("What is your age? ");
		age = scanner.nextInt();
		System.out.print("\nWhat is your favourite number? ");
		favouriteNumber = scanner.nextFloat();
		System.out.print("\nWhat is your name? ");
		name = scanner.next();

		//Finally we close the scanner. If we try to use it after we close it the program will crash!
		scanner.close();

		System.out.println("Your name is " + name + ", your age is " + age + " and your favourite number is " + favouriteNumber + "!");


		//Remember, the "//" means it's a comment and is ignored when the code is compiled.
		/* This is a comment too but can go on for
		 more than one line! */
		
	}
}
