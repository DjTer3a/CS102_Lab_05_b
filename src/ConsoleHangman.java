/**
 * Lab_05_b Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 16/07/2021
 */


import java.util.Scanner;
import cs102.*;


public class ConsoleHangman
{
    public static void main( String[] args)
	{
		//variables
		char letter;
    	Scanner scan = new Scanner( System.in);
    	System.out.println( "Start of ConsoleHangman\n");


		// VARIABLES
		HangmanModel		hangman;


		// PROGRAM CODE
		hangman = new HangmanModel(new BasicSetup());
		hangman.addView(new ConsoleHangmanView());


		//do-while statement to play the game
		do{

			letter = scan.nextLine().charAt(0);
			hangman.tryThis(letter);
		}while( !hangman.isGameOver());

		System.out.println( "\nEnd of ConsoleHangman\n" );
		scan.close();
	}
} // end of class ConsoleHangman
