/*
 * Class: CMSC203 31569
 * Instructor: Ahmed Tarek
 * Description: (Give a brief description for each Class)
 * Due: 02/21/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Nathnael Yohannes
*/


import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tries = 0;
		boolean again = false;
		int guess;
		int number;
		String trya;
		int highGuess = 99;
		int lowGuess = 0;
		do {
			Random rand = new Random();
			number = rand.nextInt(100);
			System.out.println(number);
			while(number >= 0) {
				tries++;
				System.out.println("Enter guess");
				guess = input.nextInt();
				if(number == guess) {
					System.out.println("Number of guesses is " + tries);
					System.out.println("Congratulations, you guessed correctly");
					System.out.println("Try again (Y/N)");
					trya = input.next();
					if(trya.equalsIgnoreCase("y")) {
						again = true;
						tries = 0;
						lowGuess = 0;
						highGuess = 99;
					}
					else {
						System.out.println("Thanks for playing....");
					}
					break;
					
				}
				else if(number > guess) {
					if(guess < lowGuess) {
						System.out.println("Guess must be between " + lowGuess + " and " + highGuess + ". Please try again");
						continue;
					}
					else if(guess > highGuess) {
						System.out.println("Guess must be between " + lowGuess + " and " + highGuess + ". Please try again");
						continue;
					}
					lowGuess = guess;
					System.out.println("Number of guesses is " + tries);
					System.out.println("Your guess is too low");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					
				}
				else if(number < guess) {
					if(guess < lowGuess) {
						System.out.println("Guess must be between " + lowGuess + " and " + highGuess + ". Please try again");
						continue;
						
					}
					else if(guess > highGuess) {
						System.out.println("Guess must be between " + lowGuess + " and " + highGuess + ". Please try again");
						continue;
					}
					highGuess = guess;
					System.out.println("Number of guesses is " + tries);
					System.out.println("Your guess is too high");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				}
			}
		}while(again == true);
	}
}
