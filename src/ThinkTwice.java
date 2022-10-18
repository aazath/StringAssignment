
public class ThinkTwice {

	public static void main(String[] args) {
		String origin = "Think Twice";
		String target = "";
		
		//Reversing the given string preserving the space
		for (int i = origin.length()-1; i >=0; i--) {
			target = target + origin.charAt(i);
		}
		System.out.println(target);

	}

}
