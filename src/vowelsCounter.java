//This application will print the numbers of vowels 
//and the number of consonants in the given string

import java.util.Scanner;

public class vowelsCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels =0;
		int consonants =0;
		String input;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sentence :");
		input = scan.nextLine();
		
		input = input.toLowerCase();
		
		for (int i = 0; i < input.length(); ++i) {
		      char ch = input.charAt(i);

		      // check if character is any of a, e, i, o, u
		      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		        vowels += 1;
		      }
		      else if((ch >= 'a' && ch <= 'z'))
		      {
		    	  consonants +=1;
		      }
		    }
		
		System.out.println("Number of Vowels in the input : " + vowels);
		System.out.println("Number of Consonants in the input : " + consonants);

	}

}
