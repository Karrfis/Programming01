
public class AssessmentPartOne {

	public int biggestOfThree(int num1, int num2, int num3) 
	{
		// 01 - A Gentle Start
		// Debug this method so it passes the unit test.
		// Add comments beside any changes you make

		if (num1 > num2) // the logical error was fixed by changing the < around
		{
			if (num3 > num1) 
			{
				return num3;
			} else
			{
				return num1;
			}
		} else 
			{
		if (num3 > num2) 
		{
				return num3;
		} else 
			{
				return num2; // a semicolon was added to close the statement
			}
		}
	}

	public int sumNumbersBetween(int start, int end) {
		// 02 - Adding Across A Range
		// Complete this method so that it adds together all
		// the integers between start and end, but not including
		// start or end
		// This method should only deal with 0 and positive integers
		// This method should return -1 if it cannot calculate the result

		// You should comment your code explaining what each part does

		int sumOfSquares = 0; //creates an integer called sumofsquares

		if (start <= -1)  //if the value of start is less than or equal to -1
		{
			return -1; //the program returns as the value -1
		}

		if (end <= -1)  // if the value of end is less than or equal to -1
		{ // if  the program returns as the value -1
			return -1;
		}

		if (end - 1 <= start + 1) // if the value of end -1 is greater than or equal to start +1
		{
			return -1;  //the program returns as -1

		}

		for (int i = start + 1; i <= end - 1; i++) //creates a for loop that starts at the value of  the value of start +1 and iterates until it reaches the value of end -1
			
		{
			sumOfSquares = sumOfSquares + i; //the for loop will ad the value of i to the value of sum of squares and store it in sum of squares
		}

		return sumOfSquares; //once the for loop is finished, the program will return the value of sumofsquares
	}

}
