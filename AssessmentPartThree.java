public class AssessmentPartThree {


	// The simplest form of encryption is the rotation cipher (also known as Caeser's Cipher)
	// An offset value is chosen to encrypt a message. Each letter is replaced by the
	// letter that that number of places away from it.
	// So if an offset value of 1 is chosen, each letter is replaced by the one after it
	// - so a becomes b, b becomes c, etc
	// If a value of -2 is chosen a becomes y, b becomes z and so on
	
		
	
	 public char enryptedCharacter(char theChar, int theOffset) 
	 {
		 // 05 - encryptedCharacter
		 // Complete this method so that it returns the encrypted character for
		 // theChar when and offset of theOffset is used
		 // So if theChar='m' and theOffset is 3 the method will return 'p'
		 // Lower case characters remain lower case, upper case remain upper case
		 // Any other characters are returned unchanged
		 	 
		 char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; // creates an array string string containing each letter of the alphabet
		 boolean upperCaseCharacter; //creates a boolean caleld uppercasecharacter 
		 
		 upperCaseCharacter = Character.isUpperCase(theChar); // makes uppercasecharacter equal to the uppercse value of theChar
		 theChar = Character.toLowerCase(theChar); //makes theChar equal to the lowercase value of theChar
		 
		 for (int i = 0 ; i < alphabet.length; i++) // creates a for loop that runs as long as i is less than the length of the array string alphabet
		 {
			 if (theChar == alphabet[i]) // if thechar is equal to the i'th value of alphabet
			 {
				 theOffset = theOffset + i; //makes the offset equal to theoffset plus the value of i
			 }
		 } 	 
	 
	 if (Character.isLetter(theChar)) //if theChar is a Letter
	 {
		 if (theOffset < 0) // if the value of theOffset is less than 0
		 {
			 theOffset = theOffset + 26; //makes theOffset equal to theOffset plus 26
		 }
		 if (theOffset > alphabet.length) // if the value of theOfset is greater than  the length of the string alphabet 
		 {
			 theOffset = theOffset - 26; //makes theOffset equal to theOffset - 26
		 }
		 else  //if none of the above if statements were met
		 {
			 theChar = alphabet[theOffset]; //makes thechar equal to the character in alphabet equal to the value of the offset
		 }
	 }
	 
	 else //if the previous if statement is not met
	 {
		 return theChar; //return the value of theChar
	 }
	 
	 if (upperCaseCharacter) // if uppercasecharacter has a value
	 {
		 theChar = Character.toUpperCase(theChar); //makes thechar equal to the uppercase value of thechar
	 }
	 
	 return theChar; //returns thechar
	 
	 }
	 
		///////////////////////////////////////////////////////////////////////
 
	 
		 
	 public String encryptedString(String theMessage, int theOffset)
	 {
		
		         // 06 - encryptedMessage
		         // Complete this method so that it uses encryptedCharacter to 
		         // return the encrypted version of theMessage using theOffset	
		 
		String output = "";
		
		for (char character : theMessage.toCharArray()) //creates a for loop that iterates the char "character" through theMessage.tochararray 
		{
			character = enryptedCharacter( character, theOffset); // makes letter equal to the value obtained when running the value of theMessage through the encryptedcharacter method above
			output = output + character; // makes output equal to output + letter
		}
		 
		 return output; // returns the value of output
	 }
}

	 
	 





