import java.util.Scanner;

//This application will print the numbers of Special 
//characters in the given string

public class specialCharCounter {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int symbols =0;
			String input;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter a sentence with special characters :");
			input = scan.nextLine();
			
			input = input.toLowerCase();
			
			for (int i = 0; i < input.length(); ++i) {
			      char ch = input.charAt(i);

			      // check if character is any of !,@,#,$,%,^,&,*,",~
			      if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%'
			    		  ||ch == '^'||ch == '&'||ch == '*'||ch == '"'||ch == '~') {
			        symbols += 1;
			      }
			    }
			
			System.out.println("Number of Symbols in the input : " + symbols);

		}

}
