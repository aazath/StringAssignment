

public class reverseString {

	public static void main(String[] args) {
		//Reverse the string
		//iNeuron -> norueNi
		
		String input = "iNeuron";
		String target ="";
		
		for (int i = input.length() -1 ; i >= 0; i--) {
			target = target + input.charAt(i);
		}
		
		System.out.println(target);	

	}

}
