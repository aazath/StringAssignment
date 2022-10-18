import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner (System.in);
	    
	    //taking input as lower case string
	    System.out.println("Enter the first String :");
	    String str1 = scan.nextLine().toLowerCase();
	    System.out.println("Enter the second String :");
	    String str2 = scan.nextLine().toLowerCase();
	    
	    //creating two character arrays
	    char[] one = new char[str1.length()];
	    char[] two = new char[str2.length()];
	    
	    //compare the two arrays' length are equal
	    if(str1.length()==str2.length()) {
	    	//converting the inputs to char array
		    one = str1.toCharArray();
		    two = str2.toCharArray();
		    
		    //sorting the arrays
		    Arrays.sort(one);
		    Arrays.sort(two);
		    
		    //checking both the arrays are anagram or not
		    if(Arrays.equals(one, two)) 
		    {
		        System.out.println(str1 + " and " + str2 + " are anagram.");
		    }
		    else
		    {
		    	System.out.println(str1 + " and " + str2 + " are not anagram.");
		    }
	    }
	    else
	    {
	    	System.out.println(str1 + " and " + str2 + " are not anagram.");	    	
	    }

	}

}

