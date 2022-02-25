package _Checkingwhetherastringcontainsonlydigits;

import java.util.Scanner; // In order to make the user make an input in the console, I use the java package
//java.util.Scanner allows the function from the System.in

public class _Checkingwhetherastringcontainsonlydigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		
		String number=scan.nextLine();//this is from java.util.Scanner. It can produced values that is scanned
		// from a specific input stream
	
		if(isDigit(number)==false){// it will be read as if the digit or number that is input is false
			System.out.println(number +" " +"There no digit on this string.");//then this line will be printed in the console
			//samanthacute:>
		}else{//the else condition
		if(isDigit(number)==true) // it will be read as if the digit or number that is input is true
			//enter a string:1234567890
			System.out.println(number +" "+"There is digit in this string.");//then this line will be printed in the console
		}
		}
		
		public static boolean isDigit(String string) { //boolean refers to true or false
		for(int index = 0; index<string.length();index ++);//this refers to the processing of the If else stements/ conditions above
		int index = 0;
		if(Character.isDigit(string.charAt(index)))
			return true;
		return false;
		
		
	}

}
