package checkingWhetherTwoStringsAreAnagram;

import java.util.Arrays;//this class is responsible for manipulating arrays like sorting and  seraching

public class CheckingWhetherTwoStringsAreAnagram {

	public static boolean isAnagram(String word1, String word2)//boolean refers is the statements are true or false
	{
	
		char[] firstWord = word1.toLowerCase().toCharArray();//toLowerCase is to make the words/char be lowerCase and toCharArray is to make a chr. Array 
		char[] secondWord = word2.toLowerCase().toCharArray();//So your chosen word will be converted into a Characters Array to know if their length is the same
															//as well as the letters that makes up the two given words
		
		Arrays.sort(firstWord);// this means that the firstWord are being sorted
		Arrays.sort(secondWord);// as well as to the secondWord
		
		return Arrays.equals(firstWord, secondWord);//Here the two sets of CharArray are being searched and sort if they have same length and letters
													//then the syetem will do its work to know if the word given are anagrams or not
		
		}
	
			public static void main(String[] args) {
				
				
				System.out.println(isAnagram("silent", "lidten"));	//isAnagram refers if the input words are anagrams or not by means of true/false
									// input here your chosen word
				
				
			
	}

}
