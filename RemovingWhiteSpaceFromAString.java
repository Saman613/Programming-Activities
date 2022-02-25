package removingWhiteSpaceFromAString;

import java.util.Scanner; // In order to make the user make an input in the console, I use the java package
// java.util.Scanner allows the function from the System.in

public class RemovingWhiteSpaceFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Removing White Spaces From A String
		
		Scanner sc = new Scanner(System.in);//this is from java.util.Scanner. It can produced values that is scanned
											// from a specific input stream
		
		System.out.println("Input The String: ");// I use the System.out.print to run the sentence "Input The String" on the console
		//Input the string: Hello Sir! Good Day :> . This Is My Output On Removing White Spaces From A String//
		System.out.println();//to create linebreak
		
		String input =sc.nextLine(); // the next.Line function is to continue to search through the input that is looking for a line separator
		String space = input.replaceAll("\\s", ""); // I also used the replaceAll on the input in order to replace each substrings of the String I used.
													
		System.out.println("String Before Replace: "+input);
		System.out.println("String Before Replace: "+space);

	
	}

}
