
public class AssessmentPartTwo 

{

	public int scrabbleScore(String aWord) 
	{
		// 03 -Scrabble Score
		// Complete this method so that it returns the scrabble score for the word in
		// aWord
		// In scrabble each letter is worth a number of points and each word is worth
		// the
		// sum of the scores of the letters in it. For this assignment we will ignore
		// double/treble letter/word bonuses.
		// The English language points per letter can be found at
		// https://en.wikipedia.org/wiki/Scrabble_letter_distributions
		// You will need to come up with a way of connecting each letter to its score
		// and
		// a way of identifying each letter in the word.

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //declares a string called alphabet containing all the letters of the alphabet
		int values[] = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 }; //declares an array called values containing all the values of each letter for a game of scrabble
		int sum = 0; //declares an integer called sum and assigns it a value of 0
		for (int i = 0; i < aWord.length(); i++) //creates a for loop, that assigns a value of 0 to an integer called I, the loop runs adding 1 to I each time until the length of aWord is reached, 

		{
		aWord = aWord.toUpperCase(); // converts the string value of aWord all to upper case 
		sum += values[alphabet.indexOf(aWord.charAt(i))];  // makes sum = to sum + the character in the array values equal to the position of the index of the i'th character of the aword string
		}

			return sum; //returns the value of sum, in this case the score of the word 
	} 

	public Boolean passwordValidator(String password) { 
		// 04 - Password Validator
		// Complete this method to validate that the String password
		// is a valid password
		// A password is valid if it is
		// - between 8 and 16 characters long (inclusive) <-- done
		// - made up of letters (upper or lower), numbers, and the following characters
		// !Â£$% 
		// - has at least one lower case letter, one upper case letter and a number
		// - does not contain the phrases 'password' or 'passwd'

		
		
		if (password.contains("passwd"))  //checks to see if the string contains "passwd"
		{ 
			return false; // returns false > stops the program from progressing 
		}
		if (password.contains("password")) // checks to see if the string contains "password"
		{ 
			return false; //returns false > stops the program from progressing
		}
		if (password.length()<8 ) // checks to see if the length of "password" is less than 8 characters long
		{ 
			return false; //returns false > stops the program from progressing
		}
		if (password.length() > 16) // checks to see if the length of "password" is greater than 16 characters long, 
		{
			return false; //returns false > stops the program from progressing
		}
		
		
		boolean IsValidCharacter; //creates a boolean called IsValidCharacter
		boolean IsUpperCase = false; //creates a boolean called IsUpperCase and assigns it as false by default
		boolean IsLowerCase = false; //creates a boolean called IsLowerCase and assigns it as false by default
		boolean IsNumber = false; //creates a boolean called IsNumber and assigns it as false by default
		
		String Alphabet = "abcdefghijklmnopqrstuvwxyz"; //creates a string called Alphabet and assigns it every letter of the alphabet
		
		
		for (int i = 0; i < password.length(); i++) // creates a for loop that loops as long as i is less than the length of password			
		{
			IsValidCharacter = false; //assigns IsValidCharacter as false
			
			if (Character.isDigit(password.charAt(i))) // goes through password and finds the i'th character and checks if it is a number, if it is, it will run the code contained inside the { }
			{
				IsValidCharacter = true; //assign IsValidCharacter as True
				IsNumber = true; //assign IsNumber as True
			}
			if (Character.isLetter(password.charAt(i))) //goes through password and finds the i'th character and checks if it is a Letter, if it is, it will run the code contained inside the { }
			{
				IsValidCharacter = true; //assigns IsValidCharacter as true
				
				if (Alphabet.indexOf(password.charAt(i))>=0) //looks through the string "Alphabet" for the i'th character, it is is greater than or equal to zero
				{
					IsLowerCase = true; //assign IsLowerCase as true
				}
				else //if the i'th character is < 0 run this
				{
					IsUpperCase =true;  // assigns IsUpperCase as true
				}
			}	
			if (password.charAt(i) == '!') // checks the i'th character of password for a !
			{
				IsValidCharacter = true; // if an ! is found in the string, return true
			}	
			if (password.charAt(i) == '£') // checks the i'th character of password for a £
			{
				IsValidCharacter = true; // if an £ is found in the string, return true
			}	
			if (password.charAt(i) == '$') // checks the i'th character of password for a $
			{
				IsValidCharacter = true; // if an $ is found in the string, return true
			}	
			if (password.charAt(i) == '%') // checks the i'th character of password for a %
			{
				IsValidCharacter = true; // if an % is found in the string, return true
			}	
			if (IsValidCharacter == false) // if IsValidCharacter is equal to false
			{
				return false;  //return false and stops the program from  progressing any further
			}		
		} 
		if (IsUpperCase && IsLowerCase && IsNumber)  // if IsUpperCase, IsLowerCase and IsNumber are all True
		{
			return true; //return true if the above if statement is met
		}
		else 
		{
			return false; //if the above if statement is not met, return false and end the process
		}
	}	
}