import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class AssessmentPartFour 
{
	
	List<String> morseCode = new ArrayList<String>(); //creates an arraylist called morseCode that can handle strings
	
	
	public int loadMorseFromFile(String filename) 
	{
		File file = new File(filename); // creates a instance of a file 
		morseCode.clear(); // clears the contents of the array "morseCode
		
		Scanner sc = null; // creates a scanner called sc and assigns it a value of null
		try //creates a try block and attempts to run the code inside it
		{
			sc = new Scanner(file); //assigns the value of file to the scanner sc
		} catch (FileNotFoundException e) // if an exception is thrown from assigning the value of "file" to the scanner sc, 
		{
			// TODO Auto-generated catch block
			e.printStackTrace(); // if an exception is met, prints the stack trace of the instance ready for debugging
		}
		String fileLine; // creates a string called fileLine
		while (sc.hasNextLine())  //creates a while loop as long as sc has another line waiting
		{	
			fileLine = sc.nextLine(); // makes fileLine equal to the 
			morseCode.add(fileLine); //adds the value assigned to fileLine to the array morseCode
		}
		return morseCode.size(); //returns the size of the array string morseCode
	}
	//////////////////////////////////////////////
	public String translateMorse()
	// public String translateMorse(String filename)
	{
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
		// creates an array string containing each letter of the alphabet in morse code
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
		//creates an array string containing each letter of the alphabet in lower case
		String message=""; //creates a string called message and assigns it nothing
		for (int i = 0; i < morseCode.size();i++)  //creates a for loop where i = 0 and runs for the size of the array morseCode
		{
			for (int x = 0; x < alphabet.length; x++) //creates a nested for loop where x = 0 and runs for the the length of alphabet.length (so 26 times)
			{
				if (morseCode.get(i).equals(morse[x]))  // if the i'th element of morsecode is equal to the x 'th value of the array morse
				{
					morseCode.set( i, alphabet[x] ); //  sets the value of i and the x'th value of alphabet ine the array morseCode
					message =  message + alphabet[x]; // makes message equal to message + the x'th value of alphabet
				}
			}
		}
		return message; //returns the value of message
	}	
}