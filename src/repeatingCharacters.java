//This application will print the repeatedly occurring characters in a given string	
public class repeatingCharacters {

	public static void main(String[] args) {

		//Taking the input
		String str = "abcabc";
		
		int index = 0;
		//convert the input into char array
		char[] inp = str.toCharArray();
		
	    System.out.print("Repeatedly occuring characters are :");
		  for (int i = 0; i < str.length(); i++) 
		  {
		   for (int j = i + 1; j < str.length(); j++) 
		   {
		    if (inp[i] == inp[j]) 
		    {
		    	System.out.print(inp[j]);
		    	index +=1;
		    	break;
		    }
		   }
		  }
	}

}
