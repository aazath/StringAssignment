//This application will sort the characters alphabetically in a given string

import java.util.Scanner;

public class alphabeticallySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str; //to hold the input
		int temp; //to hold the character temporarily
		Scanner scan = new Scanner(System.in);
		
		//take the input string
		System.out.println("Enter the String to Sort : ");
		str = scan.nextLine();
		
		System.out.println("The given String is : "+str);
		
		//converting the input string into char array
		char[] input = str.toCharArray();
		
		//traverse the input string
		for (int i = 0; i < input.length; i++) 
		{
			for (int j = i+1; j < input.length; j++) 
			{
				//compare the ASCII values of the characters
				if (Character.toLowerCase(input[i])>Character.toLowerCase(input[j]))
				{
					//swap the characters
					temp = input[i];
					input[i] = input[j];
					input[j]= (char) temp;
				}
			}
			
		}
		System.out.println("The Sorted Array of String is :" +String.valueOf(input));

	}

}
