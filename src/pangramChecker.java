
//This program will check whether a string is Pangram or not
//Pangram - String that contains all letters in the English 
//alphabet ignoring case of the letter


public class pangramChecker {
	
	static int size = 26; //for no. of letters

	//function for checking the pangram
	static boolean isAllChar(String givenStr) 
	{
		//converting the given string to lower case
		givenStr = givenStr.toLowerCase();
		
		//boolean array to mark if letter is exist
		boolean [] marker = new boolean[size];
		
		int charIndex = 0;
		
		
		//traversing the given array
		for (int i = 0; i < givenStr.length(); i++) 
		{
			//is current letter is a letter
			if('a' <= givenStr.charAt(i) && givenStr.charAt(i)<='z') 
			{ 
				//get the difference of ASCII values of the characters
				charIndex = givenStr.charAt(i) - 'a';
				
				//set true if the letter exist
				marker[charIndex] = true;
				
			}
			
		}
		
		//traversing the marker array
		//if every index becomes true, 
		//then the string hold every letter of alphabet
		for(boolean index : marker)
		{
			if(!index)
			{
				return false;
			}
		}
		return true;
	}

	//Driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "How vexingly quick daft zebras jump!";
		
		if(isAllChar(input)) {
			System.out.println("The given String is an Pangram ");
		}
		else
		System.out.println("The given String is Not an Pangram ");
	}

}
